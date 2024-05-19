import java.util.Random;

public class LoopDiceGame {

	public static void main(String[] args) {
		//두 개의 주사위를 던져서 합한 수 만큼 이동하기
		//두 명이 함께 게임을 한다
		//50칸이 있는 말판을 끝까지 이동하면 게임이 끝난다
		//만약 두 주사위가 같은 수가 나오면 추가로 한 번더 더질 수 있다.
		//두 주사위는 1~6까지 랜덤하게 추출
		
		Random r = new Random();
		int dice1, dice2, no=0;
		int hong=0, park=0; //각 게임자의 이동 최종위치를 담을 변수
		while(true) {
			
			System.out.printf("[%d회차] 주사위를 던지세요~\n", ++no);
			
			//홍길동
			do {
				dice1 = r.nextInt(6) + 1;
				dice2 = r.nextInt(6) + 1;
				hong += dice1 + dice2;
				System.out.printf("%s: (%d,%d) -> %d칸 이동 ==> 최종위치: %d\n",
						"홍길동", dice1, dice2, dice1+dice2, hong);
				if(dice1==dice2) {
					System.out.println("홍길동 한번 더!");
				}
			}while(dice1==dice2);
			
			//박문수
			do {
				dice1 = r.nextInt(6) + 1;
				dice2 = r.nextInt(6) + 1;
				park +=  dice1 + dice2;
				System.out.printf("%s: (%d,%d) -> %d칸 이동 ==> 최종위치: %d\n",
						"박문수", dice1, dice2, dice1+dice2, park);
				if(dice1==dice2) {
					System.out.println("박문수 한번 더!");
				}
			}while(dice1==dice2);
			
			//홍길동/박문수의 최종위치가 50이상이면 게임끝, 둘 다 50이상이 되면 무승부
			if(hong>=50 && park>=50) {
				System.out.println("무승부");
				break;
			}else if(hong>=50 || park>=50) {
				System.out.println("게임끝: "
						+ (hong>=50 ? "홍길동 승" : "박문수 승"));
				break;
			}
			
		}
		
	}

}
