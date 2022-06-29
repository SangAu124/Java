import java.util.Scanner;
import java.util.Random;

public class RSPMain {

    private final Scanner scanner;
    private final Random random;
    private String strUserInput;
    private int userInput;
    private int comInput;

    private int win;
    private int lose;
    private int draw;

    public RSPMain() {
        this.scanner = new Scanner(System.in);
        this.random = new Random();
    }
    private void printManual() {
        System.out.println("안내면 진거 가위 바위 보!!!");
        System.out.println(" 가위    바위    보  중 하나를 입력하세요 (종료 : quit)");
    }
    private boolean scan() {
        strUserInput = scanner.nextLine();

        if(strUserInput.startsWith("가위")) {
            userInput = 1;
        } else if(strUserInput.startsWith("바위")) {
            userInput = 2;
        } else if(strUserInput.startsWith("보")) {
            userInput = 3;
        }

        System.out.println();

        if(strUserInput.equals("quit"))
            return true;
        else
            return false;
    }
    private void rspExecute() {
        comInput = random.nextInt(3);
        comInput++; // 사람 입력과 동일한 값으로 변경

        printInputs("사용자", userInput);
        printInputs("컴퓨터", comInput);

        int result = userInput - comInput;

        if ((result == 1) || (result == -2)) {
            System.out.println("승리");
            win++;
        } else if ((result == -1) || (result == 2)) {
            System.out.println("패배");
            lose++;
        } else if (result == 0) {
            System.out.println("비겼습니다.");
            draw++;
        } else {
            System.out.println("알 수 없는 이유로 가위바위보를 실패하였습니다.");
        }
        printResult();
        System.out.println();
    }
    private void printInputs(String name, int inputs) {
        System.out.printf("%s : ", name);
        if (inputs == 1){
            System.out.println("가위");
        } else if (inputs == 2) {
            System.out.println("바위");
        } else if (inputs == 3) {
            System.out.println("보");
        }
    }
    private void printResult() {
        System.out.printf("전적 : %d승 %d무 %d패\n", win, draw, lose);
    }
    private void printAllResult() {
        System.out.printf("총 ");
        printResult();
    }
    private void scanClose() {
        scanner.close();
    }
    private void execute() {

        while(true) {
            printManual();
            if(scan()){
                break;
            }
            rspExecute();
        }
        printAllResult();
        scanClose();

    }

    public static void main(String[] args) {
        RSPMain rspmain = new RSPMain();
        rspmain.execute();
    }

}
