package homework3.homework3_5;

public class App {
    public static void main(String[] args) {
        Violin violin = new Violin("violin", 4);
        Trombone trombone = new Trombone("Trombone", "Bass");
        Ukulele ukulele = new Ukulele("Ukulele", "Soprano");
        Cello cello = new Cello("Cello", 79);

        violin.sound();
        violin.show();
        violin.desc();
        violin.history();

        trombone.sound();
        trombone.show();
        trombone.desc();
        trombone.history();

        ukulele.sound();
        ukulele.show();
        ukulele.desc();
        ukulele.history();

        cello.sound();
        cello.show();
        cello.desc();
        cello.history();
    }
}

