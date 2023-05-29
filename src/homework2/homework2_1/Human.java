package homework2.homework2_1;

public class Human {
    private String name;
    private String surname;
    private int age;

    public Human() {}

    public Human(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public void introduce() {
        System.out.println("Hello, my name is " + name + " " + surname + ".");
    }

    public void introduce(String additionalInfo) {
        System.out.println("Hello, my name is " + name + " " + surname + ". " + additionalInfo);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
