package JaeBongs_Code;

import java.util.Scanner;

public abstract class Parent {
    protected Scanner scanner;

    public Parent() {
        scanner = new Scanner(System.in);
    }

    public void execute() {
        while (true) {
            String name = inputName();
            if ("quit".equals(name)) {
                break;
            }
            doJob(name);
        }
        scanner.close();
    }
    protected String inputName() {
        String name = scanner.nextLine();
        return name;
    }

    public abstract void doJob(String name);
}
