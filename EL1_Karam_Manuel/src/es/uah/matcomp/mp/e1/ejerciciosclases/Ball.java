package es.uah.matcomp.mp.e1.ejerciciosclases;
public class Ball {
    ///Argumentos
    private float x;
    private float y;
    private float xDelta;
    private float yDelta;
    private int radius;
    ///Métodos
    public Ball(float x, float y, float xDelta, float yDelta, int radius){
        this.x= x;
        this.y = y;
        this.xDelta = xDelta;
        this.yDelta = yDelta;
        this.radius = radius;
    }
    public float getX(){
        return x;
    }
    public float getyDelta(){
        return yDelta;
    }
    public float getxDelta(){
        return xDelta;
    }
    public float getY(){
        return y;
    }
    public int getRadius() {
        return radius;
    }
    public void setRadius(int radius){
        this.radius = radius;
    }
    public void setxDelta(float xDelta){
        this.xDelta = xDelta;
    }
    public void setyDelta (float yDelta){
        this.yDelta = yDelta;
    }
    public void move(){
        x = x + xDelta;
        y = y + yDelta;
    }
    public void reflectHorizontal(){
        xDelta = 0 - xDelta;
        yDelta = 0 - yDelta;
    }
    public String toString(){
        return "Ball[" + x + "," + y + "], speed[" + xDelta + "," + yDelta + "]";
    }


}
