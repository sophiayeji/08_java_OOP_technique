package modifierTest;

class Test1 extends ModifierEx {
	
	void test() {
		
		System.out.println(publicV);     // 같은 프로젝트여서 접근 가능
		System.out.println(defaultV);    // 같은 패키지여서 접근 가능
		System.out.println(protectedV);  // 상속 관계여서 접근 가능
		//System.out.println(privateV);  // (불가) 다른클래여서 불가능
		
		publicM();		// 같은 프로젝트여서 접근 가능
		defaultM();		// 같은 패키지여서 접근 가능
		protectedM();	// 상속 관계여서 접근 가능
		//privateM();	// (불가) 다른클래여서 불가능
		
	}
	
}


public class ModifierEx {

	public int publicV;
	int defaultV;
	protected int protectedV;
	private int privateV;
	
	public void publicM() {}
	void defaultM() {}
	protected void protectedM() {}
	private void privateM() {}
	
}
