package hw4;

import java.util.Arrays;
import java.util.Random;

public class Task2_3 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(Arrays.toString(checker(arr)));
        int[] arr1 = new int[400];
        filler(arr1);
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(checker(arr1)));
    }
    public static void filler(int[] arr){
        Random random = new Random();
        for (int i =0; i<arr.length; i++) {
            arr[i] = random.nextInt(10);
        }
    }
    public static String[] checker(int[] arr){
        String[] arr1 = new String[4];
        int zero = 0;
        int isOne = 0;
        int complex = 0;
        int prime = 0;
        for (int j : arr) {
            if (j == 1) {
                isOne++;
            } else if (!isPrime(j)) {
                complex++;
            } else if (isPrime(j)) {
                prime++;
            } else if (j ==0) {
                zero++;
            }

        }
        arr1[0] = zero+" num of 0";
        arr1[1] = isOne+" num of 1";
        arr1[2] = complex+" num of complex";
        arr1[3] = prime+" num of prime";
        return arr1;
    }
    public static boolean isPrime(int num) {

        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= num / 2; i++) {
            if ((num % i) == 0)
                return false;
        }
        return true;
    }


}