package step8_01.technique;

/*   정보보안 3대원칙 : 기밀, 무결(안바뀐걸 증명),가용성
 * 
 *  # 캡슐화 (capsulation)
 * 
 * - 접근제어자 : public , private  + getter/setter
 * 
 * 
 * [ 접근제어자(Modifier)의 종류 ]
 * 
 * public  : 프로젝트 전체에서 접근 가능
 * private : 클래스 내부에서만 접근 가능
 * 
 * default(package) : 패키지 내에서만 접근가능
 * protected        : 상속관계에서 접근 가능
 * 
 * 
 * */

class ModifierTest { // -> 어느정도까지 접근하는것을 control
	// 사용하는 케이스) 1. 스프링 프레임워크(setter맵핑) 2. 검수 프로그램(반려) 3. defense 
	
	
	private int a; // 접근불가 
	int b;
	
	// private 변수를 클래스 외부로 꺼내주는 매서드 getter (감춰져있는 것을 꺼내주는 것)
	int getA() {	// 변수명 앞에 get을 추가하여 메서드 이름을 지정한다. 
		return this.a;
	}
	
	// private 변수를 클래스 외부에서 수정하는 매서드 setter 
	void setA(int a) {	// 변수명 앞에 set을 추가하여 메서드 이름을 지정한다. 
			this.a =a;
		}
}
// VO (Value object) : 데이터 객체 
// DTO (Data Transfer Object) : 데이터 전송 모델 객체 

class ProductDTO {
	
	private String productCd;
	private String sku;
	private int price;
	private String brandCd;
	private String brandNm;
	public String getProductCd() {
		return productCd;
	}
	
	// getter & setter 생성 단축키
		// 좌측 상단 Source > Generate Getters and Getters > selectAll > Generate
	
	public void setProductCd(String productCd) {
		this.productCd = productCd;
	}
	public String getSku() {
		return sku;
	}
	public void setSku(String sku) {
		this.sku = sku;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getBrandCd() {
		return brandCd;
	}
	public void setBrandCd(String brandCd) {
		this.brandCd = brandCd;
	}
	public String getBrandNm() {
		return brandNm;
	}
	public void setBrandNm(String brandNm) {
		this.brandNm = brandNm;
	}
	
	
		
	
}

public class TechniqueEx02 {

	public static void main(String[] args) {

		ModifierTest object = new ModifierTest();
		//private 변수는 클래스 외부에서 접근 불가
		//object.a = 1000;
		//System.out.println(object.a);
		
		object.setA(1000); // setter를 이용하여 private변수에 데이터 대입 (데이터를 집어넣고)
		System.out.println(object.getA()); // getter를 이용하여 private 변수 사용 (데이터를 꺼내온다)
		
		object.b = 2000;
		System.out.println(object.b);
		
		System.out.println();
		
		ProductDTO productDTO = new ProductDTO();
		//productDTO.productCd = "0x001";
		//productDTO.productNm = "기계식키보드";
		productDTO.setProductCd("0x001");
		productDTO.setSku("기계식키보드");
		productDTO.setPrice(45000);
		productDTO.setBrandCd("b1");
		productDTO.setBrandNm("로지텍");
		
		//System.out.println(productDTO.productCd);
		//System.out.println(productDTO.productNm);
		System.out.println(productDTO.getProductCd());
		System.out.println(productDTO.getSku());
		System.out.println(productDTO.getPrice());
		System.out.println(productDTO.getBrandCd());
		System.out.println(productDTO.getBrandNm());
				
		
		
		
		
	}

}
