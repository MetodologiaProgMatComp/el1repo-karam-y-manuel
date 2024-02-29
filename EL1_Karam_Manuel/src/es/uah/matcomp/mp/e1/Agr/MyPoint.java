package es.uah.matcomp.mp.e1.Agr;

public class MyPoint {
    private int x;
    private int y;


    public MyPoint (){
        x = 0;
        y = 0;
    }

    public MyPoint (int x, int y){
        this.x = x;
        this.y = y;
    }
    public void setX(int x) {
        this.x = x;
    }

    public int getX() {
        return x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getY() {
        return y;
    }

    public List<Integer> getXY() {
        List<Integer> listaXY = new ArrayList<>();
        listaXY.add(x);
        listaXY.add(y);
        return listaXY;
    }
    public void setXY(int x, int y){
        
    }





}

