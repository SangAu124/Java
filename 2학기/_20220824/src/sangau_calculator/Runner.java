package sangau_calculator;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class Runner {
    public static final String CONFIG_FILE_PATH = "C:/90_ETC/calculator.config";

    public void start() {
        UserInput userInput = getUserInputClass();

        Machine machine = new Machine(userInput);
        addCalculators(machine);

        machine.execute();
    }

    protected UserInput getUserInputClass() {
        try {
            File file = new File(CONFIG_FILE_PATH);
            BufferedReader reader = new BufferedReader(new FileReader(file));

            String line = null;
            String className = null;
            while ((line = reader.readLine()) != null) {
                line = line.trim();
                if (line.startsWith("userInput")) {
                    String[] tokens = line.split("=");
                    className = tokens[1].trim();
                    break;
                }
            }

            reader.close();

            if (className == null) {
                return new RandomUserInput(3);
            } else {
                return (UserInput)Class.forName(className).newInstance();
            }
        } catch (Exception e) {
            throw new RuntimeException("Invalid config file", e);

        }

    }

    protected void addCalculators(Machine machine) {
        try {
            File file = new File(CONFIG_FILE_PATH);
            BufferedReader reader = new BufferedReader(new FileReader(file));

            String line = null;
            while ((line = reader.readLine()) != null) {
                line = line.trim();
                if (line.startsWith("Calculator")) {
                    String[] tokens = line.split(" ");

                    Calculator calculator = (Calculator)Class.forName(tokens[2]).newInstance();
                    machine.addCalculators(tokens[1], calculator);
                }
            }

            reader.close();

        } catch (Exception e) {
            throw new RuntimeException("Invalid config file", e);

        }
    }

    public static void main(String[] args) {
        new Runner().start();
    }
}