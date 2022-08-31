package sangau_calculator;

public class Factorialer extends Adder {

    @Override
    public int calculate() {
        int tmp = 0;
        int result = 0;
        for(int i = operands[0]; i == 1; i--){
            tmp = operands[0] * operands[0] - 1;
            result += tmp;
        }
        return result;
    }

    @Override
    public void showResult() {
        System.out.printf("%d! = %d\n", operands[0], calculate());
    }
}
