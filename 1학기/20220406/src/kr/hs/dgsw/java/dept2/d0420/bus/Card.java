package kr.hs.dgsw.java.dept2.d0420.bus;

public class Card {
	
	protected int balance;
	
	public Card() {
		this.balance = 0;
	}
		
	public void charge(int amount) {
		this.balance += amount;
	}
	
	public int requestPayment() {
		return 0;
	}
	
	public boolean canPayment() {
		return false;
	}
	
	public String getType() {
		return null;
	}
	
	
}
