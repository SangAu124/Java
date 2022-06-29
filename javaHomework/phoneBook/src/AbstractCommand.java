import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;

public abstract class AbstractCommand {
    protected final File phoneBook;
    protected final String commandLine;

    public AbstractCommand(File phoneBook, String commandLine) {
        this.phoneBook = phoneBook;
        this.commandLine = commandLine;
    }

    public boolean isExitCondition() { return false; }

    private static void checkRegError(String line) {
        String[] inputArg = line.split(" ");
        String phoneNum = inputArg[2];
        if (inputArg.length >= 4) {
            System.out.println("전화번호끼리 띄어쓰기를 사용하지 말아주세요!!");
            PhoneBookMain pbm = new PhoneBookMain();
            pbm.receiveCommand();
        } else if (inputArg.length <= 2) {
            System.out.println("이름과 전화번호를 띄워주세요!!");
            PhoneBookMain pbm = new PhoneBookMain();
            pbm.receiveCommand();
        }
        if (!((phoneNum.charAt(0) >= 48) && (phoneNum.charAt(0) <= 57))) {
            System.out.println("전화번호에는 숫자를 입력해 주세요!!!");
            PhoneBookMain pbm = new PhoneBookMain();
            pbm.receiveCommand();
        }

    }
    public abstract void executeCommand();

//    public ArrayList<String> searchPhoneNumber(File phoneBook, String key) { return null; }

    public ArrayList<String> searchPhoneNumber(File phoneBook, String key){

        ArrayList<String> valuePhoneNumbers = new ArrayList<>();

        try {
            if (phoneBook.exists()) {

                BufferedReader inFile = new BufferedReader(new FileReader(phoneBook));

                String oneLineOfPhoneBook;

                while((oneLineOfPhoneBook = inFile.readLine()) != null) {
                    if(oneLineOfPhoneBook.contains(key)) {
                        valuePhoneNumbers.add(oneLineOfPhoneBook);
                    }
                }

                valuePhoneNumbers.sort(String.CASE_INSENSITIVE_ORDER);

            }
        } catch (Exception e) {
            System.out.println("알 수 없는 이유로 검색에 실패했습니다.");
        }
        return valuePhoneNumbers;
    }

    public static AbstractCommand build(File phoneBook, String line) throws UnknownCommandException {
        if(line.startsWith("1")) {
            checkRegError(line);
            return new CommandReg(phoneBook, line);
        } else if (line.startsWith("2")) {
            return new CommandPSearch(phoneBook, line);
        } else if (line.startsWith("3")) {
            return new CommandNSearch(phoneBook, line);
        } else if (line.startsWith("4")) {
            return new CommandDelete(phoneBook, line);
        } else if (line.startsWith("5")) {
            return new CommandExit(phoneBook, line);
        } else {
            throw new UnknownCommandException();
        }
    }

    public static void main(String[] args) {
        PhoneBookMain pbm = new PhoneBookMain();
        pbm.execute();
    }

}
