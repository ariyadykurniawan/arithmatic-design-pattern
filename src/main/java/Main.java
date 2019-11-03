import ArithmaticHelper.Input;
import fibonacci.FibonacciCommand;
import multiply.MultiplyCommand;
import prime.PrimeCommand;
import sum.SumCommand;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Date start = new Date();

        try {
            SumCommand sumCommand = new SumCommand(new Input(null,2));
            MultiplyCommand multiplyCommand = new MultiplyCommand(new Input(2,3));
            FibonacciCommand fibonacciCommand = new FibonacciCommand(1);
            PrimeCommand primeCommand = new PrimeCommand(1000);

            System.out.println(sumCommand.execute());
            System.out.println(multiplyCommand.execute());
            System.out.println(fibonacciCommand.execute());
            System.out.println(primeCommand.execute());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        System.out.println((new Date().getTime()) - start.getTime());
    }
}
