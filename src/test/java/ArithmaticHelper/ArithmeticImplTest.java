package ArithmaticHelper;

import org.junit.Assert;
import org.junit.Test;

public class ArithmeticImplTest {
    ArithmeticImpl arithmetic = new ArithmeticImpl();

    @Test
    public void sumNumber() {
        Integer result = arithmetic.sumNumber(10,12);
        Assert.assertEquals(Integer.valueOf(22),result);
    }

    @Test
    public void multiplyNumber() {
        Integer result = arithmetic.multiplyNumber(10,12);
        Assert.assertEquals(Integer.valueOf(120),result);
    }

    @Test
    public void divideNumber() {
        Integer result = arithmetic.divideNumber(10,2);
        Assert.assertEquals(Integer.valueOf(0),result);
    }
}