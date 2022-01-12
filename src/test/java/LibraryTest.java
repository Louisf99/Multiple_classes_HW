import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    private Book book1, book2, book3, book4;
    private Library library;

    @Before
    public void before() {
        library = new Library(2);
        book1 = new Book("The Hunger Games", "Suzanne Collins", "Thriller");
        book2 = new Book("To Kill A Mockingbird", "Harper Lee", "Domestic fiction");
        book3 = new Book("fakeBook", "fakeAuthor", "Sci-Fi");
    }

    @Test
    public void libraryIsEmpty() {
        assertEquals(0, library.getNumberOfBooks());
    }

    @Test
    public void canAddBook() {
        library.addBook(book1);
        assertEquals(1, library.getNumberOfBooks());
    }

    @Test
    public void hasCapacity() {
        assertEquals(2, library.getCapacity());
    }

    @Test
    public void cannotAddBookIfStockIsFull(){
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        assertEquals(2, library.getNumberOfBooks());
    }

    @Test
    public void hasOneThrillerGenreBookAndOneSciFi() {
        library.addBook(book1);
        library.addBook(book3);
        assertEquals(1, library.numberOfBooksByGenre("Thriller"));
        assertEquals(1, library.numberOfBooksByGenre("Sci-Fi"));
    }

}
