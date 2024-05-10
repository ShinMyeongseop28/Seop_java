
public class LoopEx02 {

	public static void main(String[] args) {
		//구구단 가로 출력하기
		//2 X 1 = 2		3 X 1 = 3	 4 X 1 = 4	 5 X 1 = 5
		//2 X 2 = 4		3 X 2 = 6
		//2 X 3 = 6
		//2 X 4 = 8
		//2 X 5 = 10
		//....
		//2 X 9 = 18	3 X 9 = 27	 4 X 9 = 36	 5 X 9 = 45
		
		for(int by=1; by<=9; by++) {
			for(int no=2; no<=9; no++) {
				System.out.printf("%d X %d = %d\t", no, by, no*by);
			}
			System.out.println();
		}
		
//		for(int by=1; by<=9; by++) {
//			for(int no=2; no<=9; no++) {
//				System.out.printf("%d X %d = %d\t", no, by, no*by);
//			}
//			System.out.println();
//		}
		
		
//		for(int no=2; no<=9; no++) {
//			System.out.printf("%d X 1 = %d\t", no, no*1);
//			System.out.println();
//			for(int dan=2; dan<=9; dan++) {
//				System.out.printf("%d X %d = %d\n", no, dan, no*dan);
//			}
//		}
		
//		for(int dan=2; dan<10; dan++) {
//			System.out.printf("%d x 1 = %d\t", dan, dan*1);
//		}
//		System.out.println();
//		for(int dan=2; dan<10; dan++) {
//			System.out.printf("%d x 2 = %d\t", dan, dan*2);
//		}
//		System.out.println();
//		for(int dan=2; dan<10; dan++) {
//			System.out.printf("%d x 9 = %d\t", dan, dan*9);
//		}
	
		
	}

}
