package sangau_ioc;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class Main {
    protected  HelloIF hello;
    public static final String CONFIG_FILE_PATH = "";

    public static void main(String[] args) {
        HelloIF hello = new EnglishHello();
        Bower bower = new Bower();
        bower.execute(hello);
    }
    protected void prepareDependencies() {
        String className = readConfigFile();

        try {
            hello = (HelloIF)Class.forName(className).newInstance();
            System.out.println("hello : " + hello);
        } catch (Exception e) {
            throw new RuntimeException("Invalid configuration");
        }
    }
    protected String readConfigFile() {
        try {
            File file = new File(CONFIG_FILE_PATH);
            BufferedReader reader = new BufferedReader(new FileReader((file)));

            String className = reader.readLine();
            reader.close();
            return  className;
        } catch (Exception e) {
            throw new RuntimeException("Cannot read the config file", e);
        }
    }

    public void execute() {
        prepareDependencies();
        String className= readConfigFile();

        try {

        } catch (Exception e) {
            throw new RuntimeException("Invalid configuration");
        }
    }
}
