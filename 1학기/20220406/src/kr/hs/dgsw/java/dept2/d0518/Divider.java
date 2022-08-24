package kr.hs.dgsw.java.dept2.d0518;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Divider {
	
	private final Scanner scanner;
	
	public Divider() {
		this.scanner = new Scanner(System.in);
	}
	
	private int calculate(int value1, int value2) {
		return value1 / value2;
	}
	
	private void execute() {
		
		try {
			System.out.println("두 정수를 입력하세요.");
			
			int value1 = scanner.nextInt();
			int value2 = scanner.nextInt();
			
			int result = calculate(value1, value2);
			System.out.printf("%d / %d = %d\n", value1, value2, result);
			
			savnResult(value1, value2, result);
			
			System.out.println("프로그램을 종료합니다.");
		}catch(InputMismatchException e) {
			System.out.println("문자가 아닌 숫자를 입력하세요");
			
		}catch(ArithmeticException e) {
			System.out.println("0으로는 나눌 수 없습니다.");
		}catch(Exception e) { 
			System.out.println("알 수 없는 이유로 연산이 수행되지 못했습니다.");
		}finally {
			this.scanner.close();
		}

		/*
		 	System.out.println("예외가 발생했습니다.  " + e);
			if (e instanceof InputMismatchException) {
				System.out.println("문자가 아닌 숫자를 입력하세요");
			}else if ( e instanceof ArithmeticException) {
				System.out.println("0으로는 나눌 수 없습니다.");
			}
		*/
		
	}
	
	private static final String FILE_PATH = "/Users/gimsang-eun/공부/6.자바/2학년수업/재봉/save.txt";
	
	private void savnResult(int value1, int value2, int result) {
		
		File file = new File(FILE_PATH); 
		
		String str = String.format("%d / %d = %d\n", value1, value2, result);
		
		OutputStream os = null;
		
		try {
			os = new FileOutputStream(file);
			os.write(str.getBytes());
		}catch (IOException e) {
			System.out.println("파일을 저장하지 못했습니다.");
		} finally {
			if (os != null) {
				try {
					os.close();
				} catch (IOException e) {}
			}
			
		}
		
		
		/*
		try {

			
			FileOutputStream output = new FileOutputStream(file);
			
			String rs = String.valueOf(value1) + " / " + String.valueOf(value2) + " = " + String.valueOf(result);
			
			
		} catch(Exception e) {
			
		}
		*/
	}
	
	public static void main(String[] args) {
		new Divider().execute();
	}

}
