import java.util.ArrayList;
import java.util.HashMap;

public class Library {

    private int capacity;
    private ArrayList<Book> books;
    private HashMap<String, Integer> booksByGenre;

    public Library(int capacity) {
        this.capacity = capacity;
        this.books = new ArrayList<>();
        this.booksByGenre = new HashMap();
    }

    public int getCapacity() {
        return this.capacity;
    }

    public int getNumberOfBooks() {
        return this.books.size();
    }

    public void addBook(Book book) {
        if (this.hasCapacity()) {
            this.books.add(book);
            if (this.booksByGenre.containsKey(book.getGenre())) {
                this.booksByGenre.replace(book.getGenre(), booksByGenre.get(book.getGenre())+1);
            } else {
                this.booksByGenre.put(book.getGenre(), 1);
            }
        }
    }

    public boolean hasCapacity() {
        return this.books.size() < this.capacity;
    }

    public boolean removeBook(Book book) {
        return this.books.remove(book);
    }

    public int numberOfBooksByGenre(String genre) {
        return this.booksByGenre.get(genre);
    }
}
