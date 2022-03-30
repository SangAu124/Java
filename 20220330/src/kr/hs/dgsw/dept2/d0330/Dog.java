package kr.hs.dgsw.dept2.d0330;

public class Dog {
	
	private final String name;
	private int age;
	
	public Dog(String name) {
		this(name, 0);
	}
	public Dog(String name, int age) {
		this.name = name;
		this.age = age;
		System.out.println("생성자가 호되었습니다.");
	}
	
	public void print() {
		System.out.printf("%s 이름을 가진 강아지의 나이는 %d살입니다.\n",
				this.name, this.age);
	}
//	public void print(String name) {
//		System.out.println("Hello world " + name);
//	}
//	public void print(String address) {
//		System.out.println("나의 주소는" + address);
//	}
	public String getName() {
		return this.name;
	}
	public int getAge() {
		return this.age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public static void main(String[] args) {
		
		Dog happy = new Dog("헤피");
		happy.print();
		
		Dog puppy = new Dog("퍼피");
		
	}
}
