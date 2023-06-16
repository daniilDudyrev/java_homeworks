package homework7.homework7_2;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter path to file:");
        String filePath = scanner.nextLine();

        try (Scanner fileScanner = new Scanner(new FileReader(filePath))) {
            int maxLength = 0;
            String longestLine = "";

            while (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine();
                if(line.length() > maxLength) {
                    maxLength = line.length();
                    longestLine = line;
                }
            }

            System.out.println("Longest line length: " + maxLength);
            System.out.println("Longest line: " + longestLine);

        } catch (IOException e) {
            System.out.println("Error while read file: " + e.getMessage());
        }
    }
}
