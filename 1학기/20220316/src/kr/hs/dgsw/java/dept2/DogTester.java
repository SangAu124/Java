package kr.hs.dgsw.java.dept2;

public class DogTester {

	public static void main(String[] args) {
		
		Dog jindo = new Dog();
		Dog chichu = new Dog();
		
		jindo.name = "흰둥이";
		jindo.color = "노란색";
		jindo.age = 3;
		
		chichu.name = "검둥이 ";
		chichu.color = "분홍색";
		chichu.age = 7;
		
		
		jindo.makeSound();
		jindo.eat("개껌");
		jindo.printInformation();
		
		chichu.makeSound();
		chichu.eat("사료");
		chichu.printInformation();
		
	}
	
}
