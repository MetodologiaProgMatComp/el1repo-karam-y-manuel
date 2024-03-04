package es.uah.matcomp.mp.e1.Herencia;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Point3DTest {

    @Test
    void testConstructorWithParameters() {
        Point3D point = new Point3D(3.5f, 4.2f, 2.0f);
        assertEquals(3.5f, point.getX());
        assertEquals(4.2f, point.getY());
        assertEquals(2.0f, point.getZ());
    }

    @Test
    void testDefaultConstructor() {
        Point3D point = new Point3D();
        assertEquals(0.0f, point.getX());
        assertEquals(0.0f, point.getY());
        assertEquals(0.0f, point.getZ());
    }

    @Test
    void testSetZ() {
        Point3D point = new Point3D();
        point.setZ(3.7f);
        assertEquals(3.7f, point.getZ());
    }

    @Test
    void testSetXYZ() {
        Point3D point = new Point3D();
        point.setXYZ(2.5f, 3.7f, 4.8f);
        assertEquals(2.5f, point.getX());
        assertEquals(3.7f, point.getY());
        assertEquals(4.8f, point.getZ());
    }

    @Test
    void testGetXYZ() {
        Point3D point = new Point3D(2.5f, 3.7f, 4.8f);
        float[] expectedXYZ = {2.5f, 3.7f, 4.8f};
        assertArrayEquals(expectedXYZ, point.getXYZ());
    }

    @Test
    void testToString() {
        Point3D point = new Point3D(2.5f, 3.7f, 4.8f);
        String expectedString = "(2.5,3.7,4.8)";
        assertEquals(expectedString, point.toString());
    }
}