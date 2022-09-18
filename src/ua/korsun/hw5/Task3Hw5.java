import java.util.Random;
import java.util.Scanner;

public class Task3Hw5 {
    public static void main(String[] args) {
        System.out.println("Enter matrix size");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[][] arr = new int[size][size];
        int[][] arr1 = filler(arr);
        print(arr1);
        System.out.println();
        print(flipper(arr1, size));

    }
    public static int[][] filler(int[][] arr){
        Random random = new Random();
        for (int[] j: arr) {
            for(int i = 0; i<j.length; i++){
                j[i] = random.nextInt(10);
            }
        }
        return arr;
    }


    public static int[][] flipper(int[][] arr, int size){
        int[][] arr1 = new int[size][size];
        for (int i = 0; i<arr.length; i++) {
            for (int j = 0; j<arr[i].length; j++) {
                arr1[i][j] = arr[j][i];
            }
        }
        return arr1;
    }

    public static void print(int[][] arr){
        for (int[] i:arr) {
            for(int j = 0; j<i.length; j++){
                System.out.print(i[j]+" ");
            }
            System.out.println();
        }
    }
}