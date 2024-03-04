package es.uah.matcomp.mp.e1.Herencia;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Point2DTest {

    @Test
    void testConstructorWithParameters() {
        Point2D point = new Point2D(3.5f, 4.2f);
        assertEquals(3.5f, point.getX());
        assertEquals(4.2f, point.getY());
    }

    @Test
    void testDefaultConstructor() {
        Point2D point = new Point2D();
        assertEquals(0.0f, point.getX());
        assertEquals(0.0f, point.getY());
    }

    @Test
    void testSetX() {
        Point2D point = new Point2D();
        point.setX(2.5f);
        assertEquals(2.5f, point.getX());
    }

    @Test
    void testSetY() {
        Point2D point = new Point2D();
        point.setY(3.7f);
        assertEquals(3.7f, point.getY());
    }

    @Test
    void testSetXY() {
        Point2D point = new Point2D();
        point.setXY(2.5f, 3.7f);
        assertEquals(2.5f, point.getX());
        assertEquals(3.7f, point.getY());
    }

    @Test
    void testGetXY() {
        Point2D point = new Point2D(2.5f, 3.7f);
        float[] expectedXY = {2.5f, 3.7f};
        assertArrayEquals(expectedXY, point.getXY());
    }

    @Test
    void testToString() {
        Point2D point = new Point2D(2.5f, 3.7f);
        String expectedString = "(2.5,3.7)";
        assertEquals(expectedString, point.toString());
    }
}