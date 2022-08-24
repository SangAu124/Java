package kr.hs.dgsw.Ex1;

public class People {
	
	
	String name;
	double height;
	double weight;
	double BMI;
	String Fat;
	
	public double calBMI() {
		
		double cmHeight = (this.height*0.01);
		
		double BMI = (this.weight / (cmHeight * cmHeight));
		return BMI;
	}
	
	public String isFat() {
		
		String Fat;
		
		if(this.BMI < 20) {
			Fat = "저체중";
		}
		else if(this.BMI < 25 || this.BMI >= 20) {
			Fat = "표준체중";
		}
		else {
			Fat = "과체중";
		}
		
		return Fat;
	}
	
	public void printBMI(String name, double BMI, String Fat) {
		System.out.printf("%s의 비만도는 %.2f이고 %s입니다.\n", name, BMI, Fat);
	}
	
}
