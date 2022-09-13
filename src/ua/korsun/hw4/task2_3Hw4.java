import java.util.Arrays;
import java.util.Random;

public class task2_3Hw4 {
    public static void main(String[] args) {
        int[] myArray = new int[1000];
        int[] myArray1 = filler(myArray);
        System.out.println(Arrays.toString(sum(myArray1)));
    }
//я вирішив трохи попрактикуватись з масивами, тому повернув таким чином
    public static int[] filler(int[] myArray) {
        Random random = new Random();
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = random.nextInt(1, 10);
        }
        return myArray;
    }

    public static int[] sum(int[] myArray) {
        int simpleSum = 0;
        int complexSum = 0;
        for(int e : myArray){
            if (e % 2 == 0) {
                simpleSum++;
            } else {
                complexSum++;
            }
        }
        int[] totalSum = new int[2];
        totalSum[0] = simpleSum;
        totalSum[1] = complexSum;
        return totalSum;
    }
}
