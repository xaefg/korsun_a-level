import hw5.Task2;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Task2Test {
    public Task2Test() {
    }

    @Test
    void checker_Sort_False() {
        int[][] array = new int[][]{{10, 402, 3}, {123, 120, 110}, {10, 9, 8}};
        int[][] array1 = new int[8][8];
        int[][] array2 = new int[][]{{10, 9, 8}, {8, 6, 5}, {4, 3, 2}};
        Assertions.assertFalse(Task2.checker(array));
        Assertions.assertFalse(Task2.checker(array1));
        Assertions.assertFalse(Task2.checker(array2));
    }
}
