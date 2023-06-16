package homework7.homework7_5;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter data file path:");
        String dataFile = scanner.nextLine();

        CorporationManager corporationManager = new CorporationManager(dataFile);

        while (true) {
            System.out.println("1. Add employee");
            System.out.println("2. Edit employee");
            System.out.println("3. Delete employee");
            System.out.println("4. Search employee by last name");
            System.out.println("5. Print employees by age");
            System.out.println("6. Print employees by last name prefix");
            System.out.println("7. Save data to file");
            System.out.println("0. Exit");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1 -> {
                    System.out.println("Enter employee details:");
                    System.out.print("First name: ");
                    String firstName = scanner.nextLine();
                    System.out.print("Last name: ");
                    String lastName = scanner.nextLine();
                    System.out.print("Age: ");
                    int age = scanner.nextInt();
                    scanner.nextLine();
                    Employee newEmployee = new Employee(firstName, lastName, age);
                    corporationManager.addEmployee(newEmployee);
                }
                case 2 -> {
                    System.out.print("Enter the last name of the employee to edit: ");
                    String editLastName = scanner.nextLine();
                    System.out.println("Enter updated employee details:");
                    System.out.print("First name: ");
                    String updatedFirstName = scanner.nextLine();
                    System.out.print("Last name: ");
                    String updatedLastName = scanner.nextLine();
                    System.out.print("Age: ");
                    int updatedAge = scanner.nextInt();
                    scanner.nextLine();
                    Employee updatedEmployee = new Employee(updatedFirstName, updatedLastName, updatedAge);
                    corporationManager.editEmployee(editLastName, updatedEmployee);
                }
                case 3 -> {
                    System.out.print("Enter the last name of the employee to delete: ");
                    String deleteLastName = scanner.nextLine();
                    corporationManager.deleteEmployee(deleteLastName);
                }
                case 4 -> {
                    System.out.print("Enter the last name of the employee to search: ");
                    String searchLastName = scanner.nextLine();
                    corporationManager.searchEmployeeByLastName(searchLastName);
                }
                case 5 -> {
                    System.out.print("Enter the age to filter employees: ");
                    int searchAge = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Employees with age " + searchAge + ":");
                    corporationManager.printEmployeesByAge(searchAge);
                }
                case 6 -> {
                    System.out.print("Enter the last name prefix to filter employees: ");
                    String prefix = scanner.nextLine();
                    System.out.println("Employees with last name starting with '" + prefix + "':");
                    corporationManager.printEmployeesByLastNamePrefix(prefix);
                }
                case 7 -> corporationManager.saveEmployeesToFile();
                case 0 -> {
                    corporationManager.saveEmployeesToFile();
                    System.out.println("Exiting the program. Data saved to file.");
                    return;
                }
                default -> System.out.println("Invalid choice. Please enter a valid option.");
            }
        }
    }
}
