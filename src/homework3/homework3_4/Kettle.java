package homework3.homework3_4;

public class Kettle extends Device {
    private double capacity;

    public Kettle(String name, double capacity) {
        super(name);
        this.capacity = capacity;
    }

    @Override
    public void sound() {
        super.sound();
        System.out.println("Whistle");
    }

    @Override
    public void desc() {
        super.desc();
        System.out.println("Volume: " + capacity + " litres");
    }

    public double getCapacity() {
        return capacity;
    }

    public void setCapacity(double capacity) {
        this.capacity = capacity;
    }
}