package homework2.homework2_2;

public class City {
    private String name;
    private int population;

    public City() {}

    public City(String name, int population) {
        this.name = name;
        this.population = population;
    }

    public void printInfo() {
        System.out.println("City name: " + name + ", city population: " + population);
    }

    public void printInfo(String additionalInfo) {
        System.out.println("City name: " + name + ", city population: " + population + " " + additionalInfo);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }
}
