package kr.hs.dgsw.java.dept2.d0525;

public class Sprint100 {
	
	public static class Athlete implements Runnable {
		
		private final String name;
		private final double record; 
		
		public Athlete(String name, double record) {
			this.name = name;
			this.record = record;
		}
		
		@Override
		public void run() {
			double distance = 0;
			int times = 0;
			
			while(true) {
				distance = times * (100 / record);
				
				System.out.printf("%s 선수가 %d초 동안 %.2f을 달렸습니다. \n", name, times, distance);
				
				if (distance > 100) {
					break;
				}
				
				times++;
				
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {}
			}
			
		}
	}
	
	public void play() {
		
		Athlete usainBolt = new Athlete("우사인볼트", 9.58);
		Athlete kim = new Athlete("김국영", 10.07);
		Athlete fastStudent = new Athlete("빠른 친구", 12.34);
		Athlete slowStudent = new Athlete("거북이", 19.44);
		
		new Thread(slowStudent).start();
		new Thread(fastStudent).start();
		new Thread(kim).start();
		new Thread(usainBolt).start();
		
	}
	
	public static void main(String[] args) {
		Sprint100 sprint100 = new Sprint100();
		sprint100.play();
	}

}
