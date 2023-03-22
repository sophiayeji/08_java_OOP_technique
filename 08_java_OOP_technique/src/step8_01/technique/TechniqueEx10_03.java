package step8_01.technique;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
 * 
 *  # 인터페이스 타입 객체 생성
 * 
 *  - 클래스가 구현한 인터페이스의 타입의 참조형으로 이를 구현한 클래스의 객체를 생성할 수 있다.
 *  - 인터페이스를 자료형으로 구현할 경우 프로그램은 더욱 유연해진다.
 * 
 *  [ 방법 ]
 * 
 *  인터페이스 변수명 = new 클래스명();
 *  
 *   [ 예시 ]
 *  
 *   List<Object> temp1 = new ArrayList<Object>();
 *   List<Object> temp2 = new Vector<Object>();
 *   
 *   Map<Object,Object> temp3 = new HashMap<Object, Object>();
 *   Map<Object,Object> temp4 = new TreeMap<Object, Object>();
 *   
 * */

interface Person {} // 3type 충전기같은거 

class Children implements Person{}
class Student implements Person{}
class Adult implements Person{} 

public class TechniqueEx10_03 {

	public static void main(String[] args) {
		
		Children c1 = new Children();
		Student s1 = new Student();
		Adult a1 = new Adult();
		
		//인터페이스 타입으로 객체 생성 
		Person c2 = new Children();
		Person s2 = new Student();
		Person a2 = new Adult();
	}
	
		//예시1)
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		List<Integer> list2 = new ArrayList<Integer>();
		
		//예시2)
		HashMap<String,String> map1 = new HashMap<String,String>();
		Map<String, String> map2 = new HashMap<String,String>();
				
	
}