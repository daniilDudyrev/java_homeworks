package homework7.homework7_1;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter path to first file:");
        String filePath1 = scanner.nextLine();

        System.out.println("Enter path to second file:");
        String filePath2 = scanner.nextLine();

        try (Scanner fileScanner1 = new Scanner(new FileReader(filePath1));
             Scanner fileScanner2 = new Scanner(new FileReader(filePath2))) {

            while (fileScanner1.hasNextLine() && fileScanner2.hasNextLine()) {
                String line1 = fileScanner1.nextLine();
                String line2 = fileScanner2.nextLine();

                if (!line1.equals(line2)) {
                    System.out.println("Mismatched line from first file: " + line1);
                    System.out.println("Mismatched line from second file: " + line2);
                    return;
                }
            }

            if (fileScanner1.hasNextLine() || fileScanner2.hasNextLine()) {
                System.out.println("Files have different number of lines.");
            } else {
                System.out.println("Files are identical.");
            }

        } catch (IOException e) {
            System.out.println("Error while read file: " + e.getMessage());
        }
    }
}
