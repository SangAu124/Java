package sangau_calculator;

public class Multiplier extends Adder {

    @Override
    public int calculate() {
        return operands[0] * operands[1];
    }

    @Override
    public void showResult() {
        System.out.printf("%d * %d = %d\n", operands[0], operands[1], calculate());
    }
}