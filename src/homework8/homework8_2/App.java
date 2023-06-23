package homework8.homework8_2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(new Product("Яблоко", "Фрукты"));
        products.add(new Product("Банан", "Фрукты"));
        products.add(new Product("Апельсин", "Фрукты"));
        products.add(new Product("Молоко", "Молоко"));
        products.add(new Product("Хлеб", "Выпечка"));
        products.add(new Product("Сыр", "Молоко"));

        System.out.println("Все продукты:");
        products.stream()
                .map(Product::getName)
                .forEach(System.out::println);

        System.out.println("Продукты с названием меньше 5 букв:");
        products.stream()
                .map(Product::getName)
                .filter(name -> name.length() < 5)
                .forEach(System.out::println);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите название продукта(с заглавной): ");
        String userInput = scanner.nextLine();
        long count = products.stream()
                .filter(product -> product.getName().equals(userInput))
                .count();
        System.out.println("Продукт " + userInput + " встречается: " + count);

        System.out.print("Введите первую букву(заглавную): ");
        char startingLetter = scanner.nextLine().charAt(0);
        System.out.println("Продукты, которые начинаются с буквы " + startingLetter + ":");
        products.stream()
                .map(Product::getName)
                .filter(name -> name.charAt(0) == startingLetter)
                .forEach(System.out::println);

        String category = "Молоко";
        System.out.println("Продукты с категорией " + category + ":");
        products.stream()
                .filter(product -> product.getCategory().equals(category))
                .map(Product::getName)
                .forEach(System.out::println);
    }
}
