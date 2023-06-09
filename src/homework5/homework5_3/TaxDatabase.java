package homework5.homework5_3;

import java.util.ArrayList;
import java.util.List;

public class TaxDatabase {
    private List<Person> persons;

    public TaxDatabase() {
        this.persons = new ArrayList<>();
    }

    public void addPerson(Person person) {
        persons.add(person);
    }

    public void removePerson(Person person) {
        persons.remove(person);
    }

    public void updatePerson(Person person, String newName, String newCity) {
        person.setName(newName);
        person.setCity(newCity);
    }

    public void addFine(Person person, Fine fine) {
        person.addFine(fine);
    }

    public void removeFine(Person person, Fine fine) {
        person.removeFine(fine);
    }

    public void updateFine(Fine fine, String newType, double newAmount) {
        fine.setType(newType);
        fine.setAmount(newAmount);
    }

    public void printAllData() {
        for (Person person : persons) {
            System.out.println("Person ID: " + person.getPersonId());
            System.out.println("Name: " + person.getName());
            System.out.println("City: " + person.getCity());
            System.out.println("Fines: ");
            for (Fine fine : person.getFines()) {
                System.out.println("Type: " + fine.getType());
                System.out.println("Amount: " + fine.getAmount());
            }
            System.out.println("----------------------");
        }
    }

    public void printDataByPersonId(String personId) {
        for (Person person : persons) {
            if (person.getPersonId().equals(personId)) {
                System.out.println("Person ID: " + person.getPersonId());
                System.out.println("Name: " + person.getName());
                System.out.println("City: " + person.getCity());
                System.out.println("Fines: ");
                for (Fine fine : person.getFines()) {
                    System.out.println("Type: " + fine.getType());
                    System.out.println("Amount: " + fine.getAmount());
                }
                return;
            }
        }
        System.out.println("Person with ID " + personId + " not found.");
    }

    public void printDataByFineType(String type) {
        for (Person person : persons) {
            for (Fine fine : person.getFines()) {
                if (fine.getType().equals(type)) {
                    System.out.println("Person ID: " + person.getPersonId());
                    System.out.println("Name: " + person.getName());
                    System.out.println("City: " + person.getCity());
                    System.out.println("Fine Type: " + fine.getType());
                    System.out.println("Amount: " + fine.getAmount());
                    System.out.println("----------------------");
                    break;
                }
            }
        }
    }

    public void printDataByCity(String city) {
        for (Person person : persons) {
            if (person.getCity().equals(city)) {
                System.out.println("Personal ID: " + person.getPersonId());
                System.out.println("Name: " + person.getName());
                System.out.println("City: " + person.getCity());
                System.out.println("Fines: ");
                for (Fine fine : person.getFines()) {
                    System.out.println("Type: " + fine.getType());
                    System.out.println("Amount: " + fine.getAmount());
                }
                System.out.println("----------------------");
            }
        }
    }
}
