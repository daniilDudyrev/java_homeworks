package homework8.homework8_4;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        List<Projector> projectors = new ArrayList<>();
        projectors.add(new Projector("Projector1", 2020, 1500.0, "Manufacturer1"));
        projectors.add(new Projector("Projector2", 2019, 2500.0, "Manufacturer2"));
        projectors.add(new Projector("Projector3", 2021, 1200.0, "Manufacturer1"));
        projectors.add(new Projector("Projector4", 2018, 3000.0, "Manufacturer3"));

        Scanner scanner = new Scanner(System.in);

        projectors.stream()
                .forEach(projector -> System.out.println(projector.getName()));

        System.out.println("Enter manufacturer: ");
        String manufacturer = scanner.nextLine();
        System.out.println("Projectors with manufacturer " + manufacturer);
        projectors.stream()
                .filter(projector -> projector.getManufacturer().equals(manufacturer))
                .forEach(projector -> System.out.println(projector.getName()));


        int currentYear = java.time.Year.now().getValue();
        projectors.stream()
                .filter(projector -> projector.getYearOfProduction() == currentYear)
                .forEach(projector -> System.out.println(projector.getName()));


        System.out.println("Enter price: ");
        double price = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("Projectors with price higher than " + price);
        projectors.stream()
                .filter(projector -> projector.getPrice() > price)
                .forEach(projector -> System.out.println(projector.getName()));


        System.out.println("Projectors sorted by price in ascending order");
        projectors.stream()
                .sorted(Comparator.comparingDouble(Projector::getPrice))
                .forEach(projector -> System.out.println(projector.getName()));


        System.out.println("Projectors sorted by price in descending order");
        projectors.stream()
                .sorted(Comparator.comparingDouble(Projector::getPrice).reversed())
                .forEach(projector -> System.out.println(projector.getName()));


        System.out.println("Projectors sorted by year in ascending order");
        projectors.stream()
                .sorted(Comparator.comparingInt(Projector::getYearOfProduction))
                .forEach(projector -> System.out.println(projector.getName()));


        System.out.println("Projectors sorted by year in descending order");
        projectors.stream()
                .sorted(Comparator.comparingInt(Projector::getYearOfProduction).reversed())
                .forEach(projector -> System.out.println(projector.getName()));
    }
}
