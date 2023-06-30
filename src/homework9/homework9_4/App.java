package homework9.homework9_4;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {


    public static void main(String[] args) throws InterruptedException, IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter path to the directory: ");
        String directoryPath = scanner.nextLine();
        System.out.println("Enter word to search: ");
        String searchWord = scanner.nextLine();

        var t1 = new Thread(() -> {
            try {
                List<File> foundFiles = searchFiles(directoryPath, searchWord);
                mergeFilesContent(foundFiles, "merged_file.txt");
            } catch (IOException e) {
                e.printStackTrace();
            }
        });

        var t2 = new Thread(() -> {
            try {
                t1.join();
                List<String> forbiddenWords = loadForbiddenWords("forbidden_words.txt");
                censorFileContent("merged_file.txt", forbiddenWords);
                int mergedFilesCount = countLines("merged_file.txt");
                System.out.println("Files merged: " + mergedFilesCount);
            } catch (InterruptedException | IOException e) {
                e.printStackTrace();
            }
        });

        t1.start();
        t2.start();
    }

    private static List<File> searchFiles(String directoryPath, String searchWord) throws IOException {
        List<File> foundFiles = new ArrayList<>();
        File directory = new File(directoryPath);
        if (directory.isDirectory()) {
            File[] files = directory.listFiles();
            if (files != null) {
                for (File file : files) {
                    if (file.isFile() && file.getName().endsWith(".txt")) {
                        try (Scanner fileScanner = new Scanner(file)) {
                            while (fileScanner.hasNextLine()) {
                                String line = fileScanner.nextLine();
                                if (line.contains(searchWord)) {
                                    foundFiles.add(file);
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        }
        return foundFiles;
    }

    private static void mergeFilesContent(List<File> files, String mergedFilePath) throws IOException {
        try (PrintWriter writer = new PrintWriter(new FileWriter(mergedFilePath))) {
            for (File file : files) {
                try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
                    String line;
                    while ((line = reader.readLine()) != null) {
                        writer.println(line);
                    }
                }
            }
        }
    }

    private static List<String> loadForbiddenWords(String filePath) throws IOException {
        List<String> forbiddenWords = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                forbiddenWords.add(line);
            }
        }
        return forbiddenWords;
    }

    private static void censorFileContent(String sourceFilePath, List<String> forbiddenWords) throws IOException {
        File file = new File(sourceFilePath);
        File tempFile = new File("temp_file.txt");
        try (BufferedReader reader = new BufferedReader(new FileReader(file));
             PrintWriter writer = new PrintWriter(new FileWriter(tempFile))) {

            String line;
            while ((line = reader.readLine()) != null) {
                for (String forbiddenWord : forbiddenWords) {
                    line = line.replaceAll(forbiddenWord, "");
                }
                writer.println(line);
            }
        }

        if (file.delete()) {
            if (!tempFile.renameTo(file)) {
                throw new IOException("Failed to rename temporary file.");
            }
        } else {
            throw new IOException("Failed to delete original file.");
        }
    }

    private static int countLines(String filePath) throws IOException {
        int count = 0;
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            while (reader.readLine() != null) {
                count++;
            }
        }
        return count;
    }
}
