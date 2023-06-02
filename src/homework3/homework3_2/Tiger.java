package homework3.homework3_2;

public class Tiger extends Animal {
    private String species;

    public Tiger(String name, String species) {
        super(name);
        this.species = species;
    }

    public void roar() {
        System.out.println("Roar");
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

}
