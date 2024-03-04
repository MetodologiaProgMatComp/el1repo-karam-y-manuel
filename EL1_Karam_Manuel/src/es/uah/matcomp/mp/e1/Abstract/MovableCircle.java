package es.uah.matcomp.mp.e1.Abstract;

public class MovableCircle implements Movable{
    ///Arguments
    private int radius;
    private MovablePoint center;
    ///Methods

    public MovableCircle(int x,int y, int xSpeed, int ySpeed, int radius) {
        this.radius = radius;
        MovablePoint newCenter = new MovablePoint(x,y,xSpeed,ySpeed);
        this.center = newCenter;
    }
    public String toString(){
        return this.center.toString() + ",radius=" + this.radius + ")";
    }

    @Override
    public void moveUp() {
        MovablePoint c = this.center;
        c.moveUp();
        this.center = c;
    }

    @Override
    public void moveDown() {
        MovablePoint c = this.center;
        c.moveDown();
        this.center = c;
    }

    @Override
    public void moveLeft() {
        MovablePoint c = this.center;
        c.moveLeft();
        this.center = c;
    }

    @Override
    public void moveRight() {
        MovablePoint c = this.center;
        c.moveRight();
        this.center = c;
    }
}
