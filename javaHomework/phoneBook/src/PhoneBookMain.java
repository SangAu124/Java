import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

// TODO: 2022/06/16 :: 사용자가 처음 실행했을 때도 잘 사용할 수 있도록 print잘해주기
// TODO: 2022/06/16 :: 검색 기능 만들 때 파일에서 값 contain으로 받아와서 arrayList에 넣어준 뒤 sort해서 출력 

public class PhoneBookMain {

    protected final Scanner scanner;
    protected File phoneBook;

    public PhoneBookMain() {
        this.scanner = new Scanner(System.in);
        this.phoneBook = new File("/Users/gimsang-eun/공부/6.자바/phoneBook.txt");
    }

    public void execute() {
        /* 시작 prompt */
        System.out.println("PhoneBook Started\n");

        System.out.println("** 전화번호부 사용방법**");

        /* Loop */
        AbstractCommand command = null;
        while (true) {

            System.out.println("1 : 전화번호 등록 ( 1 name phoneNumber )\t\t\t2 : 전화번호 일부로 전화번호 검색하기 ( 2 phoneNumber )\t\n3 : 이름으로 전화번호 검색 ( 3 name" +
                    " )\t\t\t\t\t4 : 전화번호 삭제하기 ( 4 name )\t\t\t\t\t\t5 : 프로그램 종료(5)");

            /* Command 등록 */
            try {
                command = receiveCommand();
            } catch (Exception e) {
                System.out.println("Invalid command");
                continue;
            }

            /* Command 수행 */
            command.executeCommand();

            if (command.isExitCondition()) {
                break;
            }
        }

        /* 자원 회수 */
        this.scanner.close();

        /* 종료 prompt */
        System.out.println("PhoneBook Terminated");
    }
    protected AbstractCommand receiveCommand() throws UnknownCommandException {
        String line = this.scanner.nextLine();
        return AbstractCommand.build(this.phoneBook, line);
    }

}
