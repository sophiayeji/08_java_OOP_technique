package step8_01.technique;

import modifierTest.ModifierEx;

/*
 * [ 접근제어자(Modifier)의 종류 ]
 * 
 * public  : 프로젝트 전체에서 접근 가능
 * private : 클래스 내부에서만 접근 가능
 * 
 * default(package) : 패키지 내에서만 접근가능
 * protected        : 상속관계에서 접근 가능
 *
 *  - 클래스에는 package , public 접근제어자만 사용 가능하다.
 *  - 하나의 클래스 파일에는 하나의 public 클래스만 사용할 수 있다.
 * 
 */

//public class A {}  	 // (가능) : 하나의 파일에는 하나의 public 클래스만 존재
class B {}			 	 // (가능)	
//protected class C {}   // (불가능)
//private class D {}	 // (불가능)

class Test2 extends ModifierEx {
	
	void test() {
		
		System.out.println(publicV);     // 같은 프로젝트여서 접근 가능
		//System.out.println(defaultV);  // (불가)다른 패키지여서 접근 불가능
		System.out.println(protectedV);  // 상속 관계여서 접근 가능
		//System.out.println(privateV);  // (불가) 다른클래여서 불가능
		
		publicM();		// 같은 프로젝트여서 접근 가능
		//defaultM();	// (불가)다른 패키지여서 접근 불가능
		protectedM();	// 상속 관계여서 접근 가능
		//privateM();	// (불가) 다른클래여서 불가능
		
	}
	
}


public class TechniqueEx02_02 {

	public static void main(String[] args) {

		new ModifierEx();
		
		
	}

}
