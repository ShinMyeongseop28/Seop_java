package Day0528;

import java.util.Scanner;

import Day0528.dto.GoodsInfo;
import Day0528.view.*;
//import Day0528.view.GoodsList;
//import Day0528.view.GoodsModify;
//import Day0528.view.GoodsRegister;

public class GoodsInfoMain {
	static public GoodsInfo goods[] = new GoodsInfo[5];
	static public int seq;

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			System.out.println("------------------------------------------");
			System.out.println("1.상품등록	2.상품목록	3.할인율	0.종료");
			System.out.println("------------------------------------------");
			int menu = scan.nextInt();
			scan.nextLine();
			if(menu==1) {
				new GoodsRegister(scan);
			}else if(menu==2) {
				new GoodsList();
			}else if(menu==3) {
				new GoodsModify(scan);
			}else if(menu==0) {
				break;
			}
		}
		scan.close();
	}

}
