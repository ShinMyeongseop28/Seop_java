
public class IfEx03 {

	public static void main(String[] args) {
		//분식집에 갔을때 현금만 있더라
		//현금의 금액(3500)에 따라 김밥을 사먹는다 /조용히 나온다
		//내 주머니의 돈을 확인한다
		System.out.println( "분식집에 들어간다" );
		System.out.println( "주머니를 확인한다" );
		int money = 3500;
		boolean card = true;
		System.out.printf("돈은 %d가 있네\n", money);
		System.out.printf("카드가 %s\n", card == true ? "있다" : "없다");
//		if( money >= 3500 ) {
//			System.out.println( "현금결제 김밥을 사먹는다" );
//		}
//		else if(card == true){
//			System.out.println( "카드결제 김밥을 사먹는다");
//		}
//		else {System.out.println("조용히 나온다");
//		}
		if(money >= 3500 || card == true) {
			System.out.println("김밥을 사먹는다");
		}
		else {System.out.println("조용히 나온다");
		}

	}

}
