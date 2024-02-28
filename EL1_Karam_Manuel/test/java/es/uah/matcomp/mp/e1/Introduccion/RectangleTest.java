package es.uah.matcomp.mp.e1.Introduccion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class  RectangleTest {

    @Test
    void getLength() {
        Rectangle r = new Rectangle();
        float largo = r.getLength();
        assertTrue((largo>0), "Error, es menor que cero.");
    }

    @Test
    void setLength() {
        Rectangle r = new Rectangle();
        float largoEsp = 12.5f;
        r.setLength(largoEsp);
        float largoObt = r.getLength();
        assertEquals(largoEsp, largoObt);
    }

    @Test
    void getWidth() {
        Rectangle r = new Rectangle();
        float ancho = r.getWidth();
        assertTrue((ancho>0), "Error, es menor que cero.");
    }

    @Test
    void setWidth() {
        Rectangle r = new Rectangle();
        float anchoEsp = 12.5f;
        r.setLength(anchoEsp);
        float anchoObt = r.getLength();
        assertEquals(anchoEsp, anchoObt);
    }

    @Test
    void getArea() {
        Rectangle r = new Rectangle();
        float ancho = 9.5f;
        float largo = 9.5f;
        double areaEsp = ancho * largo;
        r.setLength(largo);
        r.setWidth(ancho);
        double areaObt = r.getArea();
        assertEquals(areaObt, areaEsp);
    }

    @Test
    void getPerimeter() {
        Rectangle r = new Rectangle();
        float ancho = 9.5f;
        float largo = 9.5f;
        r.setLength(largo);
        r.setWidth(ancho);
        double perEsp = (ancho * 2) + (largo * 2);
        double perObt = r.getPerimeter();
        assertEquals(perObt, perEsp);
    }

    @Test
    void testToString() {
        Rectangle r = new Rectangle(1.2f, 3.4f);
        String cadenaEsp = "Rectangle[length = " + 1.2f + ", width = " + 3.4f + "]";
        String cadenaObt = r.toString();
        assertEquals(cadenaEsp, cadenaObt);
    }
}