package ArithmaticHelper;

public class ArithmeticImpl implements Arithmatic{
    @Override
    public Integer sumNumber(Integer x, Integer y) {
        return x+y;
    }

    @Override
    public Integer multiplyNumber(Integer x, Integer y) {
        return x * y;
    }

    @Override
    public Integer divideNumber(Integer x, Integer y) {
        return x % y;
    }
}
