package homework3.homework3_1;

public class Pilot extends Human {
    private String aircraftType;

    public Pilot(String name, int age, String aircraftType) {
        super(name, age);
        this.aircraftType = aircraftType;
    }

    public void fly() {
        System.out.println("Pilot " + getName() + " Aircraft type: " + aircraftType);
    }

    public String getAircraftType() {
        return aircraftType;
    }

    public void setAircraftType(String aircraftType) {
        this.aircraftType = aircraftType;
    }

}
