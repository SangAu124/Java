package kr.hs.dgsw.java.dept2.d0420.bus;

public class CardForAdult extends Card {
	
	public int getFee() {
		return 1200;
	}

	@Override
	public int requestPayment() {
		
		if(this.canPayment()) {
			this.balance -= getFee();
			return getFee();
		} else { return 0; }
		
	}
	
	@Override
	public boolean canPayment() {
		return this.balance >= getFee();
	}
	
	@Override
	public String getType() {
		return "성인";
	}
	
}
