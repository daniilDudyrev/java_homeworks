package homework3.homework3_4;

public class App {
    public static void main(String[] args) {
        Kettle kettle = new Kettle("Kettle", 1.7);
        Microwave microwave = new Microwave("Microwave", 800);
        Car car = new Car("Car", "Toyota");
        Steamboat steamboat = new Steamboat("Steamboat", 200);

        kettle.sound();
        kettle.show();
        kettle.desc();

        microwave.sound();
        microwave.show();
        microwave.desc();

        car.sound();
        car.show();
        car.desc();

        steamboat.sound();
        steamboat.show();
        steamboat.desc();
    }
}
