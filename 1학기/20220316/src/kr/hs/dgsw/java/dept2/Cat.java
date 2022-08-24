package kr.hs.dgsw.java.dept2;

public class Cat {
	
	String name;
	String color;
	int age;
	
	public void makeSound() {
		System.out.println("냐옹");
	}
	
	public void eat(String food) {
		System.out.println(name + "이(가)" + food + "을(를) 먹습니다.");
	}
	
	public void printInformation() {
		System.out.println("이름 : " + name);
		System.out.println("색깔 : " + color);
		System.out.println("나이 : " + age);
	}
	
}
