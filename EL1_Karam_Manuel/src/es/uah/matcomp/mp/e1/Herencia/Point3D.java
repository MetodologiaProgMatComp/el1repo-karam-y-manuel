package es.uah.matcomp.mp.e1.Herencia;

public class Point3D extends Point2D {
    ///Arguments
    private float z;

    ///Methods
    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public Point3D() {
        super();
        this.z = 0.0f;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public void setXYZ(float x, float y, float z) {
        setXY(x, y);
        this.z = z;
    }

    public float[] getXYZ() {
        float[] floatArray = new float[3];
        floatArray[0] = getX();
        floatArray[1] = getY();
        floatArray[2] = getZ();
        return floatArray;
    }
    @Override
    public String toString(){
        return "(" + getX() + "," + getY() + "," + z + ")";
    }
}
