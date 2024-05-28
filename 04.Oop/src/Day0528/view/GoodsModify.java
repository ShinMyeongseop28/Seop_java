package Day0528.view;

import java.util.Scanner;

import Day0528.GoodsInfoMain;
import Day0528.dto.GoodsInfo;

public class GoodsModify {
	
	public GoodsModify(Scanner scan) {
		//할인율 적용할 상품 선택하도록 상품 목록 출력
		System.out.println("번호 상품명 할인율");
		for( int idx=0; idx<GoodsInfoMain.goods.length; idx++ ) {
			GoodsInfo goods = GoodsInfoMain.goods[idx];
			if(goods == null) continue;
			System.out.printf("%d %s %d\n", 
					idx+1, goods.name, goods.discount);
		}
		
		System.out.println("상품선택: ");
		int no = scan.nextInt();
		System.out.println("할인율(%): ");
		int discount = scan.nextInt();
		
		GoodsInfoMain.goods[no-1].changeDiscount(discount);
		
	}

}
