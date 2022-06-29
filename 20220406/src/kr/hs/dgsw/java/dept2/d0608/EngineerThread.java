package kr.hs.dgsw.java.dept2.d0608;

public class EngineerThread implements Runnable {

	private final ServiceCenter serviceCenter;
	
	private final int id;
	
	public EngineerThread(ServiceCenter serviceCenter,
			int id) {
		this.serviceCenter = serviceCenter;
		this.id = id;
	}
	
	@Override
	public void run() {
		while (true) {
			CustomerThread work = serviceCenter.getWork();
			
			if (work != null) {
				System.out.printf("%d 스레드 작업 시작 : %s\n",id, work.getWork());
				
				try {
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				
				synchronized (work) {
					work.notify();
				}
				
				System.out.printf("%d 스레드 작업 종료\n", id);
			} else {
				synchronized (serviceCenter) {
					try {
						System.out.printf("%d 스레드 휴식 중\n", id);
						serviceCenter.wait();
						System.out.printf("%d 스레드 작업 재개\n", id);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
			
		}
	}
}