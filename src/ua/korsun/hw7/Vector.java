public class Vector {
    private final double x;
    private final double y;
    private final double z;

    public  Vector(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }


    public double getModule() {
        return Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2) + Math.pow(z, 2));
    }

    public Vector getAddition(Vector vector) {
        return new Vector(x + vector.x, y + vector.y, z + vector.z);
    }

    public Vector getSubtraction(Vector vector) {
        return new Vector(x - vector.x, y - vector.y, z - vector.z);
    }

    public double getScalar(Vector vector) {
        return x * vector.x + y * vector.y + vector.z * vector.z;
    }

    public double getCos(Vector vector){
        return ((getScalar(vector))/getModule()*vector.getModule());
    }
    public static void print(Vector vector){
        System.out.println(vector.x +" "+ vector.y +" "+ vector.z);
    }
    public static void printVectorArr(Vector[] arr){
        for(Vector j : arr){
            print(j);
        }
    }
}
