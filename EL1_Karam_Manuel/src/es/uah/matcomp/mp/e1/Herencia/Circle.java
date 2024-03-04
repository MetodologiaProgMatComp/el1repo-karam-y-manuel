package es.uah.matcomp.mp.e1.Herencia;

public class Circle {
    private double radius;
    private String color;


    public  Circle(){
        radius = 1.0;
        color = "red";
    }

    public Circle (double radius) {
        this.radius = radius;
    }
    public Circle (double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius () {
        return radius;
    }

    public void setRadius (double radius) {
        this.radius = radius;
    }

    public double getArea(){
        return radius*radius*Math.PI;
    }


    public double getCircumference(){
        return 2*radius*Math.PI;
    }

    public String toString(){
        return "Circle[radius="+ radius + ",color="+ color + "]";

    }
}
