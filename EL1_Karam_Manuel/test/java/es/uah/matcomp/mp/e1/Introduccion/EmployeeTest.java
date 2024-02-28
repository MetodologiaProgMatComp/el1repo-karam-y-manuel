package es.uah.matcomp.mp.e1.Introduccion;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EmployeeTest {

    @Test
    void getId() {
        Employee e = new Employee(123,"miguel", "angel", 1000);
        assertEquals(123, e.getId());
    }

    @Test
    void getFirstName() {
        Employee e = new Employee(123,"miguel", "angel", 1000);
        assertEquals("miguel", e.getFirstName());
    }

    @Test
    void getLastName() {
        Employee e = new Employee(123,"miguel", "angel", 1000);
        assertEquals("angel", e.getLastName());
    }

    @Test
    void getName() {
        Employee e = new Employee(123,"miguel", "angel", 1000);
        assertEquals("miguel angel", e.getName());
    }

    @Test
    void getSalary() {
        Employee e = new Employee(123,"miguel", "angel", 1000);
        assertEquals(1000, e.getSalary());
    }

    @Test
    void setSalary() {
        Employee e = new Employee(123,"miguel", "angel", 1000);
        e.setSalary(2000);
        assertEquals(2000, e.getSalary());
    }

    @Test
    void getAnnualSalary() {
        Employee e = new Employee(123,"miguel", "angel", 1000);
        assertEquals(1000*12, e.getAnnualSalary());

    }

    @Test
    void raiseSalary() {
        Employee e = new Employee(123,"miguel", "angel", 1000);
        assertEquals(1000*1.15, e.raiseSalary(15));
    }

    @Test
    void testToString() {
        Employee e = new Employee(123,"miguel", "angel", 1000);
        assertEquals("Employee[id =123, name = miguel angel, salary = 1000]", e.toString());

    }
}

