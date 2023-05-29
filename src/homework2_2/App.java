package homework2_2;

public class App {
    public static void main(String[] args) {
        City city1 = new City();
        city1.setName("Moscow");
        city1.setPopulation(11111111);
        city1.printInfo();

        City city2 = new City("Tokyo", 12312312);
        city2.printInfo(" city is located in Japan");
    }
}
