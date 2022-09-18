import java.util.Arrays;

public class Task2Hw5 {
    public static void main(String[] args) {
        int[][] array = {{10, 402, 3},{123, 120, 110},{10, 9, 8}};
        int[][] array1 = {{11, 10, 9, 8},{7,6,5,4},{3,2,1,0}};
        System.out.println(Arrays.deepToString(array));
        System.out.println(checker(array));
        System.out.println(Arrays.deepToString(array1));
        System.out.println(checker(array1));

    }
    public static boolean checker(int[][]arr){
        for(int col = 0; col< arr.length; col++){
            for(int row = 1; row < arr[col].length; row++){
                if(arr[col][row] > arr[col][row-1]){
                    return false;
                }
            }
        }
        return true;
    }
}
