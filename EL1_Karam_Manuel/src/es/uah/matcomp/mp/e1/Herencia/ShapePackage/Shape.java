package es.uah.matcomp.mp.e1.Herencia.ShapePackage;

public class Shape {
    ///Arguments
    private String color;
    private Boolean filled;
    ///Methods
    public Shape(){
        color = "red";
        filled = true;
    }
    public Shape(String color, boolean filled){
        this.color = color;
        this.filled = filled;
    }
    public String getColor(){
        return color;
    }
    public void setColor(String color){
        this.color = color;
    }
    public boolean isFilled(){
        return filled;
    };

    public void setFilled(Boolean filled) {
        this.filled = filled;
    }
    public String toString(){
        return "Shape[color=" + color + ",filled=" + filled + "]";
    }
}
