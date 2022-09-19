import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) {
        int[][] array = {{10, 402, 3}, {123, 120, 110}, {10, 9, 8}};
        int[][] array1 = {{11, 10, 9, 8}, {7, 6, 5, 4}, {3, 2, 1, 0}};
        System.out.println(Arrays.deepToString(array));
        System.out.println(checker(array));
        System.out.println(Arrays.deepToString(array1));
        System.out.println(checker(array1));

    }

    public static boolean checker(int[][] arr) {
        for (int j = 1; j < arr.length; j++) {
            for (int i = 1; i < arr[j].length; i++) {
                if (arr[j][i] >= arr[j-1][i - 1]) {
                    return false;
                } else if (arr[j][0] >= arr[j - 1][arr[j-1].length - 1]) {
                    return false;
                }
            }
        }
        return true;
    }
}
