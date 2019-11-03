package prime;

import ArithmaticHelper.Constants;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class PrimeGeneratorTest {
    private Integer limit;
    private List<Integer> expectList = new ArrayList<Integer>();
    private List<Integer> emptyList = new ArrayList<Integer>();

    @Before
    public void prepare(){
        limit = 5;
        expectList.add(2);
        expectList.add(3);
        expectList.add(5);
        expectList.add(7);
        expectList.add(11);
    }

    @Test
    public void generate() {
        PrimeGenerator primeGenerator  = new PrimeGenerator();
        Assert.assertEquals(expectList, primeGenerator.generate(limit));
        Assert.assertEquals(emptyList,primeGenerator.generate(0));
    }
}