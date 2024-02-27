package es.uah.matcomp.mp.e1.Introduccion;
public class Ball {
    ///Argumentos
    private float x;
    private float y;
    private float xDelta;
    private float yDelta;
    private int radius;
    ///Métodos
    public Ball(float x, float y, int radius, float xDelta, float yDelta){
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
        float newx = x + xDelta;
        float newy= y + yDelta;
        x = newx;
        y = newy;
    }
    public void reflectHorizontal(){
        xDelta = 0 - xDelta;
        yDelta = 0 - yDelta;
    }
    public String toString(){
        return "Ball[" + x + "," + y + "],speed[" + xDelta + "," + yDelta + "]";
    }


}
