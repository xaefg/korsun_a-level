package hw5;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        System.out.println("Enter matrix parameters");
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        int[][] matrix = new int[size][size];
        print(filler(matrix));
    }
    public static int[][] filler(int[][] arr){
        int content = 0;
        for (int row = 0; row<arr.length; row++){
            for (int col = 0; col < arr[row].length; col++) {
                content++;
                if(row % 2==0){
                    arr[row][col] = content;
                }else {
                    arr[row][col] = (-content);
                }
            }
        }
        return arr;
    }
    public static void print(int[][]arr){
        for (int[] j: arr){
            for(int i : j){
                if(i>0){
                    System.out.print(i + "  ");
                }else {
                    System.out.print(i + " ");
                }
            }
            System.out.println();
        }
    }
}
