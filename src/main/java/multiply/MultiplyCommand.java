package multiply;

import ArithmaticHelper.Arithmatic;
import ArithmaticHelper.ArithmeticImpl;
import ArithmaticHelper.Command;
import ArithmaticHelper.Input;

public class MultiplyCommand implements Command {
    private Arithmatic arithmatic = new ArithmeticImpl();
    private Input input;

    public MultiplyCommand(Input input){
        this.input = input;
    }

    @Override
    public Integer execute() {
        return arithmatic.multiplyNumber(input.getX(), input.getY());
    }
}
