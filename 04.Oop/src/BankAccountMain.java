
public class BankAccountMain {

	public static void main(String[] args) {
		//2. 은행계좌를 만들어 낼 클래스 선언하기: main 메소드를 갖는 클래스
				//홍길동의 은행계좌 객체 생성하기
				//통장정보: 예금주, 계좌번호, 잔액을 출력
				//5만원 입금한 후 출력
				//3만원 출금한 후 출력
		BankAccount hong = new BankAccount();
		hong.owner = "홍길동";
		hong.accountNumber = "1111-222-3333";
		
		//받아든 통장의 정보확인
		System.out.printf("%s의 통장--------\n", hong.owner);
		System.out.printf("계좌번호: %s\n", hong.accountNumber);
		System.out.printf("잔액: %d\n", hong.balance);
		
		//며칠후: 5만원 입금한 후 출력
		hong.deposit(50000);
		accountInfo(hong);
		
		//며칠후: 3만원 출금한 후 출력
		hong.withdraw(30000);
		accountInfo(hong);
		
		//박문수씨 통장개설
		BankAccount park = new BankAccount();
		park.owner = "박문수";
		park.accountNumber = "22-333-4444";
		park.balance = 50000;
		
		//통장 정보 확인
		accountInfo(park);
		
		//박씨가 3만원 입금
		park.deposit(30000);
		accountInfo(park);
		
		//박씨가 10만원 출금
		int request = 100000;
//		int hand = park.withdraw(request);
//		accountInfo(park, request, hand);
		accountInfo(park, request, park.withdraw(request));

		//		int request = 100000;
//		int output = park.withdraw( request );
//		accountInfo( park, request, output );
		
	}
	
	static void accountInfo(BankAccount who) {
		System.out.printf("%s의 통장--------\n", who.owner);
		System.out.printf("계좌번호: %s\n", who.accountNumber);
		System.out.printf("잔액: %d\n", who.balance);
	}
	
	static void accountInfo(BankAccount who, int request, int hand) {
		System.out.printf("%s의 통장--------\n", who.owner);
		System.out.printf("계좌번호: %s\n", who.accountNumber);
		System.out.printf("출금 요청액: " + request + "\n출금된 금액: " + hand);
		System.out.printf("\n잔액: %d\n", who.balance);
	}
	

}
