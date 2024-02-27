package es.uah.matcomp.mp.e1.Agr.c2;

import java.text.DecimalFormat;

public class Account {
    ///Arguments
    private int id;
    private Customer customer;
    private double balance;
    ///Methods
    public Account(int id, Customer customer, double balance){
        this.id = id;
        this.customer = customer;
        this.balance = balance;
    }
    public Account(int id, Customer customer){
        this.id = id;
        this.customer = customer;
    }
    public int getId(){
        return id;
    }
    public Customer getCustomer(){
        return customer;
    }
    public double getBalance(){
        return balance;
    }
    public void setBalance(double balance){
        this.balance = balance;
    }
    public String toString(){
        DecimalFormat df = new DecimalFormat("#.##");
        balance = Double.valueOf(df.format(balance));
        return customer.toString() + " balance=$" + balance;
    }
    public String getCustomerName(){
        return customer.getName();
    }
    public Account deposit(double amount){
        balance = balance + amount;
        return this;
    }
    public Account withdraw(double amount){
        if (balance>= amount){
            balance = balance - amount;
            return this;
        } else {
            System.out.println("amount withdrawn exceeds current balance");
            return null;
        }
    }
}

