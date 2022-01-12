import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookTest {

    private Book book;

    @Before
    public void before() {
        book = new Book("The Hunger Games", "Suzanne Collins", "Thriller");
    }

    @Test
    public void hasTitle() {
        assertEquals("The Hunger Games", book.getTitle());
    }

    @Test
    public void hasAuthor() {
        assertEquals("Suzanne Collins", book.getAuthor());
    }

    @Test
    public void hasGenre() {
        assertEquals("Thriller", book.getGenre());
    }

}
