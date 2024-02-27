package es.uah.matcomp.mp.e1.Agr.c2;

public class Main {
    public static void main(String[] args) {
        Customer miguel = new Customer(12, "miguel", 'm');
        System.out.println("Hello world!");
        String frase = miguel.toString();
        System.out.println(frase);
        System.out.println(miguel);
    }

}