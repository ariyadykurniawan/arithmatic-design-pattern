package multiply;

import ArithmaticHelper.Constants;
import ArithmaticHelper.Input;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MultiplyCommandTest {

    private Input inputTrue;
    private Input inputFalse;

    @Before
    public void prepare(){
        inputTrue = new Input(10,12);
        inputFalse = new Input(null,12);
    }

    @Test
    public void execute() {
        MultiplyCommand multiplyCommandTrue = new MultiplyCommand(inputTrue);
        MultiplyCommand multiplyCommandFalse = new MultiplyCommand(inputFalse);
        try{
            Assert.assertEquals(Integer.valueOf(120), multiplyCommandTrue.execute());
            multiplyCommandFalse.execute();
        }catch (Exception e){
            Assert.assertEquals(Constants.INVALID_INPUT, e.getMessage());
        }
    }
}