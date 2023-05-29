package homework2_6;

public class Car {
    private String name;
    private String manufacturer;
    private int year;
    private double engineVolume;

    public Car() {
    }

    public Car(String name, String manufacturer, int year, double engineVolume) {
        this.name = name;
        this.manufacturer = manufacturer;
        this.year = year;
        this.engineVolume = engineVolume;
    }

    public void inputCar(String name, String manufacturer, int year, double engineVolume) {
        this.name = name;
        this.manufacturer = manufacturer;
        this.year = year;
        this.engineVolume = engineVolume;
    }

    public void inputCar(String name, String manufacturer) {
        this.name = name;
        this.manufacturer = manufacturer;
    }

    public void printCar() {
        System.out.println("Name: " + name);
        System.out.println("Manufacturer: " + manufacturer);
        System.out.println("Year: " + year);
        System.out.println("Engine volume: " + engineVolume);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = engineVolume;
    }
}
