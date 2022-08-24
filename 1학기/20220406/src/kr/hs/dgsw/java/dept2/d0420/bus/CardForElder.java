package kr.hs.dgsw.java.dept2.d0420.bus;

public class CardForElder extends CardForAdult{

	@Override
	public int getFee() {
		return 500;
	}
	
	@Override
	public String getType() {
		return "노인";
	}
	
}
