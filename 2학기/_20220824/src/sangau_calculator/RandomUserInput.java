package sangau_calculator;

import java.util.Random;

public class RandomUserInput implements UserInput {
    protected final Random random;

    protected final int countOfRepeat;

    protected int count = 0;

    public RandomUserInput(int count) {
        this.random = new Random();
        this.countOfRepeat = count;
    }

    @Override
    public String getOperator() {
        count++;

        if (count > countOfRepeat) {
            return "quit";
        }

        int number = random.nextInt(1);

        if (number == 0) {
            return "+";
        } else {
            return null;
        }
    }

    @Override
    public void setPrompt(String prompt) {
    }

    @Override
    public int[] getOperands(int count) {
        int[] result = new int[count];

        for (int i = 0 ; i < count ; i++) {
            result[i] = random.nextInt(100);
        }

        return result;
    }

    @Override
    public void close() {
        // do nothing
    }
}