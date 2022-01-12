import java.util.ArrayList;

public class Borrower {

    private String name;
    private ArrayList<Book> books;

    public Borrower(String name) {
        this.name = name;
        this.books = new ArrayList<>();
    }

    public String getName() {
        return this.name;
    }

    public int getNumberOfBooks() {
        return this.books.size();
    }

    public void borrowBook(Book book, Library library) {
        if (library.removeBook(book)) {
            this.books.add(book);
        }
    }
}
