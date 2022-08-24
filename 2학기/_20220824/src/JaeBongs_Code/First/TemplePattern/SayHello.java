package JaeBongs_Code.First.TemplePattern;

public class SayHello extends Parent{

    @Override
    public void doJob(String name) {
        System.out.printf("안녕하세요 %s님 \n", name);
    }

    public static void main(String[] args) {
        System.out.println("이름을 입력하세요.");
        SayHello sayHello = new SayHello();
        sayHello.execute();
    }

}