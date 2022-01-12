import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BorrowerTest {

    private Borrower susan;
    private Book book;
    private Library library;

    @Before
    public void before() {
        susan = new Borrower("Susan");
        book = new Book("The Hunger Games", "Suzanne collins", "Thriller");
        library = new Library(5);
        library.addBook(book);
    }

    @Test
    public void hasName(){
        assertEquals("Susan", susan.getName());
    }

    @Test
    public void canBorrowBook() {
        susan.borrowBook(book, library);
        assertEquals(0, library.getNumberOfBooks());
        assertEquals(1, susan.getNumberOfBooks());
    }
}
