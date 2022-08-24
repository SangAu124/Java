package kr.hs.dgsw.Ex1;

public class Start {

	public static void main(String[] args) {
		
		People culsu = new People();
		People yunghe = new People();
		
		culsu.name = "culsu";
		culsu.height = 170;
		culsu.weight = 90;
		culsu.BMI = culsu.calBMI();
		culsu.Fat = culsu.isFat();
		culsu.printBMI(culsu.name, culsu.BMI, culsu.Fat);
		
		yunghe.name = "yunghe";
		yunghe.height = 165;
		yunghe.weight = 55;
		yunghe.BMI = yunghe.calBMI();
		yunghe.Fat = yunghe.isFat();
		yunghe.printBMI(yunghe.name, yunghe.BMI, yunghe.Fat);
		
	}
	
}
