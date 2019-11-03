package sum;

import ArithmaticHelper.Constants;
import ArithmaticHelper.Input;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SumCommandTest {

    private Input inputTrue;
    private Input inputFalse;

    @Before
    public void prepare(){
        inputTrue = new Input(10,12);
        inputFalse = new Input(null,12);
    }

    @Test
    public void execute() {
        SumCommand sumCommandTrue = new SumCommand(inputTrue);
        SumCommand sumCommandFalse = new SumCommand(inputFalse);
        try{
            Assert.assertEquals(Integer.valueOf(22), sumCommandTrue.execute());
            sumCommandFalse.execute();
        }catch (Exception e){
            Assert.assertEquals(Constants.INVALID_INPUT, e.getMessage());
        }
    }
}