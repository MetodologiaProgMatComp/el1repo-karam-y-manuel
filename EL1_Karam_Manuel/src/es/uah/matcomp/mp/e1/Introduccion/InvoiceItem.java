package es.uah.matcomp.mp.e1.Introduccion;
public class InvoiceItem {
    ///Argumentos
    private String id;
    private String desc;
    private int qty;
    private double unitPrice;
    ///Métodos
    public InvoiceItem(String id, String desc, int qty, double unitPrice){
        this.id = id;
        this.desc = desc;
        this.qty = qty;
        this.unitPrice = unitPrice;
    }
    public String getId(){
        return id;
    }
    public String getDesc(){
        return desc;
    }
    public int getQty(){
        return qty;
    }
    public void setQty(int qty){
        this.qty = qty;
    }
    public double getUnitPrice(){
        return unitPrice;
    }
    public void setUnitPrice(double unitPrice){
        this.unitPrice = unitPrice;
    }
    public double getTotal(){
        return unitPrice * qty;
    }
    public String toString(){
        return "Invoice item[id= " + id + ", desc= " + desc +
                 ",qty= " + qty + ",unitPrice= " + unitPrice + "]";
    }

}