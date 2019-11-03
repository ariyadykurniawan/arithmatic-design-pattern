package fibonacci;

import ArithmaticHelper.Command;

public class FibonacciCommand implements Command {
    private FibonacciGenerator fibonacciGenerator = new FibonacciGenerator();
    private Integer limit;

    public FibonacciCommand(Integer limit){
        this.limit = limit;
    }

    @Override
    public Object execute()throws Exception {
        return fibonacciGenerator.generate(limit);
    }
}
