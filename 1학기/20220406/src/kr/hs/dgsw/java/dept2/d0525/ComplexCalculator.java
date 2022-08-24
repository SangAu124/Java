package kr.hs.dgsw.java.dept2.d0525;

import java.util.Scanner;

public class ComplexCalculator {

	private final Scanner scanner;
	
	public ComplexCalculator() {
		this.scanner = new Scanner(System.in);
	}
	
	public void execute() {
		while(true) {
			System.out.println("두 정수를 입력하세요.");
			int value1 = scanner.nextInt();
			int value2 = scanner.nextInt();
			
			if(value1 == 0 && value2 == 0) {
				break;
			}
			
			calculateAndPrint(value1, value2);
		}
		System.out.println("프로그램을 종료합니다.");
	}
	
	public void calculateAndPrint(int value1, int value2) {
		CalculateThread calculateThread = new CalculateThread(value1, value2);
		new Thread(calculateThread).start();
	}
	
	public static class CalculateThread implements Runnable {
		
		private final int value1;
		private final int value2;

		public CalculateThread(int value1, int value2) {
			this.value1 = value1;
			this.value2 = value2;
		}
		
		@Override
		public void run() {
			try {
				Thread.sleep(15 * 1000);
			} catch (InterruptedException e) {}
			
			int result = value1 + value2;
			
			System.out.printf("%d + %d = %d\n", value1, value2, result);
		}
		
	}
	
	public static void main(String[] args) {
		ComplexCalculator complexCalculator = new ComplexCalculator();
		complexCalculator.execute();
	}
	
}
