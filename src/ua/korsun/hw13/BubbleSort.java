package hw13;

import java.util.Arrays;
import java.util.InputMismatchException;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {5, 1, 4, 2, 8};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static int[] sort(int[] arr) {
        if(arr.length ==0){
            return new int[0];
        }
        for (int j = 0; j < arr.length-1; j++) {
            for (int i = 0; i < arr.length-1; i++) {
                if (arr[i] > arr[i + 1]) {
                    swap(arr, i);
                }
            }
        }
        return arr;
    }

    public static void swap(int[] arr, int i) {
        int t = arr[i];
        arr[i] = arr[i+1];
        arr[i+1] = t;
    }

}
