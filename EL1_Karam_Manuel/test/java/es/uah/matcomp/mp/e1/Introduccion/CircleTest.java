package es.uah.matcomp.mp.e1.Introduccion;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CircleTest {

    @Test
    void getRadius() {
        Circle r = new Circle(1.5, "red");
        assertEquals(1.5, r.getRadius());
    }

    @Test
    void Circle(){
        Circle r = new Circle();
        assertEquals(1.0,r.getRadius());
    }

    @Test
    void setRadius() {
        Circle r = new Circle(1.3, "red");
        double radioprueba = 1.5;
        r.setRadius(radioprueba);
        assertEquals(radioprueba, r.getRadius());
    }

    @Test
    void getArea() {
        Circle r = new Circle(1.3, "red");
        double areaprueba = 1.3 * 1.3 * Math.PI;
        double areanueva = r.getArea();
        assertEquals(areaprueba, areanueva);
 }

    @Test
    void getCircumference() {
        Circle r = new Circle (2.23, "radius");
        double circunferenciaprueba = 2* 2.23*Math.PI;
        double circunferencianueva = r.getCircumference();
        assertEquals(circunferenciaprueba,circunferencianueva );

    }

    @Test
    void testToString() {
        Circle r = new Circle (1, "red");
        String texto1 = r.toString();
        String texto2= "Circle[radius=1.0]";
        assertEquals(texto2, texto1);
    }
}
