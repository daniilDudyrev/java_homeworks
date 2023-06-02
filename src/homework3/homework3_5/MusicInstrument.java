package homework3.homework3_5;

public class MusicInstrument {
    private String name;

    public MusicInstrument(String name) {
        this.name = name;
    }

    public void sound() {
        System.out.println("Instrument sound: " + name);
    }

    public void show() {
        System.out.println("Instrument name: " + name);
    }

    public void desc() {
        System.out.println("Instrument description: " + name);
    }

    public void history() {
        System.out.println("Instrument history: " + name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
