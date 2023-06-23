package homework8.homework8_3;

class Device {
    private String name;
    private int yearOfProduction;
    private double price;
    private String color;
    private String type;

    public Device(String name, int yearOfProduction, double price, String color, String type) {
        this.name = name;
        this.yearOfProduction = yearOfProduction;
        this.price = price;
        this.color = color;
        this.type = type;
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

    public String getColor() {
        return color;
    }

    public String getType() {
        return type;
    }
}
