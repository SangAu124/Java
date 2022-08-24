package kr.hs.dgsw.java.dept2.d0525;

public class SecondThread implements Runnable {

	private final long delay;
	private final String name;
	
	public SecondThread(String name, int delay) {
		this.delay = delay;
		this.name = name;
	}
	
	@Override
	public void run() {
		
		for(int i = 0; i < 10; i ++) {
			try {
				Thread.sleep(delay);
			} catch (InterruptedException e) {}
			
			System.out.println(name + " : " + i);
		}
		
	}
	
	public static void main(String[] args) {
		SecondThread t1 = new SecondThread("t1", 500);
		SecondThread t2 = new SecondThread("t2", 900);
		
		new Thread(t1).start();
		new Thread(t2).start();
	}

}
