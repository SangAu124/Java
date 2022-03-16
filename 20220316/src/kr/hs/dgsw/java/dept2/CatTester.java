package kr.hs.dgsw.java.dept2;

public class CatTester {
	
	public static void main(String[] args) {
		
		Cat cat1 = new Cat();
		Cat cat2 = new Cat();
		
		cat1.name = "나비";
		cat1.color ="파란색";
		cat1.age = 4;
		
		cat2.name = "꼬식";
		cat2.color = "노란색";
		cat2.age = 6;
		
		cat1.makeSound();
		cat1.eat("츄르");
		cat1.printInformation();
		
		cat2.makeSound();
		cat2.eat("사료");
		cat2.printInformation();
		
	}
	
}
