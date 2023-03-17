package step8_01.technique;

import java.text.SimpleDateFormat;
import java.util.Scanner;

// # 생성자를 이용한 멤버변수 초기화
class GoodsDTO{
	
	String goodsCd;
	String goodsNm;
	int price;
	// 생성자 단축키 > 좌측 상단 Source > Generate Constructor Using Fields..
		GoodsDTO(String goodsCd, String goodsNm, int price) {
			this.goodsCd = goodsCd;
			this.goodsNm = goodsNm;
			this.price = price;
		}
		
		void printData() {
			System.out.println(this.goodsCd + " / " + this.goodsNm + " / " + this.price);
		}
}
	
	
		
public class TechniqueEx04_02 {

	public static void main(String[] args) {
		
		Scanner scan= new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		
		// 생성자를 이용한 필드(멤버변수, 프로퍼티 ) 초기화
		GoodsDTO g1 = new GoodsDTO("0x001", "맨투맨", 400000);
		GoodsDTO g2 = new GoodsDTO("0X002", "조거팬츠", 5000000);
		GoodsDTO g3 = new GoodsDTO("0X003", "바람막이", 6000000);
		
		g1.printData();
		g2.printData();
		g3.printData();

		// 매서드 오버로딩 + 생성자 => 생성자 오버로딩 (4-3)
			
	}

}
