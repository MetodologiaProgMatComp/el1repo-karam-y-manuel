package es.uah.matcomp.mp.e1.Introduccion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TimeTest {

    @Test
    void getHour() {
        Time t = new Time(9, 15, 10);
        assertEquals(9, t.getHour());
    }

    @Test
    void getMinute() {
        Time t = new Time(9, 15, 10);
        assertEquals(15, t.getMinute());
    }

    @Test
    void getSecond() {
        Time t = new Time(9, 15, 10);
        assertEquals(10, t.getSecond());
    }

    @Test
    void setHour() {
        Time t = new Time(9, 15, 10);
        t.setHour(7);
        assertEquals(7, t.getHour() );

    }

    @Test
    void setMinute() {
        Time t = new Time(9, 15, 10);
        t.setMinute(8);
        assertEquals(8, t.getMinute() );
    }

    @Test
    void setSecond() {
        Time t = new Time(9, 15, 10);
        t.setSecond(9);
        assertEquals(9, t.getSecond() );
    }

    @Test
    void setTime() {
        Time t = new Time(9, 15, 10);
        t.setTime(7, 8, 9);
        assertEquals(7, t.getHour() );
        assertEquals(8, t.getMinute() );
        assertEquals(9, t.getSecond() );
    }

    @Test
    void testToString() {
        Time t = new Time(9, 15, 10);
        assertEquals("09:15:10", t.toString());
    }

    @Test
    void nextSecond() {
        Time t = new Time(9, 59, 59);
        Time nuevotime = t.nextSecond();
        String nuevotimeTexto = nuevotime.toString();
        assertEquals("10:00:00",nuevotimeTexto);

    }

    @Test
    void previousSecond() {
        Time t = new Time(9, 00, 00);
        Time nuevotime = t.previousSecond();
        String nuevotimeTexto = nuevotime.toString();
        assertEquals("08:59:59",nuevotimeTexto);

    }
}