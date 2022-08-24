package kr.hs.dgsw.java.dept2.d0525;

public class Developer implements Job {

	@Override
	public void work() {
		System.out.println("프로그램 개발자가 열심히 프로그래밍을 합니다.");
	}

	@Override
	public int getPrice() {
		return 100000;
	}

	
	
}
