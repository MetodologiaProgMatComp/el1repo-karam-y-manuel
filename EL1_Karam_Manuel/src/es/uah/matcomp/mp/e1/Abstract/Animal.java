package es.uah.matcomp.mp.e1.Abstract;

public abstract class Animal {
    private String name;
    public Animal(String name){
        this.name = name;
    }
    public abstract void greets();
}
