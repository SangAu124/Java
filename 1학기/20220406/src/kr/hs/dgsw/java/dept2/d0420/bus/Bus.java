package kr.hs.dgsw.java.dept2.d0420.bus;

public class Bus {
	
	protected int income;
	protected int countOfAdults;
	protected int countOfStudents;
	protected int countOfElders;
	
	public Bus() {
		this.income = 0;
		this.countOfAdults = 0;
		this.countOfStudents = 0;
		this.countOfElders = 0;
	}
	
	public void payment(Card card) {
		
		if(card.canPayment()) {
			income += card.requestPayment();
			
			if(card.getType().equals("학생")) {
				this.countOfStudents++;
			} else if (card.getType().equals("성인")){
				this.countOfAdults++;
			} else {
				this.countOfElders++;
			}
				
				
			System.out.println(card.getType() + "입니다. 어서오세요.");
		} else {
			System.out.println("잔액이 부족합니다. 당장 내리세요.");
		}
		
	}
	
	public int getCountOfAdults() {
		return this.countOfAdults;
	}
	
	public int getCountOfStudents() {
		return this.countOfStudents;
	}
	
	public int getCountOfElders() {
		return this.countOfElders;
	}
	
	public int getIncome() {
		return this.income;
	}
	
	public static void main(String[] args) {
		Bus bus = new Bus();
		
		Card adult1 = new CardForAdult();
		adult1.charge(2000);
		Card adult2 = new CardForAdult();
		adult2.charge(5000);
		Card student1 = new CardForStudent();
		student1.charge(2000);
		Card student2 = new CardForStudent();
		student2.charge(1500);
		Card elder1 = new CardForElder();
		elder1.charge(400);
		Card elder2 = new CardForElder();
		elder2.charge(1000);
		
		
		bus.payment(adult1);
		bus.payment(adult2);
		
		bus.payment(adult1);
		bus.payment(adult2);
		
		bus.payment(student1);
		bus.payment(student1);
		
		bus.payment(student2);
		bus.payment(student2);
		
		bus.payment(elder1);
		bus.payment(elder2);
		
		System.out.println("오늘의 수입 : " + bus.getIncome());
		System.out.println("성인 손님 수 : " + bus.getCountOfAdults());
		System.out.println("학생 손님 수 : " + bus.getCountOfStudents());
		System.out.println("노인 손님 수 : " + bus.getCountOfElders());
		
	}
}
