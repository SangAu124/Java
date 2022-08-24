package kr.hs.dgsw.java.dept2.d0608;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Bank {
	
	private Map<String, Account> accountMap = new HashMap<String, Account>();

	public Account makeAccount(String name) {
		Account account = new Account();
		
		account.setName(name);
		account.setBalance(0);
		
		accountMap.put(name, account);
		
		return account;
	}
	
	public void deposit(String name, int amount) {
		System.out.printf("%s 고객이 %d원을 입금합니다.\n", name, amount);
		//계좌를 가져온다.
		delay();
		Account account = accountMap.get(name);
		
		delay();
		if(account != null) {
			synchronized (account) {
				//잔고를 확인한다.
				long balance = account.getBalance();
				
				//잔고를 증가시킨다.
				delay();
				balance = balance + amount;
				
				//잔도를 저장한다.
				delay();
				account.setBalance(balance);
			}
		}
		delay();
		System.out.printf("%s 고객의 입금이 완료되었습니다.\n", name, amount);
	}
	
	private void delay() {
		try {
			Thread.sleep(new Random().nextInt(1000) + 500);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	public Account getAccount(String name) {
		return accountMap.get(name);
	}
	
	public static void main(String[] args) {
		
		Bank bank = new Bank();
		
		bank.makeAccount("김상은");
		
		// 아르바이트 비용
		DepositThread arbeit = new DepositThread(bank, "김상은", 300000);
		new Thread(arbeit).start();
		
		// 용돈
		DepositThread parent = new DepositThread(bank, "김상은", 100000);
		new Thread(parent).start();
		
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e){}
		
		Account account = bank.getAccount("김상은");
		System.out.printf("%s 고객의 계좌 잔고는 %d원 입니다. \n", account.getName(), account.getBalance());
		
	}
	
}















