package homework2_1;

public class App {
    public static void main(String[] args) {
        Human human1 = new Human();
        human1.setName("First");
        human1.setSurname("Human");
        human1.setAge(20);
        human1.introduce();

        Human human2 = new Human("Second", "Human", 25);
        human2.introduce("Im a student");
    }
}
