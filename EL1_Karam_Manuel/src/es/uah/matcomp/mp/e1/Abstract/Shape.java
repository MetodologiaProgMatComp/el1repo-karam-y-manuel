package es.uah.matcomp.mp.e1.Abstract;

public abstract class Shape {
    ///Arguments
    protected String color;
    protected Boolean filled;

    ///Methods
    public Shape() {
        color = "red";
        filled = true;
    }

    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(Boolean filled) {
        this.filled = filled;
    }

    public abstract double getArea();

    public abstract double getPerimeter();

    public String toString() {
        return "Shape[color=" + color + ",filled=" + filled + "]";
    }
}
