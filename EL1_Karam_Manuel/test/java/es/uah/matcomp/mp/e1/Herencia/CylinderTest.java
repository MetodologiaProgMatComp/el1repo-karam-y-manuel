package es.uah.matcomp.mp.e1.Herencia;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CylinderTest {

    @Test
    void getHeight() {
        Cylinder c = new Cylinder(2.0);
        assertEquals(2.0, c.getHeight());
    }

    @Test
    void getVolume() {
        Cylinder c = new Cylinder(1.0,2.0);
        double volume = c.getArea() * 2.0;
        assertEquals(volume, c.getVolume());
    }

    @Test
    void testToString() {
        Cylinder c = new Cylinder();
        assertEquals("Cylinder: subclass of Circle[radius=1.0,color=red] height=1.0", c.toString());
    }
}