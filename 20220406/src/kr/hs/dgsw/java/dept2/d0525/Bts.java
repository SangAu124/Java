package kr.hs.dgsw.java.dept2.d0525;

public class Bts implements Job {

	@Override
	public void work() {
		System.out.println("BTS는 춤추고 노래합니다.");
	}

	@Override
	public int getPrice() {
		return 12460000;
	}

}
