package es.uah.matcomp.mp.e1.Herencia.ShapePackage;

public class Square extends Rectangle {
    ///Methods
    public Square() {
        super();
    }

    public Square(double side) {
        super(side, side);
    }

    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }

    public double getSide() {
        return getLength();
    }

    public void setSide(double side) {
        setLength(side);
        setWidth(side);
    }

    @Override
    public String toString() {
        return "Square[" + super.toString() + "]";
    }
}
