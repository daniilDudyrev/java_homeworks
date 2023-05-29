package homework2.homework2_5;


public class App {
    public static void main(String[] args) {
        Book book1 = new Book("Book1", "Author1", 2000, "Publisher1", "Genre1", 111);
        book1.printBook();
        book1.inputBook("NewBook1", "NewAuthor1", 2000, "NewPublisher1", "NewGenre1", 111);
        book1.printBook();
        book1.inputBook("NewNewBook1", "NewNewAuthor1");
        book1.printBook();
    }
}
