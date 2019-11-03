package prime;

import ArithmaticHelper.Input;
import devide.DevideCommand;

import java.util.ArrayList;
import java.util.List;

public class PrimeGenerator {
    private DevideCommand devideCommand;

    public List<Integer> generate(int limit){

        List<Integer> listPrime=new ArrayList<Integer>();
        boolean isPrime;

        int i = 2;
        while(listPrime.size() < limit){
            isPrime=true;
            for(int j=2;j< i ;j++){
                devideCommand = new DevideCommand(new Input(i,j));
                if(devideCommand.execute()==0){
                    isPrime=false;
                    break;
                }
            }
            if(isPrime)listPrime.add(i);
            i++;
        }

        return listPrime;

    }
}
