package hw4;

import java.util.Arrays;
import java.util.Random;

public class Task4 {
    public static void main(String[] args) {
        int[] myArray = new int[2000];
        filler(myArray);
        int[] myArray1 = Arrays.copyOf(myArray,myArray.length);
        System.out.println(Arrays.toString(myArray));
        replacer(myArray1);
        System.out.println(Arrays.toString(myArray1));
    }

    public static void filler(int[] myArray) {
        Random random = new Random();
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = random.nextInt(1, 10);
        }
    }

    public static void replacer(int[] myArray1) {
        for (int i = 0; i < myArray1.length; i++) {
            if(myArray1[i]%2 == 0){
                myArray1[i]=0;
            }
        }
    }
}