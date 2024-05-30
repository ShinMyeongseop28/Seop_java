package account2;

public class AccountMain {

	static void info(Account who) {
		//who의 데이터타입을 확인
		if(who instanceof CheckCardAccount) {
			System.out.println("체크카드통장 -------");			
		}else if(who instanceof MinusAccount) {
			System.out.println("마이너스통장 -------");			
		}else {
			System.out.println("일반통장 -------");			
		}
		System.out.println("예금주: " + who.owner);
		System.out.println("계좌번호: " + who.accountNo);
		System.out.println("잔고: " + who.balance);
		if(who instanceof CheckCardAccount) {
			CheckCardAccount check = (CheckCardAccount)who;
			System.out.println("카드번호: " + check.cardNo);
		}else if(who instanceof MinusAccount) {
			MinusAccount minus = (MinusAccount)who;
			System.out.println("마이너스한도: " + minus.limit);
		}
		System.out.println();
	}
	
	static void info(CheckCardAccount who) {
		System.out.println("체크카드통장 -------");
		System.out.println("예금주: " + who.owner);
		System.out.println("계좌번호: " + who.accountNo);
		System.out.println("잔고: " + who.balance);
		System.out.println("카드번호: " + who.cardNo);
		System.out.println();
	}
	
	static void info(MinusAccount who) {
		System.out.println("마이너스통장 -------");
		System.out.println("예금주: " + who.owner);
		System.out.println("계좌번호: " + who.accountNo);
		System.out.println("잔고: " + who.balance);
		System.out.println("마이너스한도: " + who.limit);
		System.out.println();
	}
	
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
