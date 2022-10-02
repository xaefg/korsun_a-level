package hw7;
import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        Vector vector = new Vector(14, 5, 0.3);
        Vector vector1 = new Vector(5, -5, 14);
        Vector.print(vector.getAddition(vector1));
        Vector.print(vector.getProduction(vector1));
        Vector.print(vector.getSubtraction(vector1));
        System.out.println(vector.getCos(vector1));
        System.out.println(vector.getLength());
        System.out.println(vector1.getLength());
        System.out.println(vector.getScalar(vector1));
        System.out.println(vector1.getScalar(vector));
        Vector.printVectorArr(generator(4));
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