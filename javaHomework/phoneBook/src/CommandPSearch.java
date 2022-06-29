import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;

public class CommandPSearch extends AbstractCommand{
    public CommandPSearch(File phoneBook, String commandLine) {
        super(phoneBook, commandLine);
    }

    @Override
    public void executeCommand() {
        String[] inputArgs = commandLine.split(" ");
        String phoneNumber = inputArgs[1];

        ArrayList<String> valuePhoneNumbers;
        valuePhoneNumbers = searchPhoneNumber(phoneBook, phoneNumber);

        if (valuePhoneNumbers.size() == 0)
            System.out.println("검색하신 전화번호가 없습니다.");

        for(int i = 0; i < valuePhoneNumbers.size(); i++) {
            System.out.printf("%s\n", valuePhoneNumbers.get(i));
        }
        System.out.println();
    }
}