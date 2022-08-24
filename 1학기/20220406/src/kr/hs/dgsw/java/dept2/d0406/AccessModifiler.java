package kr.hs.dgsw.java.dept2.d0406;

public class AccessModifiler {

	public int publicValue;
	private int privateValue;
	protected int protectedValue;
	int defaultValue;
	
	public static void main(String[] args) {
		
		AccessModifiler accessModifiler = new AccessModifiler();
		
		accessModifiler.publicValue = 5;
		accessModifiler.privateValue = 3;
		accessModifiler.protectedValue = 4;
		accessModifiler.defaultValue = 1;
		
	}
	
}
