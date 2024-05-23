package Day0523;

public class BankAccount {
	//1. 은행계좌 클래스 선언하기
		//필드: 계좌번호, 예금주, 잔액
		//메소드: 입금한다(입금한 금액만큼 잔액을 증가시키기)
				//출금한다(입금한 금액만큼 잔액을 감소시키기, 출금한 금액을 반환하기)
	
	String accountNumber, owner;
	int balance;
	
	//this: 클래스 자기자신
	//생성자/메소드의 파라미터 변수명과 필드명이 같다면
	//필드를 구분하기 위해 필드앞에 this 키워드를 붙인다.
	//생성자에서 다른 생성자를 호출시 this 키워드를 붙인다.
	//생성자호출문부터 선언한다.
	
	//생성자
	BankAccount(String owner, String accountNumber) {
		this.owner = owner;
		this.accountNumber = accountNumber;
	}
	
	BankAccount(String owner, String accountNumber, int balance) {
		this(owner, accountNumber);
		this.balance = balance;
	}
	
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
