import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;

public class CommandReg extends AbstractCommand {

    public CommandReg(File phoneBook, String commandLine) {
        super(phoneBook, commandLine);
    }

    @Override
    public void executeCommand() {

        String[] inputArgs = commandLine.split(" ");
        OutputStream os = null;

        String name = inputArgs[1];
        String phoneNumber = inputArgs[2];
        String str = String.format("%s : %s\n", name, phoneNumber);

        try {
            os = new FileOutputStream(phoneBook, true);
            os.write(str.getBytes());
            System.out.printf("%s, 님의 전화번호 %s 이(가) 성공적으로 저장되었습니다\n\n", name, phoneNumber);
        } catch (Exception e) {
            System.out.println("알 수 없는 이유로 파일을 저장하지 못했습니다.");
        } finally {
            if(os != null) {
                try {
                    os.close();
                } catch (IOException e) {}
            }
        }

    }
}
