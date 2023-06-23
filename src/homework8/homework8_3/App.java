package homework8.homework8_3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        List<Device> devices = new ArrayList<>();
        devices.add(new Device("Phone", 2020, 1500.0, "Black", "Mobile"));
        devices.add(new Device("Laptop", 2019, 2500.0, "Silver", "Laptop"));
        devices.add(new Device("Tablet", 2021, 1200.0, "White", "Mobile"));
        devices.add(new Device("TV", 2018, 3000.0, "Black", "Television"));

        Scanner scanner = new Scanner(System.in);

        devices.stream()
                .forEach(device -> System.out.println(device.getName()));

        System.out.println("Enter color: ");
        String color = scanner.nextLine();
        System.out.println("Devices with color " + color);
        devices.stream()
                .filter(device -> device.getColor().equals(color))
                .forEach(device -> System.out.println(device.getName()));


        System.out.println("Enter price: ");
        double price = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("Devices with price higher than " + price);
        devices.stream()
                .filter(device -> device.getPrice() > price)
                .forEach(device -> System.out.println(device.getName()));

        System.out.println("Enter type: ");
        String type = scanner.nextLine();
        System.out.println("Devices with type " + type);
        devices.stream()
                .filter(device -> device.getType().equals(type))
                .forEach(device -> System.out.println(device.getName()));

        System.out.println("Enter start year: ");
        int startYear = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter end year: ");
        int endYear = scanner.nextInt();
        System.out.println("Devices from year" + startYear + " to " + endYear);
        devices.stream()
                .filter(device -> device.getYearOfProduction() >= startYear && device.getYearOfProduction() <= endYear)
                .forEach(device -> System.out.println(device.getName()));
    }
}
