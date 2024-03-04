package es.uah.matcomp.mp.e1.Abstract;

public class MovablePoint implements Movable {
    ///Arguments
    protected int x;
    protected int y;
    protected int xSpeed;
    protected int ySpeed;

    ///Methods
    public MovablePoint(int x, int y, int xSpeed, int ySpeed){
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    public String toString(){
        return("(" + this.x + "," + this.y + "),speed=(" + this.xSpeed +
                "," + this.ySpeed + ")");
    }

    @Override
    public void moveUp() {
        this.y = this.y + this.ySpeed;
    }

    @Override
    public void moveDown() {
        this.y = this.y - this.ySpeed;
    }

    @Override
    public void moveLeft() {
        this.x = this.x - this.xSpeed;
    }

    @Override
    public void moveRight() {
        this.x = this.x + this.xSpeed;
    }
}
