import java.util.Arrays;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        System.out.println("Current array "+ Arrays.toString(arr));
        System.out.println("Enter index:");
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int[] arr1 = remover(arr, a);
        System.out.println("Array without element at "+ a +" "+Arrays.toString(arr1));
    }

    public static int[] remover(int[] arr, int a) {
        int[] arr1 = new int [arr.length - 1];
        for(int i = 0; i< arr1.length; i++){
            if(i < a){
                arr1[i] = arr[i];
            }else{
                arr1[i] = arr[i+1];
            }
        }
        return arr1;
    }
}