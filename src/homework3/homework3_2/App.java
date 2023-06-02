package homework3.homework3_2;

public class App {
    public static void main(String[] args) {
        Tiger tiger = new Tiger("Tiger", "Bengal tiger");
        System.out.println("Name: " + tiger.getName());
        System.out.println("Species: " + tiger.getSpecies());
        tiger.eat();
        tiger.roar();
        System.out.println();

        Crocodile crocodile = new Crocodile("Crocodile", 80);
        System.out.println("Name: " + crocodile.getName());
        System.out.println("Teeth count: " + crocodile.getTeethCount());
        crocodile.eat();
        crocodile.swim();
        System.out.println();

        Kangaroo kangaroo = new Kangaroo("kangaroo", 2.5);
        System.out.println("Name: " + kangaroo.getName());
        System.out.println("Jump height: " + kangaroo.getJumpHeight());
        kangaroo.eat();
        kangaroo.jump();
    }
}
