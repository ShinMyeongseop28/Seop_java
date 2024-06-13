package account;

public class ShareAccount {
	Account hong;
	Account park;

	public ShareAccount(Account hong, Account park) {
		this.hong = hong;
		this.park = park;
	}

	void transfer(int money) {
		// synchronized (this) {
		hong.output(money);
		System.out.printf("홍길동 통장에서 %d만원 출금(%d) --> ", money, hong.balance);

		park.input(money);
		System.out.printf("박문수 통장에서 %d만원 입금(%d)\n", money, park.balance);

//		}

	}

	synchronized void print() {
		int sum = hong.balance + park.balance;
		System.out.println("두 통장 잔고합계: " + sum);
	}

}
