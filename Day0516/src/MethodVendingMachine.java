import java.util.Scanner;

public class MethodVendingMachine {

	static int change(int change) {
		int c1000 = 0, c500 = 0, c100 = 0, c50 = 0;
		
		c1000 = change / 1000; // 3000 - 1250 -> 1000 1개 500 1개 100 2개 50 1개
		change %= 1000; // change = change % 1000; //750
		if (c1000 > 0)
			System.out.printf("1000원 %d장\n", c1000);	

		c500 = change / 500;
		change %= 500; // 250
		if (c500 > 0)
			System.out.printf("500원 %d개\n", c500);	
		
		c100 = change / 100;
		change %= 100; // 50
		if (c100 > 0)
			System.out.printf("100원 %d개\n", c100);

		c50 = change / 50;
		change %= 50; // 50
		if (c50 > 0)
			System.out.printf("50원 %d개\n", c50);

		return change;
	}

	public static void main(String[] args) {
		// 자판기메뉴
		// 각 메뉴의 금액을 담을 변수 선언
		int coke = 1250, letsbe = 800, coco = 1000;
		System.out.println("--- 자판기 메뉴 ---");
		System.out.printf("1.콜라: %d원\n", coke);
		System.out.printf("1.레쓰비: %d원\n", letsbe);
		System.out.printf("1.코코팜: %d원\n", coco);
		System.out.println("-------------");

		// 돈을 투입구에 넣기
		System.out.println("투입구에 돈을 넣으세요");
		// 키보드로 입력해서 돈을 투입하기: 투입한 돈을 담을 변수 선언
		Scanner scan = new Scanner(System.in);
		int money = scan.nextInt();
		System.out.println("투입금액: " + money);
		
		// 투입금액에 따라 선택할 수 있는 음료에 선택가능 램프가 켜지도록하기
		boolean bcoke = false, bletsbe = false, bcoco = false;
		if (money >= letsbe)
			bletsbe = true;
		if (money >= coco)
			bcoco = true;
		if (money >= coke)
			bcoke = true;
		// 선택가능 메뉴에 불켜짐 표현하기
		System.out.printf("1.콜라: %d원 [%s]\n", coke, bcoke ? "ON" : "OFF");
		System.out.printf("2.레쓰비: %d원 [%s]\n", letsbe, bletsbe ? "ON" : "OFF");
		System.out.printf("3.코코팜: %d원 [%s]\n", coco, bcoco ? "ON" : "OFF");
		
		// 메뉴 선택
		System.out.println("음료를 선택하세요");
		// 선택한 메뉴에 따른 거스름돈 계산하기
		int choice = scan.nextInt();
		int change = money;
		if (bcoke && choice == 1) { // 콜라
			System.out.println("콜라가 나온다");
			change = money - coke;
		} else if (bletsbe && choice == 2) {
			System.out.println("레쓰비가 나온다");
			change = money - letsbe;
		} else if (bcoco && choice == 3) {
			System.out.println("코코팜이 나온다");
			change = money - coco;
		}		
		System.out.printf("거스름돈: %d\n", change);
		if(change > 0) { //거스름돈이 있는 경우만 처리	
			change(change);				
		}
					
	}
}
