import java.util.Arrays;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter matrix parameters");
        int[][] matrix = new int[input.nextInt()][input.nextInt()];
        System.out.println(Arrays.deepToString(filler(matrix)));
    }
    public static int[][] filler(int[][] arr){
        int content = 0;
        for (int col = 0; col<arr.length; col++){
            for (int row = 0; row < arr[col].length; row++) {
                content++;
                if(col % 2==0){
                    arr[col][row] = content;
                }else {
                    arr[col][row] = (-content);
                }
            }
        }
        return arr;
    }
}
