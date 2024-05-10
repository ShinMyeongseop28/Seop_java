
public class LoopEx06 {

	public static void main(String[] args) {
		//구구단 2단 ~ 9단까지 중 짝수단만 출력하기
		
//		//2단 형태
//		for(int by=2; by<=9; by++) {
//			System.out.printf("2 X %d = %d\n", by, 2*by);
//		}
//		
//		//3단 형태
//		for(int by=3; by<=9; by++) {
//			System.out.printf("3 X %d = %d\n", by, 3*by);
//		}
//		
//		//4단 형태
//		for(int by=4; by<=9; by++) {
//			System.out.printf("4 X %d = %d\n", by, 4*by);
//		}
		for(int dan=2; dan<=9; dan++) {
			if(dan % 2 == 1) continue;
			for(int by=1; by<=9; by++) {
				System.out.printf("%d X %d = %d\n", dan, by, dan*by);
			}
		}
		

	}

}
