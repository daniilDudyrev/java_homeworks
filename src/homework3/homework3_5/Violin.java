package homework3.homework3_5;

public class Violin extends MusicInstrument {
    private int stringsCount;

    public Violin(String name, int stringsCount) {
        super(name);
        this.stringsCount = stringsCount;
    }

    @Override
    public void sound() {
        super.sound();
        System.out.println("creak-creak");
    }

    @Override
    public void desc() {
        super.desc();
        System.out.println("Strings count: " + stringsCount);
    }

    @Override
    public void history() {
        super.history();
        System.out.println("Was invented at the beginning of the XVI century in northern Italy");
    }

    public int getStringsCount() {
        return stringsCount;
    }

    public void setStringsCount(int stringsCount) {
        this.stringsCount = stringsCount;
    }
}
