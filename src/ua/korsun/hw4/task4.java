import java.util.Arrays;
import java.util.Random;

public class task4 {
    public static void main(String[] args) {
        int[] myArray = new int[2000];
        int[] myArray1 = filler(myArray);
        System.out.println(Arrays.toString(replacer(myArray1)));
    }

    public static int[] filler(int[] myArray) {
        Random random = new Random();
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = random.nextInt(1, 10);
        }
        return myArray;
    }

    public static int[] replacer(int[] myArray1) {
        for (int i : myArray1) {
            if(myArray1[i]%2 == 0){
                myArray1[i]=0;
            }
        }
        return myArray1;
    }
}