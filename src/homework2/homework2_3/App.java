package homework2.homework2_3;

public class App {
    public static void main(String[] args) {
        Country country1 = new Country();
        country1.setName("Russia");
        country1.setCapital("Moscow");
        country1.setPopulation(11111111);
        country1.printInfo();

        Country country2 = new Country("France", "Paris", 12312312);
        country2.printInfo("Paris became one of the first cities in the world to install street lights");
    }
}
