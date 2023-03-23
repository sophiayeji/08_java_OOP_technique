package step8_01.technique;

/*

	# 클래스의 형변환 (업다운 캐스팅)
 
 	- 부모클래스는 객체를 생성 할때 부모클래스에 있는 자원만 생성된다. 
    - 자녀클래스는 객체를 생성 할때 부모클래스와 자녀클래스의 자원이 모두 생성된다. 
	- 그러므로 자녀클래스는 부모클래스의 타입으로 객체를 생성 할 수 있고  부모클래스는 자녀클래스의 타입으로 객체를 생성 할 수 없다.	

*/	
class Base {
	void baseMethod() {} 
}

class Sub extends Base {
	void subMethod() {}
}


public class TechniqueEx11 {

	public static void main(String[] args) {

		Base base1 = new Base(); // 부모클래스 객체 생성 
		base1.baseMethod(); // 자신의 매서드 사용
		
		Sub sub1 = new Sub(); // 자녀클래스 객체 생성
		sub1.baseMethod(); // 상속받은 메서드 사용

		System.out.println("\n======================\n");
		
		// Sub base2 = new Base(); (x) 2개 = 1개  
		
		// 객체의 타입이 부모형태이기 떄문에 부모클래스가 가지고 있는 메서드만 사용가능 
		Base sub2 = new Sub(); // (0)  1개 = 2개 
		sub2.baseMethod();
		
		// 부모타입으로 만들어진 자녀클래스를 다시 자녀클래스로 형변환하여 사용가능 
		Sub sub3 = (Sub)sub2;
		sub3.baseMethod();
		sub3.subMethod();
		
		System.out.println("\n=============================\n");
		
		// [참고] instanceof : 형변환이 가능한지 확인하는 메서드
				if (sub1 instanceof Base) System.out.println("형변환 가능1"); // sub -> Base화 
				else					  System.out.println("형변환 불가1");
				
				System.out.println();
				
				if (base1 instanceof Sub) System.out.println("형변환 가능2"); // Base -> sub화 
				else					  System.out.println("형변환 불가2");
				
				
	}

}
