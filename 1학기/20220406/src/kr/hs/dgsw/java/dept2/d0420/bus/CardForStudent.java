package kr.hs.dgsw.java.dept2.d0420.bus;

public class CardForStudent extends CardForAdult {

	@Override
	public int getFee() {
		return 800;
	}
	
	@Override
	public String getType() {
		return "학생";
	}
	
}
