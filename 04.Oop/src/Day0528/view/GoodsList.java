package Day0528.view;

import Day0528.GoodsInfoMain;
import Day0528.dto.GoodsInfo;

public class GoodsList {

	public GoodsList() {
		System.out.println("제조사	상품코드	상품명	표준가격	할인율	판매가격");
		System.out.println("-----------------------------------------------");
		for (GoodsInfo goods : GoodsInfoMain.goods) {
			if (goods == null)
				continue;
			System.out.println(goods.maker + "\t" + 
				goods.code + "\t" + 
					goods.name + "\t" + 
				goods.cost + "\t"
					+ goods.discount + "\t" + 
				goods.saleCost());
		}
	}

}
