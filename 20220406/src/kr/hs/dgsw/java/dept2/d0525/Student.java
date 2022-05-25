package kr.hs.dgsw.java.dept2.d0525;

public class Student implements Job {
	
	@Override
	public void work() {
		System.out.println("학생이 열심히 공부를 합니다.");
	}
	
	@Override
	public int getPrice() {
		return 0;
	}
	
}
