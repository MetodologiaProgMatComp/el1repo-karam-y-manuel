package es.uah.matcomp.mp.e1.Herencia.ShapePackage;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SquareTest {

    @Test
    void getSide() {
        Square s = new Square(1.0, "blue", false);
        assertEquals(1.0, s.getSide());
    }

    @Test
    void setSide() {
        Square s = new Square(2.0);
        s.setSide(3.0);
        assertEquals(3.0, s.getLength());
    }

    @Test
    void testToString() {
        Square s = new Square();
        assertEquals("Square[Rectangle[Shape[color=red,filled=true]," +
                "width=1.0,length=1.0]]", s.toString());
    }
}