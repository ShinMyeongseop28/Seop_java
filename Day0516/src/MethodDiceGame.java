import java.util.Random;

public class MethodDiceGame {
	
	static int throwDice(int player, String name) {
		Random r = new Random();
		int dice1, dice2;
		
			do {
				dice1 = r.nextInt(6) + 1;
				dice2 = r.nextInt(6) + 1;
				player += dice1 + dice2;
				System.out.printf("%s: (%d,%d) -> %d칸 이동 ==> 최종위치: %d\n",
						name, dice1, dice2, dice1+dice2, player);
				if(dice1==dice2) {
					System.out.printf("%s 한번 더!\n", name);
				}
			}while(dice1==dice2);
			
			return player;
	}
	
	public static void main(String[] args) {
		
		Random r = new Random();
		int no = 0;
		int hong = 0, park = 0;
		while(true) {
			
			System.out.printf("[%d회차] 주사위를 던지세요~\n", ++no);
			//홍길동/박문수의 최종위치가 50이상이면 게임끝, 둘 다 50이상이 되면 무승부
			hong = throwDice(hong, "홍길동");
			park = throwDice(park, "박문수");
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
