package es.uah.matcomp.mp.e1.Introduccion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AccountTest {

    @Test
    void getID() {
        Account a = new Account("123", "pablo", 15);
        assertEquals("123", a.getID());
    }

    @Test
    void getName() {
        Account a = new Account("123", "pablo", 15);
        assertEquals("pablo", a.getName());
    }
    @Test
    void Account(){
        Account a = new Account("123", "pablo", 15);
        Account b = new Account("111", "juanjo");
        assertEquals("111", b.getID());
        assertEquals("juanjo", b.getName());
    }
    @Test
    void getBalance() {
        Account a = new Account("123", "pablo", 15);
        assertEquals(15, a.getBalance());
    }

    @Test
    void credit() {
        Account a = new Account("123", "pablo", 15);
        assertEquals(15 + 60, a.credit(60));

    }

    @Test
    void debit() {
        Account a = new Account("123", "pablo", 15);
        int amount1 = 30;
        int amount2 = 5;
        assertEquals(15, a.debit(amount1) );
        assertEquals(10, a.debit(amount2));
    }

    @Test
    void transferTo() {
        Account a = new Account("123", "pablo", 15);
        Account b = new Account("122", "pedro", 20);
        assertEquals(10, b.transferTo(a , 10));
        assertEquals(25, a.transferTo(b, 40));
    }

    @Test
    void testToString() {
        Account a = new Account("123", "pablo", 15);
        assertEquals("Account[id =123, name = pablo, balance = 15]", a.toString());
    }
}