package account2;

public class AccountMain {

	public static void main(String[] args) {
		//홍길동은 기본 통장 개설
		Account hong = new Account("홍길동", "111-22-333");

		
		
		//박문수는 체크카드 통장 개설
		CheckCardAccount park = new CheckCardAccount("박문수", "222-33-444", "2222-3333-4444");
		
		try {
			//3만원 구매 후 결제
			int paid = park.pay(30000, "2222-3333-4444");
			System.out.println("잔고: " + park.balance);
			System.out.println("영수증 결제금액: " + paid);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
