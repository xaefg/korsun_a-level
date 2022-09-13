import java.util.Arrays;
import java.util.Random;


public class task1Hw4 {
    public static void main(String[] args) {
        int[] myArray = new int[400];
        int[] myArray1 = filler(myArray);
        System.out.println(Arrays.toString(filler(myArray)));
        System.out.println(arithmeticMean(myArray1));
        System.out.println(geometicMean(myArray1));

    }

    public static int[] filler(int[] myArray) {
        Random random = new Random();
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = random.nextInt(1, 10);
        }
        return myArray;
    }

    public static double arithmeticMean(int[] myArray) {
        int sum = 0;
        for (int j : myArray) {
            sum += j;
        }
        double b = myArray.length;
        return sum / b;
    }

    public static double geometicMean(int[] myArray) {
        int sum = 1;
        for (double j : myArray) {
            sum *= j;
        }
        return Math.pow(sum, 1. / myArray.length);
    }

}
