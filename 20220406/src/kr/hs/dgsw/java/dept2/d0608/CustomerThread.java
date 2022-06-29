package kr.hs.dgsw.java.dept2.d0608;

public class CustomerThread implements Runnable {

	private final String work;
	
	public CustomerThread(String work) {
		this.work = work;
	}
	
	@Override
	public void run() {
		System.out.printf("고객이 %s 일을 맡겼습니다. 일을 마칠 때까지 기다립니다.\n",
				work);
		
		synchronized (this) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		System.out.printf("고객이 수리가 완료된 스마트폰을 돌려 받습니다..\n");
		
	}
	
	public String getWork() {
		return work;
	}
	
}