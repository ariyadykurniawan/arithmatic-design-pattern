package fibonacci;

import ArithmaticHelper.Constants;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class FibonacciCommandTest {

    private Integer limitTrue;
    private Integer limitFalse;
    private List<Integer> expectList = new ArrayList<Integer>();

    @Before
    public void prepare(){
        limitTrue = 5;
        limitFalse = 0;
        expectList.add(0);
        expectList.add(1);
        expectList.add(1);
        expectList.add(2);
        expectList.add(3);
    }

    @Test
    public void execute() {
        FibonacciCommand fibonacciCommandTrue = new FibonacciCommand(limitTrue);
        FibonacciCommand fibonacciCommandFalse = new FibonacciCommand(limitFalse);
        try{
            Assert.assertEquals(expectList, fibonacciCommandTrue.execute());
            fibonacciCommandFalse.execute();
        }catch (Exception e){
            Assert.assertEquals(Constants.INVALID_LIMIT, e.getMessage());
        }
    }
}