package strategy;

public class Multiply extends AbstractCalculator implements Calculator {
    @Override
    public int calculate(String exp) {
        int array[] = split(exp,"\\*");
        return array[0]*array[1];
    }
}