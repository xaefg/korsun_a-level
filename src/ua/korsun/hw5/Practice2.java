package hw5;

import java.util.Arrays;

public class Practice2 {
    public static void main(String[] args) {
        int[] studHeight = {160, 150, 148, -160, -170, 160, 150, 148, -160, -170, 160, 150, 148, -160, -170};
        System.out.println(Arrays.toString(studHeight));
        int[]temp = count(studHeight);
        int[] result1 = result(temp);
        System.out.println("Boys average height is " + result1[0] +", and girls average height is "+ result1[1]);

    }
    public static int[] count(int[] arr){
        int[] arr1 = new int[4];
        for (int j = 0; j < arr.length; j++) {
            if(arr[j]<0){
                arr1[0] += arr[j];
                arr1[1] ++;
            }else{
                arr1[2] += arr[j];
                arr1[3] ++;
            }
        }
        return arr1;
    }
    public static int[] result(int[] arr){
        int[] arr1 = new int[2];
        arr1[0] = Math.abs(arr[0]/arr[1]);
        arr1[1] = arr[2]/arr[3];
        return arr1;
    }
}
