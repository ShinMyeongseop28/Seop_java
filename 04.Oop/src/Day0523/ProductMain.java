package Day0523;

public class ProductMain {

	public static void main(String[] args) {
		//2. 상품정보 객체를 생성하여 사용하는 main있는 클래스 선언
		//화장지는 상품가격까지 등록,
		Product tissue = new Product("화장지", "TS01", 10000);
		//종이컵은 상품가격 없이 등록 -> 가격을 1500으로 변경
		Product cup = new Product("종이컵", "PC01");
//		ProductInfo(cup);
		//가격책정 후 변경하기
		cup.changePrice(2000);
		//출력결과
		//상품명  상품코드  가격
		//화장지   TS01   	10000
		//종이컵   PC01   	1500
		//생수     WT01  	1500
		Product water = new Product("생수", "WT01", 3000);
//		System.out.println( "상품명   \t상품코드  \t가격" );
//		info(tissue);
//		info(cup);
//		info(water);
		System.out.println("상품명   \t상품코드  \t가격");
		Product[] products = { tissue, cup, water };
		for( Product p : products ) {
			info(p);
		}

	}
	
	static void info(Product product) {
		System.out.println( product.ProductName 
						+ "\t" +  product.ProductCode
						+ "\t" +  product.Price
						);
	}
	
	static void productInfo(Product product) {
		System.out.println( "상품명: "+ product.ProductName );
		System.out.println( "상품코드: "+ product.ProductCode );
		System.out.println( "상품가격: "+ product.Price );
	}

}
