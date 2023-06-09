package homework5.homework5_3;

public class App {
    public static void main(String[] args) {
        TaxDatabase taxDatabase = new TaxDatabase();

        Person person1 = new Person("12345", "John Doe", "New York");
        person1.addFine(new Fine("Speeding", 100.0));
        person1.addFine(new Fine("Speeding", 100.0));
        person1.addFine(new Fine("Speeding", 100.0));
        taxDatabase.addPerson(person1);

        Person person2 = new Person("67890", "Jane Smith", "London");
        Fine fine1 = new Fine("Parking violation", 50.0);
        person2.addFine(new Fine("Tax evasion", 500.0));
        taxDatabase.addPerson(person2);

        taxDatabase.printAllData();

        taxDatabase.printDataByPersonId("12345");

        taxDatabase.printDataByFineType("Speeding");

        taxDatabase.printDataByCity("London");

        Person person3 = new Person("54321", "Alex Johnson", "Paris");
        taxDatabase.addPerson(person3);

        Fine fine2 = new Fine("Parking violation", 75.0);
        taxDatabase.addFine(person1, fine2);

        taxDatabase.removeFine(person2, fine1);

        person1.setName("John Smith");
        person1.getFines().get(0).setAmount(200.0);
    }
}
