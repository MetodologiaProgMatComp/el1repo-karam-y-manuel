package es.uah.matcomp.mp.e1.Herencia;

public class Point2D {
    ///Arguments
    private float x;
    private float y;
    ///Methods
    public Point2D(float x, float y){
        this.x = x;
        this.y = y;
    }
    public Point2D(){
        this.x = 0.0f;
        this.y = 0.0f;
    }
    public float getX(){
        return x;
    }
    public void setX(float x){
        this.x = x;
    }
    public float getY(){
        return y;
    }
    public void setY(float y){
        this.y = y;
    }
    public void setXY(float x, float y){
        this.x = x;
        this.y = y;
    }
    public float[] getXY(){
        float[] floatArray = new float[2];
        floatArray[0] = x;
        floatArray[1] = y;
        return floatArray;
    }
    public String toString(){
        return "(" + x + "," + y + ")";
    };
}
