
public class LoopPracticeEx02 {

	public static void main(String[] args) {
		//구구단 2단 ~ 9단까지 출력하기
		//조건: 아래와 같이 각 단에서
		// X3, X6, X9는 출력하지 않기
		for(int dan=2; dan<=9; dan++) {
			if(dan % 3 == 0) continue;
			for(int by=1; by<=9; by++) {
				System.out.printf("%d X %d = %d\n", dan, by, dan*by);
				
			}
		}
	}

}
