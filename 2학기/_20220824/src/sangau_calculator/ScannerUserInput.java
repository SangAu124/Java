package sangau_calculator;

import java.util.Scanner;

public class ScannerUserInput implements UserInput {
    protected Scanner scanner;

    public ScannerUserInput() {
        this.scanner = new Scanner(System.in);
    }

    @Override
    public String getOperator() {
        System.out.print("연산자 : ");
        return scanner.next();
    }

    @Override
    public void setPrompt(String prompt) {
        System.out.println(prompt);
    }

    @Override
    public int[] getOperands(int count) {
        int[] result = new int[count];

        for (int i = 0 ; i < count ; i++) {
            result[i] = scanner.nextInt();
        }

        return result;
    }

    @Override
    public void close() {

    }
}