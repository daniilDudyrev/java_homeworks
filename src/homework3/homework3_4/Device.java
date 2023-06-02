package homework3.homework3_4;

public class Device {
    private String name;

    public Device(String name) {
        this.name = name;
    }

    public void sound() {
        System.out.println("Device sound: " + name);
    }

    public void show() {
        System.out.println("Device name: " + name);
    }

    public void desc() {
        System.out.println("Device description: " + name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}