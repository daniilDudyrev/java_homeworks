package homework5.homework5_2;

import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        EngRusDictionary dictionary = new EngRusDictionary();
        Scanner scanner = new Scanner(System.in);

        dictionary.addWord("house", "дом");
        dictionary.addWord("phone", "телефон");
        dictionary.addWord("animal", "животное");

        while (true) {
            System.out.println("Input number:");
            System.out.println("1)Add word");
            System.out.println("2)Update word");
            System.out.println("3)Remove word");
            System.out.println("4)Add translate for word");
            System.out.println("5)Update translate for word");
            System.out.println("6)Remove translate for word");
            System.out.println("7)Show translate for word");
            System.out.println("8)Show popular and unpopular word");
            System.out.println("0)Exit");
            int userChoice = scanner.nextInt();
            scanner.nextLine();

            if (userChoice == 1) {
                System.out.println("Input english word");
                String inputEngWord = scanner.nextLine();
                System.out.println("Input translate");
                String inputTranslate = scanner.nextLine();
                dictionary.addWord(inputEngWord, inputTranslate);
            }

            else if (userChoice == 2) {
                System.out.println("Input english word");
                String inputEngWord = scanner.nextLine();
                System.out.println("Input updated word");
                String inputNewWord = scanner.nextLine();
                dictionary.updateWord(inputEngWord, inputNewWord);
            }

            else if (userChoice == 3) {
                System.out.println("Input english word");
                String inputEngWord = scanner.nextLine();
                dictionary.removeWord(inputEngWord);
            }

            else if (userChoice == 4) {
                System.out.println("Input english word");
                String inputEngWord = scanner.nextLine();
                System.out.println("Input translate");
                String inputTranslate = scanner.nextLine();
                dictionary.addTranslation(inputEngWord, inputTranslate);
            }

            else if (userChoice == 5) {
                System.out.println("Input english word");
                String inputEngWord = scanner.nextLine();
                System.out.println("Input translate");
                String inputTranslate = scanner.nextLine();
                dictionary.updateTranslation(inputEngWord, inputTranslate);
            }

            else if (userChoice == 6) {
                System.out.println("Input english word");
                String inputEngWord = scanner.nextLine();
                dictionary.removeTranslation(inputEngWord);
            }

            else if (userChoice == 7) {
                System.out.println("Input english word");
                String inputEngWord = scanner.nextLine();
                dictionary.showWord(inputEngWord);
                dictionary.incrementWordCount(inputEngWord);
            }

            else if (userChoice == 8) {
                List<String> popularWords = dictionary.getPopularWords();
                System.out.println("\nTop 10 popular words:");
                for (String word : popularWords) {
                    System.out.println(word + " - Count: " + dictionary.getWordCount().get(word));
                }

                List<String> unpopularWords = dictionary.getUnpopularWords();
                System.out.println("\nTop 10 unpopular words:");
                for (String word : unpopularWords) {
                    System.out.println(word + " - Count: " + dictionary.getWordCount().get(word));
                }
            }

            else if (userChoice == 0) {
                break;
            }
        }
    }
}
