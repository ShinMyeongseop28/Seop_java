package Day0523;

public class PiggyBankMain {

	public static void main(String[] args) {
		
		//객체 생성문 == 생성문 호출문
		PiggyBank hong = new PiggyBank("홍길동");
		hong.owner = "홍길동";
		PiggyInfo(hong);
		
	}

	static void PiggyInfo(PiggyBank who) {
		System.out.println(who.owner + " 돼지저금통");
		System.out.println("현재 저금통안에 " + who.total + "원이 있습니다.");
	}

}
