package sangau_calculator;

import java.util.HashMap;
import java.util.Map;

public class Machine {
    protected Map<String, Calculator> calculatorMap;

    protected UserInput userInput;

    public Machine(UserInput userInput) {
        this.calculatorMap = new HashMap<>();
        this.userInput = userInput;
    }

    public void execute() {
        while (true) {
            String operator = userInput.getOperator();

            if ("quit".equals(operator)) {
                break;
            }

            Calculator calculator = calculatorMap.get(operator);
            if (calculator == null) {
                throw new RuntimeException("Unsupported calculation - " + operator);
            }

            String prompt = String.format("정수 %d개를 입력하세요.", calculator.getCountOfOperands());
            userInput.setPrompt(prompt);

            int[] operands = userInput.getOperands(calculator.getCountOfOperands());
            calculator.setOperands(operands);
            calculator.showResult();
        }

        userInput.close();
    }

    public void addCalculators(String operator, Calculator calculator) {
        System.out.println(operator + "  " + calculator);
        calculatorMap.put(operator, calculator);
    }
}