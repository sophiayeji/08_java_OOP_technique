package step8_01.technique;

/*

	# 메서드 오버라이딩 ( Method Overriding ) -> 재정의
	
	- 부모클래스로부터 상속 받은 메서드를 재정의(overriding)하여 사용한다.
	- 부모클래스의 메서드와 이름이 같고 구현되는 기능이 다르다.
	- 객체지향 기법의 다형성(polymorphism)을 구현하는 핵심기능이다.
	- 메서드 오버로딩과 혼용되기 쉽다.
	     메서드 오버라이딩 : 부모클래스와 자녀클래스 사이의 메서드이름이 같음(재 정의)
	     메서드 오버로딩 : 같은 클래스 안에서 메서드이름이 같음(중복 정의)

*/

class Warrior2 extends Beginner{
	
	// 매서드 오버라이팅(매서드 재정의)
	void levelUp() {
		this.level++;
		this.power += 1000;
		this.dex += 100;
		this.life += 1000;
		this.mana += 5; 
	}	
		
	//Warrior2 클래스만의 매서드 추가
	void dash() {
	System.out.println("warrior2 dash!\n");
	}
}


class Wizard2 extends Beginner {

	//매서드 오버라이딩 (매서드 재정의)
	void levelUp() {
		this.level++;
		this.power +=5;
		this.dex +=100;
		this.life += 100;
		this.mana +=3000;
	}
	
	//Wizard2클래스만의 매서드 추가 
	void fileBall() {
		System.out.println("wizard2 fireBall!\n");
	}
	
}
public class TechniqueEx07 {

	public static void main(String[] args) {
		
		Warrior2 war2 = new Warrior2();
		war2.showStatus();
		war2.levelUp();
		war2.levelUp();
		war2.levelUp();
		war2.levelUp();
		war2.showStatus();
		war2.dash();
		
		System.out.println("\n=================\n");
		
		
		Wizard2 wiz2 = new Wizard2();
		wiz2.showStatus();
		wiz2.levelUp();
		wiz2.levelUp();
		wiz2.levelUp();
		wiz2.showStatus();
		wiz2.fileBall();
		
	}

}
