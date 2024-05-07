import java.util.Random;

public class IfRSP {

	public static void main(String[] args) {
		Random r = new Random();
		//가위바위보(RockScissorsPaper)
		//가위:0 바위:1 보:2
		int scissors = 0, rock = 1, paper = 2;
		System.out.println("가위바위보!!");
		//0~2의 세 수 중 하나 랜덤 추출
		//두 사람(기영, 기철)이 가위바위보를 하여 누가 이겼는지 출력하기
		int young = r.nextInt(3);
		int cheol = r.nextInt(3);
		System.out.printf("기영: %s\n",
				young==0 ? "가위" : (young==1 ? "바위" : "보"));
		
		System.out.printf("기철: %s\n",
				cheol==0 ? "가위" : (cheol==1 ? "바위" : "보"));
		
		//가위0>보2, 바위1>가위0, 보2>바위1
		if(young == cheol) {
			System.out.println("무승부");
		}
		else if( (young==0 && cheol==2)
				|| (young==1 && cheol==0) || (young==2 && cheol==1) ) {
			System.out.println("기영이 승");
		}
		else {
			System.out.println("기철이 승");
		}
		
	}

}
