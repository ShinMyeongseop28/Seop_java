
public class BankAccount {
	//1. 은행계좌 클래스 선언하기
		//필드: 계좌번호, 예금주, 잔액
		//메소드: 입금한다(입금한 금액만큼 잔액을 증가시키기)
				//출금한다(입금한 금액만큼 잔액을 감소시키기, 출금한 금액을 반환하기)
	
	String accountNumber, owner;
	int balance;
	
	void deposit(int money) {
		balance += money;
	}
	
	int withdraw(int money) {
		//통장 잔고보다 출금액이 많으면 출금은 안됨
		if(balance < money) return 0;
		balance -= money;
		return money;
	}

}
