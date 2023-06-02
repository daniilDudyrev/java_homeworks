package homework3.homework3_2;

public class Kangaroo extends Animal {
    private double jumpHeight;

    public Kangaroo(String name, double jumpHeight) {
        super(name);
        this.jumpHeight = jumpHeight;
    }

    public void jump() {
        System.out.println("Jump");
    }

    public double getJumpHeight() {
        return jumpHeight;
    }

    public void setJumpHeight(double jumpHeight) {
        this.jumpHeight = jumpHeight;
    }

}
