package homework8.homework8_4;

class Projector {
    private String name;
    private int yearOfProduction;
    private double price;
    private String manufacturer;

    public Projector(String name, int yearOfProduction, double price, String manufacturer) {
        this.name = name;
        this.yearOfProduction = yearOfProduction;
        this.price = price;
        this.manufacturer = manufacturer;
    }

    public String getName() {
        return name;
    }

    public int getYearOfProduction() {
        return yearOfProduction;
    }

    public double getPrice() {
        return price;
    }

    public String getManufacturer() {
        return manufacturer;
    }
}
