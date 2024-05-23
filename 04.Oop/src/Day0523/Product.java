package Day0523;

public class Product {
	//1. 상품정보 클래스 Product 선언
	//1-1)필드: 상품명, 상품코드, 상품가격
	String ProductName, ProductCode; 
	int Price;
	//1-2)생성자: 상품명, 상품코드를 초기화, 모든필드를 초기화
	Product(String ProductName, String ProductCode) {
		this.ProductName = ProductName;
		this.ProductCode = ProductCode;
	}
	Product(String ProductName, String ProductCode, int Price) {
		this(ProductName, ProductCode);
		this.Price = Price;
	}
	//1-3)메소드: 가격을 변경한다.
	void changePrice(int Price) {
		this.Price = Price;
	}
	
}
