package Day0524;

public class GoodsStock {
	//필드: 상품명, 상품코드, 재고수량
	private String goodsName, goodsCode;
	private int stockAmount;
	
	GoodsStock(String name, String code) {
		goodsName = name;
		goodsCode = code;
	}
	GoodsStock(String name, String code, int amount) {
		this(name, code);
//		goodsName = name;
//		goodsCode = code;
		
		stockAmount = amount;
	}
	
	//필드의 접근을 private로 제한하면
	//필드를 알려주는 getter메소드를 선언
	String getgoodsName() {
		return goodsName;
	}
	String getgoodsCode() {
		return goodsCode;
	}
	int getstockAmount() {
		return stockAmount;
	}
	
	
	//메소드: 입고한다. 출고한다
	//입고한다: 입고된 수량만큼 재고수량이 증가
	void plusStock(int amt) {
		stockAmount += amt;
	}
	//출고한다: 출고된 수량만큼 재고수량이 감소, 출고된 수량 반환하기
	int minusStock(int amt) {
		//남은 재고수량보다 더 많은 수량을 출고요청 한다면 출고안되게
		if(stockAmount < amt) return 0;
		stockAmount -= amt;
		return amt;
	}

}
