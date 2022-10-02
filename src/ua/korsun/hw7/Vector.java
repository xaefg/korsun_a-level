package hw7;

import java.util.Random;

public class Vector {
    private final double x;
    private final double y;
    private final double z;

    public  Vector(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }


    public double getLength() {
        return Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2) + Math.pow(z, 2));
    }
    public Vector getProduction(Vector vector){
        return new Vector(y* vector.z - z* vector.y,z* vector.x - x* vector.z, x* vector.y - y* vector.x);
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
        return (getScalar(vector)/ (getLength()*vector.getLength()));
    }
    public static void print(Vector vector){
        System.out.println(vector.x +" "+ vector.y +" "+ vector.z);
    }
    public static void printVectorArr(Vector[] arr){
        for(Vector j : arr){
            print(j);
        }
    }
    public static Vector[] generator(int n){
        Vector[] vectorArr = new Vector[n];
        Random random = new Random();
        for (int i = 0; i<vectorArr.length; i++){
            vectorArr[i] = new Vector(random.nextDouble(),random.nextDouble(),random.nextDouble());
        }
        return vectorArr;
    }
}
