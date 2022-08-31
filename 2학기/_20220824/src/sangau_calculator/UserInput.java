package sangau_calculator;

public interface UserInput {

    public String getOperator();

    public void setPrompt(String prompt);

    public int[] getOperands(int count);

    public void close();

}