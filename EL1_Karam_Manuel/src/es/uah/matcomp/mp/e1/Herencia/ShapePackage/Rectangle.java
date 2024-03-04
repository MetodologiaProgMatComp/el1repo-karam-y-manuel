package es.uah.matcomp.mp.e1.Herencia.ShapePackage;

public class Rectangle extends Shape {
    ///Arguments
    private double width;
    private double length;

    ///Methods
    public Rectangle() {
        super();
        width = 1.0;
        length = 1.0;
    }

    public Rectangle(double width, double length) {
        super();
        this.width = width;
        this.length = length;
    }

    public Rectangle(double width, double length, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getArea() {
        return width * length;
    }

    public double getPerimeter() {
        return (width * 2) + (length * 2);
    }

    @Override
    public String toString(){
        return "Rectangle[" + super.toString() + ",width=" + width +
                ",length=" + length + "]";
    }
}
