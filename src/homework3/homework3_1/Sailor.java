package homework3.homework3_1;

public class Sailor extends Human {
    private String shipType;

    public Sailor(String name, int age, String shipType) {
        super(name, age);
        this.shipType = shipType;
    }

    public void sail() {
        System.out.println("Sailor " + getName() + " Ship type: " + shipType);
    }

    public String getShipType() {
        return shipType;
    }

    public void setShipType(String shipType) {
        this.shipType = shipType;
    }

}
