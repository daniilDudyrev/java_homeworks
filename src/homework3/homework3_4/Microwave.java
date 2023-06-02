package homework3.homework3_4;

public class Microwave extends Device {
    private int power;

    public Microwave(String name, int power) {
        super(name);
        this.power = power;
    }

    @Override
    public void sound() {
        super.sound();
        System.out.println("Pe-pe");
    }

    @Override
    public void desc() {
        super.desc();
        System.out.println("Power: " + power + " Vt");
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }
}
