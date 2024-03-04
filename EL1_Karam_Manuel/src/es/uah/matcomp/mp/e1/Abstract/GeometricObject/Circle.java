package es.uah.matcomp.mp.e1.Abstract.GeometricObject;

public class Circle implements GeometricObject{
    ///Arguments
    private double radius;

    ///Methods
    public Circle(double radius){
        this.radius = radius;
    }
    public String toString(){
        return "Circle[radius=" + radius +"]";
    }
    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double getPerimeter() {
        return Math.PI * radius * 2;
    }
}
