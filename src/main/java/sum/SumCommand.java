package sum;

import ArithmaticHelper.*;

public class SumCommand implements Command {
    private Arithmatic arithmatic = new ArithmeticImpl();
    private Input input;

    public SumCommand(Input input){
        this.input = input;
    }

    @Override
    public Integer execute() throws Exception{
        if(input.getX() == null|| input.getY() == null){
            throw new Exception(Constants.INVALID_INPUT);
        }
        return arithmatic.sumNumber(input.getX(), input.getY());
    }
}
