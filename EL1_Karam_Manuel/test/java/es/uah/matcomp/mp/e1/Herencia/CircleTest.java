package es.uah.matcomp.mp.e1.Herencia;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CircleTest {

    @org.junit.jupiter.api.Test
    void getRadius() {
        Circle c = new Circle(20);
        assertEquals(20, c.getRadius());
    }

    @org.junit.jupiter.api.Test
    void setRadius() {
        Circle c = new Circle();
        c.setRadius(30);
        assertEquals(30, c.getRadius());
    }

    @org.junit.jupiter.api.Test
    void getArea() {
        Circle c = new Circle(20, "red");
        double expectedArea = 20 * 20 * Math.PI;
        assertEquals(expectedArea, c.getArea());
    }
    @org.junit.jupiter.api.Test
    void getCircumference() {
        Circle c = new Circle(20);
        double expectedPer = 20 * 2 * Math.PI;
        assertEquals(expectedPer, c.getCircumference());
    }

    @org.junit.jupiter.api.Test
    void testToString() {
        Circle c = new Circle();
        assertEquals("Circle[radius=1.0,color=red]", c.toString());
    }
}