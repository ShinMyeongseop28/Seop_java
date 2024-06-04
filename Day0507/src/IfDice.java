import java.util.Random;

public class IfDice {
	public static void main(String[] args) {
		//주사위 게임
		//사용자와 컴퓨터가 주사위를 던져서 더 큰 수가 나오면 이기는 게임.
		//수가 랜덤하게 뽑혀지도록 할 기능을 가진 클래스: Random
		//import 자동완성: ctrl + shift + o
		Random r = new Random();
//		System.out.println( r.nextInt(100) ); //100(0~99)개의 수 중에 랜덤하게 추출됨
		//1~6까지의 수 중 랜덤 추출
		int user = r.nextInt(6) + 1; //0~5 +1 -> 1~6
		int computer = r.nextInt(6) + 1; //0~5 +1 -> 1~6
		System.out.printf( "사용자: %d, 컴: %d\n", user, computer );
		
		if( user > computer ) {
			System.out.println("사용자 승^^");
		}
		else if( user < computer ) {
			System.out.println("컴퓨터 승ㅠㅠ");			
		}
		else {
			System.out.println("무승부");
		}
		
	}

}
