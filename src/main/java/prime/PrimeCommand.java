package prime;

import ArithmaticHelper.Command;

public class PrimeCommand implements Command {
    private PrimeGenerator primeGenerator = new PrimeGenerator();
    private Integer limit;

    public PrimeCommand(Integer limit){
        this.limit = limit;
    }

    @Override
    public Object execute() {
        return primeGenerator.generate(limit);
    }
}
