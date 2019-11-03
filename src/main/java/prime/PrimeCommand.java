package prime;

import ArithmaticHelper.Command;
import ArithmaticHelper.Constants;

public class PrimeCommand implements Command {
    private PrimeGenerator primeGenerator = new PrimeGenerator();
    private Integer limit;

    public PrimeCommand(Integer limit){
        this.limit = limit;
    }

    @Override
    public Object execute() throws Exception{
        if(limit == 0){
            throw new Exception(Constants.INVALID_LIMIT);
        }
        return primeGenerator.generate(limit);
    }
}
