package homework3.homework3_5;

public class Trombone extends MusicInstrument{
    private String type;

    public Trombone(String name, String type) {
        super(name);
        this.type = type;
    }

    @Override
    public void sound() {
        super.sound();
        System.out.println("Boo-boo");
    }

    @Override
    public void desc() {
        super.desc();
        System.out.println("Type: " + type);
    }

    @Override
    public void history() {
        super.history();
        System.out.println("Was invented at the XV century");
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
