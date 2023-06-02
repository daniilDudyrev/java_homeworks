package homework3.homework3_2;

public class Crocodile extends Animal {
    private int teethCount;

    public Crocodile(String name, int teethCount) {
        super(name);
        this.teethCount = teethCount;
    }

    public void swim() {
        System.out.println("Swim");
    }

    public int getTeethCount() {
        return teethCount;
    }

    public void setTeethCount(int teethCount) {
        this.teethCount = teethCount;
    }


}
