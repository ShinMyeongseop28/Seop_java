
public class LoopEx05 {
	public static void main(String[] args) {
		//직각삼각형
//		******	1행 - 5열
//		****	2행 - 4열
//		***		3행 - 3열
//		**		4행 - 2열
//		*		5행 - 1열
//		for(int row=1; row<=5; row++) {
//			for(int col=1; col<=6-row; col++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//		for(int row=1; row<=5; row++) {
//			for(int col=row; col<=5; col++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		for(int row=1; row<=5; row++) {
			for(int col=5; col>=row; col--) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
	}

}
