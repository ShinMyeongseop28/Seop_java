package Day0523;

public class BankAccountMain {

	public static void main(String[] args) {
		//2. 은행계좌를 만들어 낼 클래스 선언하기: main 메소드를 갖는 클래스
				//홍길동의 은행계좌 객체 생성하기
				//통장정보: 예금주, 계좌번호, 잔액을 출력
				//5만원 입금한 후 출력
				//3만원 출금한 후 출력
		Account hong
		= new Account("홍길동", "111")
		
		
		
		BankAccount hong = new BankAccount();
		hong.owner = "홍길동";
		hong.accountNumber = "1111-222-3333";
		
		//받아든 통장의 정보확인
		System.out.printf("%s의 통장--------\n", hong.owner);
		System.out.printf("계좌번호: %s\n", hong.accountNumber);
		System.out.printf("잔액: %d\n", hong.balance);
		
		//며칠후: 5만원 입금한 후 출력
		hong.deposit(50000);
		
		//며칠후: 3만원 출금한 후 출력
		
		
	}
	
	static void accountInfo(BankAccount who) {
		System.out.printf("%s의 통장--------\n", who.owner);
		System.out.printf("계좌번호: %s\n", who.accountNumber);
		System.out.printf("잔액: %d\n", who.balance);

	}
	
	static void 
	

}
