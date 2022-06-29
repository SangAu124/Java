package kr.hs.dgsw.java.dept2.d0608;

/*
 * 
 * 계좌
 * 
 * */

public class Account {

	//소유주
	private String name;
	// 잔고
	private long balance;
	
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public long getBalance() {
		return balance;
	}
	
	public void setBalance(long balance) {
		this.balance = balance;
	}
	
}
