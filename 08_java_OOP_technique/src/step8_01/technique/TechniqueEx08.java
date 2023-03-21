package step8_01.technique;

/*
 * 
 *  # this , super
 * 
 * 	- this : 자신의 객체
 *    super : 부모클래스의 객체
 *  
 *  - this() : 자신의 생성자
 *    super() : 부모클래스의 생성자
 *  
 *  - this.testMethod() : 자신의 메서드 호출
 *    testMethod()		: 자신의 메서드 호출
 *    super.testMethod() : 부모의 메서드 호출
 * 
 * */
class Parent{
	
	String name;
	int age; 
	
	Parent() {
		//this.변수~~~ : 나의 변수 
		//this(); // 기본생성자
		this("무명" , -1);
		System.out.println("(P-기본) 부모클래스의 기본생성자 실행");
	}
	
	Parent(String name, int age) {
		System.out.println("(P-추가)부모클래스의 기본생성자 실행");
	}
	
	void testMethod() {
		System.out.println("(P부모)테스트 메서드");
	}
	
	
}
class Child extends Parent{ 
	 
	Child() {
		super(); // 부모클래스의 기본생성자를 실행(기본적으로 생략되어있다.) 
		//super("앨런튜링", 70);
		System.out.println("(C-기본) 자녀클래스의 기본생성자 실행");
	}
	
	Child(String name , int age) {
		
		//this();
		//super();
		super("앨런튜링",70);
		
		System.out.println("(C-추가) 자녀클래스의 추가된생성자 실행");
	}
	
	void testMethod() {
		System.out.println("(C자녀) 테스트 메서드");
	}
	
	void callMethod() {
		
		System.out.println(super.name); // 부모클래스의 필드
		System.out.println(super.age);	// 부모클래스의 필드 
		
		super.testMethod(); // 부모클래스의 testMethod호출 
		testMethod(); // 자신의 TestMethod호출 
		testMethod(); // 자신의 TestMethod호출
		
	}
	
	
}
public class TechniqueEx08 {

	public static void main(String[] args) {
		
		new Parent(); // 기본생성자 
		System.out.println();
		
		new Parent("제임스고슬링", 70); // 두개 
		System.out.println();
		
		new Child();
		System.out.println();
		
		Child c = new Child("제임스고슬링주니어", 40);
		c.callMethod();
		
	}
}

