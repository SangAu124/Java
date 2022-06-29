import java.io.File;

public class CommandExit extends AbstractCommand{
    public CommandExit(File phoneBook, String commandLine) {
        super(phoneBook, commandLine);
    }

    @Override
    public void executeCommand() {
        System.out.println("Terminating PhoneBook");
    }

    @Override
    public  boolean isExitCondition() { return true; }
}