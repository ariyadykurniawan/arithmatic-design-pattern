package devide;

import ArithmaticHelper.Arithmatic;
import ArithmaticHelper.ArithmeticImpl;
import ArithmaticHelper.Command;
import ArithmaticHelper.Input;

public class DevideCommand implements Command {
    private Arithmatic arithmatic = new ArithmeticImpl();
    private Input input;

    public DevideCommand(Input input){
        this.input = input;
    }

    @Override
    public Integer execute() {
        return arithmatic.divideNumber(input.getX(), input.getY());
    }
}
