import hw5.Practice1;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Practice1Test {
    public Practice1Test() {
    }

    @Test
    void counter_NewPrices() {
        int[] goodPrices = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        int[] goodPrices1 = new int[]{123, 1235, 1234, 7829, 1234, 5467, 1234, 5734, 6930, 1342, 1230, 3412};
        int[] goodPrices2 = new int[]{100, 650, 213, 135, 543, 322, 506, 574, 690, 203, 230, 312};
        Assertions.assertEquals(0, Practice1.counter(goodPrices));
        Assertions.assertEquals(36881, Practice1.counter(goodPrices1));
        Assertions.assertEquals(0, Practice1.counter(goodPrices2));
    }
}