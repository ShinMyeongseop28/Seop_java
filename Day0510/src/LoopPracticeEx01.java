
public class LoopPracticeEx01 {

	public static void main(String[] args) {
		//구구단 2단 ~ 19단 출력
		int dan,by;
		for(dan=2; dan<=19; dan++) {
			System.out.printf( "%d단\n", dan );
			for(by=1; by<=9; by++) {
				System.out.printf( "%d X %d = %d\n", dan, by, dan*by);
			}
		}
		
	}

}
