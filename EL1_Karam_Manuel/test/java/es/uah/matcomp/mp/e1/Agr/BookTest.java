package es.uah.matcomp.mp.e1.Agr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
class BookTest {

    @Test
    void getIsbn() {
        Author a1 = new Author("Tan Ah Teck", "ahteck@nowhere.com");
        Book b1 = new Book("12345", "Java for dummies", a1, 8.8);
        assertEquals("12345", b1.getIsbn());
    }
    @Test
    void getName() {
        Author a1 = new Author("Tan Ah Teck", "ahteck@nowhere.com");
        Book b1 = new Book("12345", "Java for dummies", a1, 8.8, 88);
        assertEquals("Java for dummies", b1.getName());
    }
    @Test
    void getAuthor() {
        Author a1 = new Author("Tan Ah Teck", "ahteck@nowhere.com");
        Book b1 = new Book("12345", "Java for dummies", a1, 8.8, 88);
        assertEquals(a1, b1.getAuthor());
    }
    @Test
    void getPrice() {
        Author a1 = new Author("Tan Ah Teck", "ahteck@nowhere.com");
        Book b1 = new Book("12345", "Java for dummies", a1, 8.8, 88);
        assertEquals(8.8, b1.getPrice());
    }
    @Test
    void setPrice() {
        Author a1 = new Author("Tan Ah Teck", "ahteck@nowhere.com");
        Book b1 = new Book("12345", "Java for dummies", a1, 8.8, 88);
        b1.setPrice(10);
        assertEquals(10, b1.getPrice());
    }
    @Test
    void getQty() {
        Author a1 = new Author("Tan Ah Teck", "ahteck@nowhere.com");
        Book b1 = new Book("12345", "Java for dummies", a1, 8.8, 88);
        assertEquals(88, b1.getQty());
    }
    @Test
    void setQty() {
        Author a1 = new Author("Tan Ah Teck", "ahteck@nowhere.com");
        Book b1 = new Book("12345", "Java for dummies", a1, 8.8, 88);
        b1.setQty(10);
        assertEquals(10, b1.getQty());
    }
    @Test
    void getAuthorName() {
        Author a1 = new Author("Tan Ah Teck", "ahteck@nowhere.com");
        Book b1 = new Book("12345", "Java for dummies", a1, 8.8, 88);
        assertEquals("Tan Ah Teck", b1.getAuthorName());
    }
    @Test
    void testToString() {
        Author a1 = new Author("Tan Ah Teck", "ahteck@nowhere.com");
        Book b1 = new Book("12345", "Java for dummies", a1, 8.8, 88);
        assertEquals("Book[isbn=12345,name=Java for dummies,Author[name=Tan Ah" +
                " Teck,email=ahteck@nowhere.com],price=8.8,qty=88]", b1.toString());
    }
}