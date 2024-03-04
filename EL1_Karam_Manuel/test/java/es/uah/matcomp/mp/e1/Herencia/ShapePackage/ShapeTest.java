package es.uah.matcomp.mp.e1.Herencia.ShapePackage;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ShapeTest {

    @Test
    void getColor() {
        Shape f = new Shape();
        assertEquals("red", f.getColor());
    }

    @Test
    void setColor() {
        Shape f = new Shape();
        f.setColor("blue");
        assertEquals("blue", f.getColor());
    }

    @Test
    void isFilled() {
        Shape f = new Shape("green", false);
        assertEquals(false, f.isFilled());
    }

    @Test
    void setFilled() {
        Shape f = new Shape("green", false);
        f.setFilled(true);
        assertEquals(true, f.isFilled());
    }

    @Test
    void testToString() {
        Shape f = new Shape("green", false);
        assertEquals("Shape[color=green,filled=false]", f.toString());
    }
}