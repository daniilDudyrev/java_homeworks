package homework3.homework3_5;

public class Cello extends MusicInstrument {
    private int size;

    public Cello(String name, int size) {
        super(name);
        this.size = size;
    }

    @Override
    public void sound() {
        super.sound();
        System.out.println("Pam-pam");
    }

    @Override
    public void desc() {
        super.desc();
        System.out.println("Size: " + size);
    }

    @Override
    public void history() {
        super.history();
        System.out.println("Appearance dates back to the beginning of the XVI century");
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
