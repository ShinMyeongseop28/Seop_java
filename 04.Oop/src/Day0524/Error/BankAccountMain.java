package Day0524.Error;

public class BankAccountMain {

	public static void main(String[] args) {
		// 2. 은행계좌를 만들어 낼 클래스 선언하기: main 메소드를 갖는 클래스
		// 홍길동의 은행계좌 객체 생성하기
		// 통장정보: 예금주, 계좌번호, 잔액을 출력
		// 5만원 입금한 후 출력
		// 3만원 출금한 후 출력
		BankAccount hong = new BankAccount("홍길동", "1111-222-3333");

		accountInfo(hong);

		// 며칠후: 5만원 입금한 후 출력
		hong.deposit(50000);
		accountInfo(hong);

		// 며칠후: 3만원 출금한 후 출력
		try {
			hong.withdraw(30000);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		accountInfo(hong);

		BankAccount Sim;
		try {
			Sim = new BankAccount("심청", "22-333-4444", 50000);
			accountInfo(Sim);
		} catch (Exception e) {
			e.getMessage();
		}

		// 심청씨가 출금 -50000
		try {
			Sim = new BankAccount("심청", "22-333-4444", -50000);
			accountInfo(Sim);
			Sim.withdraw(-50000);
			accountInfo(Sim);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

	static void accountInfo(BankAccount who) {
		System.out.printf("%s의 통장--------\n", who.getOwner());
		System.out.printf("계좌번호: %s\n", who.getAccountNumber());
		System.out.printf("잔액: %d\n", who.getBalance());
	}

	static void accountInfo(BankAccount who, int request, int hand) {
		System.out.printf("%s의 통장--------\n", who.getOwner());
		System.out.printf("계좌번호: %s\n", who.getAccountNumber());
		System.out.printf("출금 요청액: " + request + "\n출금된 금액: " + hand);
		System.out.printf("\n잔액: %d\n", who.getBalance());
	}

}
