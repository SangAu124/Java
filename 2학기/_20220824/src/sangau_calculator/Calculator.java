package sangau_calculator;

public interface Calculator {

    public int calculate();

    public void showResult();

    public void setOperands(int[] values);

    public int getCountOfOperands();

}