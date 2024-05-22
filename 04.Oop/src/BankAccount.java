
public class BankAccount {
	//1. 은행계좌 클래스 선언하기
		//필드: 계좌번호, 예금주, 잔액
		//메소드: 입금한다(입금한 금액만큼 잔액을 증가시키기)
				//출금한다(입금한 금액만큼 잔액을 감소시키기, 출금한 금액을 반환하기)
	
	String accountNumber, name;
	int amount;
	
	void inputMoney(int money) {
		amount += money; 
	}
	
	int outputMoney(int money) {
		amount -= money;
		return amount;
	}

}
