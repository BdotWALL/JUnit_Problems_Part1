import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;

@DisplayName("Book Testing")

class BookTest {


    @Test
    @DisplayName("Test to see if getTitle returns title")
     public void getTitle() {
        Book book = new Book("The 48 Laws of Power", 476,1998);
        assertEquals("The 48 Laws of Power", book.getName());
    }

    @Test
    @DisplayName("Test to see if getPageNum returns pages")
     public void getPageNum() {
        Book book = new Book("Fahrenheit 451", 196, 2003);
        Book book2 = new Book("Monster");
        assertEquals(196, book.getPages());
        assertEquals(0000, book2.getPages());
    }

    @Test
    @DisplayName("Test to see if getPubYear returns pubYear")
     public void getPubYear() {
        Book book = new Book("Dracula", 488,1897);
        Book book2 = new Book("As A Man Thinketh", 56);
        assertEquals(1897, book.getPubYear());
        assertEquals(0000, book2.getPubYear());

    }
}