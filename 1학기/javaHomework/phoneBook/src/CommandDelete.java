import javax.sound.midi.Soundbank;
import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class CommandDelete extends AbstractCommand{

    private final Scanner scanner;
    public CommandDelete(File phoneBook, String commandLine) {
        super(phoneBook, commandLine);
        this.scanner = new Scanner(System.in);
    }

    @Override
    public void executeCommand() {

        String[] inputArgs = commandLine.split(" ");
        String name = inputArgs[1];

        ArrayList<String> valuePhoneNumbers;
        valuePhoneNumbers = searchPhoneNumber(phoneBook, name);

        if (valuePhoneNumbers.size() == 0)
            System.out.println("삭제하실 이름의 전화번호가 없습니다.");
        else if (valuePhoneNumbers.size() == 1) {
            System.out.printf("%s ,를 삭제합니다.", valuePhoneNumbers.get(0));
            delete(valuePhoneNumbers.get(0));
        }
        else {
            System.out.println("삭제하실 전화번호의 번호를 입력해 주세요");
            for (int i = 0; i < valuePhoneNumbers.size(); i++) {
                System.out.printf("%d. %s\n", i + 1, valuePhoneNumbers.get(i));
            }
            int inputIdx = scanner.nextInt() - 1;
            System.out.println(inputIdx);

            if (inputIdx < 0 || inputIdx > valuePhoneNumbers.size() - 1) {
                System.out.println("잘못된 범위입니다.");
                throw new IndexOutOfBoundsException();
            }

            delete(valuePhoneNumbers.get(inputIdx));
            System.out.println();
        }
    }

    public void delete(String position) {
        File file = new File(phoneBook.getPath());
        String dummy = "";
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(file)));

            String line;
            while((line = br.readLine())!=null) {
                if(line.equals(position)) {
                    continue;
                }
                dummy += (line + "\r\n" );
            }

            //4. FileWriter를 이용해서 덮어쓰기
            FileWriter fw = new FileWriter(phoneBook);
            fw.write(dummy);

            System.out.println("해당 전화번호를 삭제하였습니다.");

            //bw.close();
            fw.close();
            br.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}