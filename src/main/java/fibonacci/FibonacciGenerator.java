package fibonacci;

import ArithmaticHelper.Input;
import sum.SumCommand;

import java.util.ArrayList;
import java.util.List;

public class FibonacciGenerator {
    private SumCommand sumCommand;
    public List<Integer> generate(Integer limit){
        List<Integer> result = new ArrayList<Integer>();
        if(limit == 0){
            return result;
        }

        if(limit == 1){
            result.add(0);
            return result;
        }

        if(limit == 2){
            result.add(0);
            result.add(1);
            return result;
        }

        result.add(0);
        result.add(1);

        for(int i = 2; i < limit; i++){
            int x = result.get(i-2);
            int y = result.get(i-1);
            sumCommand = new SumCommand(new Input(x,y));
            try {
                result.add(sumCommand.execute());
            } catch (Exception e) {
                e.getMessage();
            }
        }
        return result;
    }
}
