import java.util.Random;

public class MethodDiceGame {

	
	static void throwDice() {
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
	}
	
	public static void main(String[] args) {
		//주사위 던지기 메소드
		
			
			//박문수
			do {
				dice1 = r.nextInt(6) + 1;
				dice2 = r.nextInt(6) + 1;
				player +=  dice1 + dice2;
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
						+ (hong>=50 ? "홍길동" : "박문수"));
				break;
			}
			
		}

	}

}
