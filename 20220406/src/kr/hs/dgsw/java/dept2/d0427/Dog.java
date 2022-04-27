package kr.hs.dgsw.java.dept2.d0427;

public class Dog extends Animal {

	@Override
	public String makeSound() {
		return "멍멍";
	}

	@Override
	public String getName() {
		return "강아지";
	}
	
	public void eat() {
		System.out.println("와구와구 먹습니다.");
	}
	
	public static void main(String[] args) {
		
		Dog dog = new Dog();
		Animal dog1 = new Dog();
		
		dog1.move();
		
	}
	
	
}
