package prime;

import ArithmaticHelper.Constants;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class PrimeCommandTest {
    private Integer limitTrue;
    private Integer limitFalse;
    private List<Integer> expectList = new ArrayList<Integer>();

    @Before
    public void prepare(){
        limitTrue = 5;
        limitFalse = 0;
        expectList.add(2);
        expectList.add(3);
        expectList.add(5);
        expectList.add(7);
        expectList.add(11);
    }

    @Test
    public void execute() {
        PrimeCommand primeCommandTrue = new PrimeCommand(limitTrue);
        PrimeCommand primeCommandFalse = new PrimeCommand(limitFalse);
        try{
            Assert.assertEquals(expectList, primeCommandTrue.execute());
            primeCommandFalse.execute();
        }catch (Exception e){
            Assert.assertEquals(Constants.INVALID_LIMIT, e.getMessage());
        }
    }
}