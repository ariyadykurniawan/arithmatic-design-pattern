package fibonacci;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class FibonacciGeneratorTest {
    private List<Integer> expectList = new ArrayList<Integer>();
    private List<Integer> expectList1 = new ArrayList<Integer>();
    private List<Integer> expectList2 = new ArrayList<Integer>();
    private List<Integer> emptyList = new ArrayList<Integer>();

    @Before
    public void prepare(){
        expectList.add(0);
        expectList.add(1);
        expectList.add(1);
        expectList.add(2);
        expectList.add(3);

        expectList1.add(0);
        expectList2.add(0);
        expectList2.add(1);
    }

    @Test
    public void generate() {
        FibonacciGenerator fibonacciGenerator = new FibonacciGenerator();
        Assert.assertEquals(expectList, fibonacciGenerator.generate(5));
        Assert.assertEquals(expectList1, fibonacciGenerator.generate(1));
        Assert.assertEquals(expectList2, fibonacciGenerator.generate(2));
        Assert.assertEquals(emptyList,fibonacciGenerator.generate(0));
    }
}
