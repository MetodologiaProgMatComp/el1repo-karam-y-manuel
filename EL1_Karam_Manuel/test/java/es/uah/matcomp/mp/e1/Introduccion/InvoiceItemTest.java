package es.uah.matcomp.mp.e1.Introduccion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InvoiceItemTest {

    @Test
    void getId() {
        InvoiceItem item = new InvoiceItem("A101", "Pen Red", 888, 0.08);
        String idObt = item.getId();
        assertEquals("A101", idObt);
    }
    @Test
    void getDesc() {
        InvoiceItem item = new InvoiceItem("A101", "Pen Red", 888, 0.08);
        String descObt = item.getDesc();
        assertEquals("Pen Red", descObt);
    }
    @Test
    void getQty() {
        InvoiceItem item = new InvoiceItem("A101", "Pen Red", 888, 0.08);
        int qtyObt = item.getQty();
        assertEquals(888, qtyObt);
    }
    @Test
    void setQty() {
        InvoiceItem item = new InvoiceItem("A101", "Pen Red", 888, 0.08);
        item.setQty(1);
        assertEquals(1, item.getQty());
    }
    @Test
    void getUnitPrice() {
        InvoiceItem item = new InvoiceItem("A101", "Pen Red", 888, 0.08);
        double unitPriceObt = item.getUnitPrice();
        assertEquals(0.08, unitPriceObt);
    }
    @Test
    void setUnitPrice() {
        InvoiceItem item = new InvoiceItem("A101", "Pen Red", 888, 0.08);
        item.setUnitPrice(0.05);
        assertEquals(0.05, item.getUnitPrice());
    }

    @Test
    void getTotal() {
        InvoiceItem item = new InvoiceItem("A101", "Pen Red", 888, 0.08);
        double totalEsp = 888 * 0.08;
        assertEquals(totalEsp, item.getTotal());
    }

    @Test
    void testToString() {
        InvoiceItem item = new InvoiceItem("A101", "Pen Red", 888, 0.08);
        String cadenaEsp = "Invoice item[id= " + "A101" + ", desc= " + "Pen Red" +
                ",qty= " + 888 + ",unitPrice= " + 0.08 + "]";
        String cadenaObt = item.toString();
        assertEquals(cadenaEsp, cadenaObt);



    }
}