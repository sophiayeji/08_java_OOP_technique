package step8_01.technique;

/*
 * # 싱글턴 패턴
 * 
 *  - 객체를 1번만 생성하고 싶을 때 사용하는 기법
 *  
 *  - 싱글턴 패턴을 만드는 방법
 *  
 *    1) private 기본 생성자를 만든다.
 *    2) 내부에서 static으로 자기자신의 인스턴스를 생성한다. (핵심)
 *	  3) instance를 반환할 getter를 만들어준다.	  
 *  
 * */

class SingleTonClass{
	
	//1) private 기본 생성자를 만든다.
	private SingleTonClass(){}
	
	//2) 내부에서 static으로 자기자신의 인스턴스를 생성한다. (핵심)
	private static SingleTonClass instance = new SingleTonClass();
	
	//3) instance를 반환할 getter를 만들어준다.	
	public static SingleTonClass getInstance() {
		return instance;
	} 
	
	String testVar = "테스트변수";
	void testMethod() {
		System.out.println("테스트메서드");
	}
	
	
}

class TestClass{}

public class TechniqueEx05 {

	public static void main(String[] args) {

		// 생성자에 private을 붙여서 기존의 방식으로 객체를 생성 할 수 없다.
		//new SingleTonClass();
		
		System.out.println(SingleTonClass.getInstance()); // 같은 객체
		System.out.println(SingleTonClass.getInstance()); // 같은 객체
		System.out.println(SingleTonClass.getInstance()); // 같은 객체
		System.out.println();
		
		System.out.println(SingleTonClass.getInstance().testVar);
		SingleTonClass.getInstance().testMethod();
		System.out.println();
		
		System.out.println(new TestClass()); // 다른 객체 
		System.out.println(new TestClass()); // 다른 객체 
		System.out.println(new TestClass()); // 다른 객체 
		System.out.println();
		
	}

}
