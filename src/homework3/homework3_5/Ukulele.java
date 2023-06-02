package homework3.homework3_5;

public class Ukulele extends MusicInstrument{
    private String type;

    public Ukulele(String name, String type) {
        super(name);
        this.type = type;
    }

    @Override
    public void sound() {
        super.sound();
        System.out.println("Tryn-tryn");
    }

    @Override
    public void desc() {
        super.desc();
        System.out.println("Type: " + type);
    }

    @Override
    public void history() {
        super.history();
        System.out.println("Appeared on the Hawaiian Islands in the second half of the XIX century");
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
