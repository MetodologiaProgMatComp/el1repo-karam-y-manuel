package es.uah.matcomp.mp.e1.Herencia.ShapePackage;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RectangleTest {

    @Test
    void getWidth() {
        Rectangle r = new Rectangle();
        assertEquals(1.0, r.getWidth());
    }

    @Test
    void setWidth() {
        Rectangle r = new Rectangle(1.0,1.0);
        r.setWidth(2.0);
        assertEquals(2.0, r.getWidth());
    }

    @Test
    void getLength() {
        Rectangle r = new Rectangle(1.0,2.0,"red", false);
        assertEquals(2.0, r.getLength());
    }

    @Test
    void setLength() {
        Rectangle r = new Rectangle();
        r.setLength(14);
        assertEquals(14.0, r.getLength());
    }

    @Test
    void getArea() {
        Rectangle r = new Rectangle();
        double area = 1.0;
        assertEquals(area, r.getArea());
    }

    @Test
    void getPerimeter() {
        Rectangle r = new Rectangle();
        assertEquals(4.0, r.getPerimeter());
    }

    @Test
    void testToString() {
        Rectangle r = new Rectangle();
        assertEquals("Rectangle[Shape[color=red,filled=true]," +
                "width=1.0,length=1.0]", r.toString());

    }
}