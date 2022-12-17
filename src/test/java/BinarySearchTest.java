import hw13.BinarySearch;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EmptySource;
import org.junit.jupiter.params.provider.MethodSource;

public class BinarySearchTest {
    @ParameterizedTest
    @MethodSource("sauce")
    void actual_Array_Test_10(){
        Assertions.assertEquals(10, BinarySearch.search(sauce(), 10));
    }
    @ParameterizedTest
    @EmptySource
    void empty_Array_Test_1(int[] arr){
        Assertions.assertEquals(-1, BinarySearch.search(arr, 10));
    }

    static int[] sauce(){
        return new int[]{1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
    }
}
