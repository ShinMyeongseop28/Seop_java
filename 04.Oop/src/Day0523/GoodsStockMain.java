package Day0523;

public class GoodsStockMain {

	public static void main(String[] args) {
		GoodsStock nike =
		new GoodsStock("나이키 모자", "NK01", 50);
		goodsInfo(nike);
		
		//아디다스 가방 상품 재고관리하기
//		GoodsStock adidas = new GoodsStock();
//		adidas.goodsName = "아디다스 가방";
//		adidas.goodsCode = "AD01";
		GoodsStock adidas
		= new GoodsStock("아디다스 가방", "AD01");
		goodsInfo(adidas);
		
		goodsInfo(adidas);
		
		//가방 20개 입고하기
		adidas.plusStock(20);
		goodsInfo(adidas);
		
		//가방 10개 출고하기
		int out = adidas.minusStock(30);
		goodsInfo(adidas);
		System.out.println( "출고된 수량: " + out );		
	}
	
	static void goodsInfo(GoodsStock goods) {
		System.out.println("상품명: " + goods.goodsName);
		System.out.println("상품코드: " + goods.goodsCode);
		System.out.println("상품재고수량: " + goods.stockAmount);		
	}
	
}
