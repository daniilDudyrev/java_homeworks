package homework3.homework3_4;

public class Steamboat extends Device {
    private int capacity;

    public Steamboat(String name, int capacity) {
        super(name);
        this.capacity = capacity;
    }

    @Override
    public void sound() {
        super.sound();
        System.out.println("Tu-tu");
    }

    @Override
    public void desc() {
        super.desc();
        System.out.println("Capacity: " + capacity + " passengers");
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
}
