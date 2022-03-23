package kr.hs.dgsw.java.dept2.d0323;

public class DataTypeStudy {
	
	public void studyInteger() {
		byte byteValue = 127;
		short shortValue = 32767;
		int intValue = 2147483647;
		long longValue = 10000000000L;
	}
	
	public void studyReal() {
		float floatValue = 123453.1415926123456890F;
		double doubleValue = 123453.14159261234567890;
		
		System.out.println(floatValue);
		System.out.println(doubleValue);
	}
	
	public void studyBoolean() {
		
		boolean b1 = (4 > 2);
		boolean b2 = (3 == 2);
//		boolean b3 = 3;
		
		System.out.println(b1);
		System.out.println(b2);
		
		if (4 > 2) {
			System.out.println("OK");
		}
		
	}
	
	public void studyChar() {
		char ch1 = 'a';
		char ch2 = 'a' + 1;
		int ch3 = 65;
		
		char ch4 = 'ㄱ';
		char ch5 = '天';
		
		System.out.println((int)ch1);
		System.out.println(ch2);
		System.out.println((char)ch3);
		System.out.println((int)ch4);
		System.out.println((int)ch5);
		
		System.out.printf("\n\n\n");
		
		int countOfHangeu = '힣' - '가' + 1;
		System.out.println("한글코드의 개수 : " + countOfHangeu);
		
		for(char ch = '가'; ch < '깋'; ch++) {
			System.out.printf("%d - %c\n", (int)ch, ch);
		}
		
	}
	
	public void printAscii() {
		for(int i = 0; i < 256; i++) {
			char ch = (char)i;
			
			System.out.printf("%d - %c\n", i, ch);
//			System.out.println((char)i);
		}
		
	}
	
	public static void main(String[] args) {
		DataTypeStudy study = new DataTypeStudy();
		study.studyChar();
	}
}
