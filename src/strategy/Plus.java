package strategy;

public class Plus extends AbstractCalculator implements Calculator{
    @Override
    public int calculate(String exp) {
        int arrayInt[] = split(exp,"\\+");
        return arrayInt[0]+arrayInt[1];
    }
}
