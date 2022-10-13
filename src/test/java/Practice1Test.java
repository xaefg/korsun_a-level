import hw5.Practice1;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EmptySource;

public class Practice1Test {
    public Practice1Test() {
    }

    @ParameterizedTest
    @EmptySource
     void counter_EmptySource_Zero(int[] arr) {
        Assertions.assertEquals(0, Practice1.counter(arr));
    }
}