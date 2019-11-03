package multiply;

import ArithmaticHelper.*;

public class MultiplyCommand implements Command {
    private Arithmatic arithmatic = new ArithmeticImpl();
    private Input input;

    public MultiplyCommand(Input input){
        this.input = input;
    }

    @Override
    public Integer execute() throws Exception{
        if(input.getX() == null|| input.getY() == null){
            throw new Exception(Constants.INVALID_INPUT);
        }
        return arithmatic.multiplyNumber(input.getX(), input.getY());
    }
}
