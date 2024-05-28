package Day0528.view;

import java.util.Scanner;

import Day0528.GoodsInfoMain;
import Day0528.dto.GoodsInfo;

public class GoodsRegister {
	//상품등록하기
	public GoodsRegister(Scanner scan) {
		System.out.println("상품등록 ----------------------");
		System.out.println("상품코드: ");
		String code = scan.nextLine();

		System.out.println("상품명: ");
		String name = scan.nextLine();
		
		System.out.println("제조사: ");
		String make = scan.nextLine();
		
		System.out.println("표준가격: ");
		int cost = scan.nextInt();
		System.out.println("-------------------------------");
		
		GoodsInfo info = new GoodsInfo(code, name, make, cost);
		GoodsInfoMain.goods[GoodsInfoMain.seq++] = info;
		
	}

}
