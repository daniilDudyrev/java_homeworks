package homework3.homework3_1;

public class App {
    public static void main(String[] args) {
        Builder builder = new Builder("John", 30, "Architecture");
        builder.build();

        Pilot pilot = new Pilot("Daniel", 40, "Boeing 747");
        pilot.fly();

        Sailor sailor = new Sailor("Robert", 35, "Bulker");
        sailor.sail();
    }
}
