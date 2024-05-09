import java.util.Random;

public class DoWhileEx03 {

	public static void main(String[] args) {
		//주사위 던지기 게임: 무승부 없기로, 무조건 승자를 결정해야 한다
		//사용자, 컴푸터가 주사위를 던진다
		Random r = new Random();
		int user=0, pc=0;
		
		do {
			System.out.println("주사위를 던지세요~");
			user = r.nextInt(6)+1; //0~5+1 -> 1~6
			pc = r.nextInt(6)+1; //0~5+1 -> 1~6
			System.out.printf("사용자: %d, 컴퓨터: %d\n", user, pc);
		}while( user == pc );
		if( user > pc ) {
			System.out.println("사용자 승^^");
			
		}else {
			System.out.println("컴퓨터 승ㅠㅠ");			
		}
		
		
		
		
	}

}
