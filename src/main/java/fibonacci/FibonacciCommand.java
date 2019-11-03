package fibonacci;

import ArithmaticHelper.Command;
import ArithmaticHelper.Constants;

public class FibonacciCommand implements Command {
    private FibonacciGenerator fibonacciGenerator = new FibonacciGenerator();
    private Integer limit;

    public FibonacciCommand(Integer limit){
        this.limit = limit;
    }

    @Override
    public Object execute()throws Exception {
        if(limit == 0){
            throw new Exception(Constants.INVALID_LIMIT);
        }
        return fibonacciGenerator.generate(limit);
    }
}
