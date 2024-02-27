package es.uah.matcomp.mp.e1.Introduccion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BallTest {
    @Test
    void getX() {
        Ball pelota = new Ball(1.1f, 2.2f, 10, 3.3f, 4.4f);
        assertEquals(1.1f, pelota.getX());
    }
    @Test
    void getyDelta() {
        Ball pelota = new Ball(1.1f, 2.2f, 10, 3.3f, 4.4f);
        assertEquals(4.4f, pelota.getyDelta());
    }

    @Test
    void getxDelta() {
        Ball pelota = new Ball(1.1f, 2.2f, 10, 3.3f, 4.4f);
        assertEquals(3.3f, pelota.getxDelta());
    }

    @Test
    void getY() {
        Ball pelota = new Ball(1.1f, 2.2f, 10, 3.3f, 4.4f);
        assertEquals(2.2f, pelota.getY());
    }

    @Test
    void getRadius() {
        Ball pelota = new Ball(1.1f, 2.2f, 10, 3.3f, 4.4f);
        assertEquals(10, pelota.getRadius());
    }

    @Test
    void setRadius() {
        Ball pelota = new Ball(1.1f, 2.2f, 10, 3.3f, 4.4f);
        pelota.setRadius(11);
        assertEquals(11, pelota.getRadius());
    }

    @Test
    void setxDelta() {
        Ball pelota = new Ball(1.1f, 2.2f, 10, 3.3f, 4.4f);
        pelota.setxDelta(3.5f);
        assertEquals(3.5f, pelota.getxDelta());
    }
    @Test
    void setyDelta() {
        Ball pelota = new Ball(1.1f, 2.2f, 10, 3.3f, 4.4f);
        pelota.setyDelta(3.5f);
        assertEquals(3.5f, pelota.getyDelta());
    }
    @Test
    void move() {
        Ball pelota = new Ball(1.1f, 2.2f, 10, 3.3f, 4.4f);
        pelota.move();
        double epsilon = 0.0001;
        assertTrue(Math.abs(6.6f - pelota.getY()) < epsilon);
        assertTrue(Math.abs(4.4f - pelota.getX()) < epsilon);
    }
    @Test
    void reflectHorizontal() {
        Ball pelota = new Ball(1.1f, 2.2f, 10, 3.3f, 4.4f);
        pelota.reflectHorizontal();
        assertEquals(-4.4f, pelota.getyDelta());
        assertEquals(-3.3f, pelota.getxDelta());
    }
    @Test
    void testToString() {
        Ball pelota = new Ball(1.1f, 2.2f, 10, 3.3f, 4.4f);
        String cadenaEsp = "Ball[1.1,2.2],speed[3.3,4.4]";
        assertEquals(cadenaEsp, pelota.toString());
    }
}