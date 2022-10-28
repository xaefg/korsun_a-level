import hw5.Practice1;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EmptySource;
import org.junit.jupiter.params.provider.MethodSource;

public class Practice1Test {
    @ParameterizedTest
    @EmptySource
     void counter_EmptySource_Zero(int[] arr) {
        Assertions.assertEquals(0, Practice1.counter(arr));
    }

    @ParameterizedTest
    @MethodSource("arguments")
    void counter_NewPrices_Result() {
        Assertions.assertEquals(11000, Practice1.counter(arguments()));
    }
    static int[] arguments(){
        return new int[]{1000,2000,3000,6000};
    }

}