package homework9.homework9_3;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;

public class FileManager extends Thread{
    public static int filesCopied = 0;
    public static int directoriesCopied = 0;


    @Override
    public void run() {

        initDirs();
    }

    private void copyDirectory(File sourceDir, File targetDir) throws IOException {
        if(!targetDir.exists()){
            targetDir.mkdir();
            directoriesCopied++;
        }
        File[] files = sourceDir.listFiles();
        if(files != null){
            for(File file: files) {
                String newFilePath = targetDir.getPath() + File.pathSeparator + file.getName();
                if(file.isDirectory()){
                    File newDir = new File(newFilePath);
                    copyDirectory(file, newDir);
                } else {
                    Path sourcePath = file.toPath();
                    Path targetPath = new File(newFilePath).toPath();
                    Files.copy(sourcePath, targetPath, StandardCopyOption.REPLACE_EXISTING);
                    filesCopied++;
                }
            }
        }
    }

    private void initDirs() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("Existing path");
            String sourceDir = reader.readLine();
            System.out.println("Target path");
            String targetPath = reader.readLine();

            File sourceDirectory = new File(sourceDir);
            File targetDirectory = new File(targetPath);

            if(!sourceDirectory.exists() || !sourceDirectory.isDirectory()){
                System.out.println("Not dir, not exists");
                return;
            }
            copyDirectory(sourceDirectory, targetDirectory);

            System.out.println("files copied: " + FileManager.filesCopied);
            System.out.println("dirs copied: " + FileManager.directoriesCopied);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
