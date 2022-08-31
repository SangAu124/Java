package sangau_calculator;

public class Squarer extends Adder {

    @Override
    public int calculate() {
        return operands[0] * operands[0];
    }

    @Override
    public void showResult() {
        System.out.printf("%d ^ 2 = %d\n", operands[0], calculate());
    }
}