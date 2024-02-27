package es.uah.matcomp.mp.e1.Agr.c2;

public class Customer {
    ///Arguments
    private int id;
    private String name;
    private char gender;
    ///Methods
    public Customer(int id, String name, char gender){
        if (gender != 'm' && gender != 'f'){
            System.out.println("Género incorrecto. El género debe ser 'm' o 'f'.");
        } else {
        this.id = id;
        this.name = name;
        this.gender = gender;}
    }
    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public char getGender(){
        return gender;
    }
    public String toString(){
        return name + "(" + id + ")";
    }
}
