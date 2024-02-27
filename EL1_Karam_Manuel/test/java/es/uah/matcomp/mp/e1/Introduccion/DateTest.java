package es.uah.matcomp.mp.e1.Introduccion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DateTest {

    @Test
    void getDay() {
        Date dato = new Date(9,1,2004);
        assertEquals(9, dato.getDay());
    }

    @Test
    void getMonth() {
        Date dato = new Date(9,1,2004);
        assertEquals(1, dato.getMonth());
    }

    @Test
    void getYear() {
        Date dato = new Date(9,1,2004);
        assertEquals(2004, dato.getYear());
    }

    @Test
    void setYear() {
        Date dato = new Date(9,1,2004);
        dato.setYear(2010);
        assertEquals(2010, dato.getYear());
    }
    @Test
    void setDay() {
        Date dato = new Date(9,1,2004);
        dato.setDay(20);
        assertEquals(20, dato.getDay());
    }

    @Test
    void setMonth() {
        Date dato = new Date(9,1,2004);
        dato.setMonth(8);
        assertEquals(8, dato.getMonth());
    }
    @Test
    void setDate() {
        Date dato = new Date(9,1,2004);
        dato.setDate(20, 8,2004);
        assertEquals(8, dato.getMonth());
        assertEquals(20, dato.getDay());
        assertEquals(2004, dato.getYear());
    }
    @Test
    void testToString() {
        Date d1 = new Date(1, 2, 2014);
        String fechaEsp = "01/02/2014";
        assertEquals(fechaEsp, d1.toString());
    }
}