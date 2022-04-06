package sub;

import kr.hs.dgsw.java.dept2.d0406.AccessModifiler;

public class Other {
	
	public static void main(String[] args) {
		AccessModifiler accessModifiler = new AccessModifiler();
		
		accessModifiler.publicValue = 5;
		accessModifiler.privateValue = 3;
		accessModifiler.protectedValue = 4;
		accessModifiler.defaultValue = 1;
		
	}

}
