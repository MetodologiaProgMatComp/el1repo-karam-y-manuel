package es.uah.matcomp.mp.e1.Herencia.ShapePackage;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CircleTest {

    @Test
    void getRadius() {
        Circle c = new Circle(20);
        assertEquals(20, c.getRadius());
    }

    @Test
    void setRadius() {
        Circle c = new Circle();
        c.setRadius(30);
        assertEquals(30, c.getRadius());
    }

    @Test
    void getArea() {
        Circle c = new Circle(20, "red", true);
        double expectedArea = 20 * 20 * Math.PI;
        assertEquals(expectedArea, c.getArea());
    }

    @Test
    void getPerimeter() {
        Circle c = new Circle(20);
        double expectedPer = 20 * 2 * Math.PI;
        assertEquals(expectedPer, c.getPerimeter());
    }

    @Test
    void testToString() {
        Circle c = new Circle(20, "red", true);
        assertEquals("Circle[Shape[color=red,filled=true],radius=20.0]", c.toString());
    }
}