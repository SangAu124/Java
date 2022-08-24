package kr.hs.dgsw.java.dept2.d0525;

import java.util.Random;

public class Join {

	public static class ChildThread implements Runnable {

		@Override
		public void run() {
			System.out.println("자식 스레드가 시작되었습니다.");
			
			try {
				Thread.sleep(new Random().nextInt(3000) + 10000);
			} catch (InterruptedException e) {}
			
			System.out.println("자식 스레드가 종료되었습니다.");
			
		}
		
	}
	
	public static void main(String[] args) {
		Thread childThread = new Thread(new ChildThread());
		childThread.start();
		
		System.out.println("부모 스레드가 자식 스레드의 종료를 기다립니다.");
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {}
		
		childThread.interrupt();
		/*
		try {
			childThread.join();
		} catch (InterruptedException e) {}
		*/
		System.out.println("자식 스레드가 종료했음으로 부모 스레드가 동작을 재개합니다.");
	}
	
}
