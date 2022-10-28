
import hw5.Practice2;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Practice2Test {
    public Practice2Test() {
    }

    @Test
    void count_NewStudentHeight_Result() {
        int[] studHeight = new int[0];
        int[] onlyBoys = new int[]{0, -160, -170, 0};
        int[] onlyGirls = new int[]{160, 150, 0, 0};
        Assertions.assertEquals(new int[]{0, 0}, Practice2.count(studHeight));
        Assertions.assertEquals(new int[]{165, 0}, Practice2.count(onlyBoys));
        Assertions.assertEquals(new int[]{0, 155}, Practice2.count(onlyGirls));
    }
}
