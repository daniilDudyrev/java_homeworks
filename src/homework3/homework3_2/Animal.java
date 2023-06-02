package homework3.homework3_2;

public class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public void eat() {
        System.out.println("Eat");
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
