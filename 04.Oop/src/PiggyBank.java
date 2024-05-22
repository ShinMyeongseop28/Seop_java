
public class PiggyBank {
	//클래스명: 대문자로 시작 - camel case 단어단위로 시작은 대문자로
	//필드명, 메소드명: 소문자로 시작- camel case, 단어단위를 _로 묶어표현,
	
	//데이터: 필드 - 주인, 총액
	String owner;
	int total;
		
	//기능: 메소드 - 돈을 넣는다. 돈을 빼낸다.
	void inputMoney(int money) {
		total += money;
	}
	
	void output_money(int money) {
		total -= money;
	}

}
