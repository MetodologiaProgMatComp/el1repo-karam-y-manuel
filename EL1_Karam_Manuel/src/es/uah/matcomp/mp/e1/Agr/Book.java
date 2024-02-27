package es.uah.matcomp.mp.e1.Agr;

public class Book {
    ///Arguments
    private String isbn;
    private String name;
    private Author author;
    private double price;
    private int qty = 0;
    ///Methods
    public Book(String isbn, String name, Author author, double price){
        this.isbn = isbn;
        this.name = name;
        this.author = author;
        this.price = price;
    }
    public Book(String isbn, String name, Author author, double price, int qty){
        this.name = name;
        this.author = author;
        this.price = price;
        this.qty = qty;
        this.isbn = isbn;
    }
    public String getIsbn(){
        return isbn;
    }

    public String getName(){
        return name;
    }
    public Author getAuthor(){
        return author;
    }
    public double getPrice(){
        return price;
    }
    public void setPrice(double price){
        this.price = price;
    }
    public int getQty(){
        return qty;
    }
    public void setQty(int qty){
        this.qty = qty;
    }
    public String getAuthorName(){
        return author.getName();
    }

    public String toString(){
        return "Book[isbn="+ isbn + ",name=" + name + "," + author.toString() + ",price=" +
                price + ",qty=" + qty + "]";
    }



}


