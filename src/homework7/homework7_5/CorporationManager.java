package homework7.homework7_5;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CorporationManager {
    private List<Employee> employees;
    private String dataFile;

    public CorporationManager(String dataFile) {
        this.employees = new ArrayList<>();
        this.dataFile = dataFile;
        loadEmployeesFromFile();
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public void editEmployee(String lastName, Employee updatedEmployee) {
        for (Employee employee : employees) {
            if (employee.getLastName().equalsIgnoreCase(lastName)) {
                employee.setFirstName(updatedEmployee.getFirstName());
                employee.setLastName(updatedEmployee.getLastName());
                employee.setAge(updatedEmployee.getAge());
                System.out.println("Employee updated successfully.");
                return;
            }
        }
        System.out.println("Employee not found.");
    }

    public void deleteEmployee(String lastName) {
        for (Employee employee : employees) {
            if (employee.getLastName().equalsIgnoreCase(lastName)) {
                employees.remove(employee);
                System.out.println("Employee deleted successfully.");
                return;
            }
        }
        System.out.println("Employee not found.");
    }

    public void searchEmployeeByLastName(String lastName) {
        for (Employee employee : employees) {
            if (employee.getLastName().equalsIgnoreCase(lastName)) {
                System.out.println("Found employee: " + employee);
                return;
            }
        }
        System.out.println("Employee not found.");
    }

    public void printEmployeesByAge(int age) {
        for (Employee employee : employees) {
            if (employee.getAge() == age) {
                System.out.println(employee);
            }
        }
    }

    public void printEmployeesByLastNamePrefix(String prefix) {
        for (Employee employee : employees) {
            if (employee.getLastName().toLowerCase().startsWith(prefix.toLowerCase())) {
                System.out.println(employee);
            }
        }
    }

    public void saveEmployeesToFile() {
        try (PrintWriter writer = new PrintWriter(new FileWriter(dataFile))) {
            for (Employee employee : employees) {
                writer.println(employee.getFirstName() + "," + employee.getLastName() + "," + employee.getAge());
            }
            System.out.println("Data saved successfully.");
        } catch (IOException e) {
            System.out.println("Error while saving data: " + e.getMessage());
        }
    }

    private void loadEmployeesFromFile() {
        try (Scanner fileScanner = new Scanner(new FileReader(dataFile))) {
            while (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine();
                String[] data = line.split(",");
                if (data.length == 3) {
                    String firstName = data[0];
                    String lastName = data[1];
                    int age = Integer.parseInt(data[2]);
                    Employee employee = new Employee(firstName, lastName, age);
                    employees.add(employee);
                }
            }
            System.out.println("Data loaded successfully.");
        } catch (FileNotFoundException e) {
            System.out.println("Data file not found.");
        }
    }
}