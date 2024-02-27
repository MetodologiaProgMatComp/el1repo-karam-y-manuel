package es.uah.matcomp.mp.e1.Agr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AuthorTest {

    @Test
    void getName() {
        Author a1 = new Author("Tan Ah Teck", "ahteck@nowhere.com");
        assertEquals("Tan Ah Teck", a1.getName());
    }
    @Test
    void getEmail() {
        Author a1 = new Author("Tan Ah Teck", "ahteck@nowhere.com");
        assertEquals("ahteck@nowhere.com", a1.getEmail());
    }
    @Test
    void setEmail() {
        Author a1 = new Author("Tan Ah Teck", "ahteck@nowhere.com");
        a1.setEmail("probando");
        assertEquals("probando", a1.getEmail());
    }
    @Test
    void testToString() {
        Author a1 = new Author("Tan Ah Teck", "ahteck@nowhere.com");
        assertEquals("Author[name=Tan Ah Teck,email=ahteck@nowhere.com]", a1.toString());
    }
}