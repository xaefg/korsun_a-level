import hw13.BubbleSort;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EmptySource;

import java.util.InputMismatchException;

public class BubbleSortTest {
    @Test
    void some_Numbers_Sorted_Array() {
        int[] arr = new int[]{3,4,2,5,1};
        int[] sArr = new int[]{1,2,3,4,5};
        Assertions.assertArrayEquals(sArr, BubbleSort.sort(arr));
    }
    @ParameterizedTest
    @EmptySource
    void empty_Array_sauce(int[] arr){
        Assertions.assertArrayEquals(arr, BubbleSort.sort(arr));
    }
}
