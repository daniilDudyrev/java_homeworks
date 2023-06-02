package homework3.homework3_4;

public class Car extends Device {
    private String brand;

    public Car(String name, String brand) {
        super(name);
        this.brand = brand;
    }

    @Override
    public void sound() {
        super.sound();
        System.out.println("Vroom-Vroom");
    }

    @Override
    public void desc() {
        super.desc();
        System.out.println("Brand: " + brand);
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
}