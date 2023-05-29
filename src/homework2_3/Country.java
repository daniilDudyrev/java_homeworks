package homework2_3;

public class Country {
    private String name;
    private String capital;
    private int population;

    public Country() {
    }

    public Country(String name, String capital, int population) {
        this.name = name;
        this.capital = capital;
        this.population = population;
    }

    public void printInfo() {
        System.out.println("Country name: " + name + ", capital: " + capital + ", country population: " + population);
    }

    public void printInfo(String additionalInfo) {
        System.out.println("Country name: " + name + ", capital: " + capital + ", country population: " + population + " " + additionalInfo);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }
}