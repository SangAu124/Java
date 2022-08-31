package sangau_ioc;

import java.util.Scanner;

public class Bower {
    protected Scanner scanner;

    public Bower() {
        scanner = new Scanner(System.in);
    }

    public void execute() {
        HelloIF hello = new KoreanHello();
        while(true) {
            // 이름을 입력받는다
            String name = inputName();

            // 이름이 quit라면 반복문을 종료한다.
            if("quit".equals(name)) {
                break;
            }

            // 인사를 한다.
            hello.setName(name);
            hello.sayHello();
        }
        scanner.close();
    }

    public void execute(HelloIF hello) {
        while(true) {
            // 이름을 입력받는다
            String name = inputName();

            // 이름이 quit라면 반복문을 종료한다.
            if("quit".equals(name)) {
                break;
            }

            // 인사를 한다.
            hello.setName(name);
            hello.sayHello();
        }
        scanner.close();
    }

    protected String inputName() {
        System.out.printf("이름을 입력하세요. : ");
        return scanner.nextLine();
    }

}
