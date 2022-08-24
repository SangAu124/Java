package kr.hs.dgsw.java.dept2.d0608;

public class SyncStudy {
	
	public static Object obj = new Object();
	
	public static class Waiter implements Runnable {

		@Override
		public void run() {
			System.out.println("Waiter 스레드가 시작합니다.");
			synchronized (obj) {
				try {
					System.out.println("Waiter 스레드가 동작을 중단합니다.");
					obj.wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			System.out.println("Waiter 스레드가 동작을 재개 합니다.");
		}
		
	}
	
	public static void main(String[] args) throws Exception {
		new Thread(new Waiter()).start();
		
		Thread.sleep(5000);
		
		synchronized(obj) {
			obj.notify();
		}
	}

}
