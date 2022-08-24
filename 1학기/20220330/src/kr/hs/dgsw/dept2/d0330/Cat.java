package kr.hs.dgsw.dept2.d0330;

public class Cat {

	private final String name;
	private final String color;
	private int weight;
	
	
	public Cat(String name, String color) {
		this(name, 0, color);
	}
	public Cat(String name, int weight, String color) {
		this.name = name;
		this.weight = weight;
		this.color = color;
		System.out.println("생성자가 호출되었습니다.");
	}
	
	
	public void print() {
		System.out.printf("%s 라는 이름을 가진 고양이의 무게는 %d 이고 색깔은 %s입니다.",
				this.name, this.weight, this.color);
	}
	
	public String getName() {
		return this.name;
	}
	
	
	public String getColot() {
		return this.color;
	}
	
	
	public int getWeight() {
		return this.weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	
	
	public static void main(String[] args) {
		
		Cat nabi = new Cat("nabi", 50, "black");
		nabi.print();		
	}
	
}
