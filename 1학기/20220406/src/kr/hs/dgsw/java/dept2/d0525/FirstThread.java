package kr.hs.dgsw.java.dept2.d0525;

public class FirstThread extends Thread {

	private final long delay;
	
	public FirstThread(int delay) {
		this.delay = delay;
	}
	
	@Override
	public void run() {
		
		for(int i = 0; i < 10; i ++) {
			try {
				Thread.sleep(delay);
			} catch (InterruptedException e) {}
			
			System.out.println(getName() + " : " + i);
		}
	}
	
	public static void main(String[] args) {
		FirstThread t1 = new FirstThread(800);
		t1.setName("T1");
		
		FirstThread t2 = new FirstThread(300);
		t2.setName("T2");
		
		t1.start();
		t2.start();
		
		for(int i = 0; i < 10; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {}
			System.out.println("메인 스레드 : " + i);
		}
	}
	
}
