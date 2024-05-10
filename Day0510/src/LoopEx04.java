
public class LoopEx04 {

	public static void main(String[] args) {
		//*			1회 - 별1회
		//**		2회 - 별2회
		//***		3회 - 별3회
		//...
		//******	5회 - 별5회
		for(int row=1; row<=5; row++) {
//			//row=1
//			System.out.println("*");
//			System.out.println();
//			//row=2
//			System.out.println("*");
//			System.out.println("*");
//			System.out.println();
//			//row=3
//			System.out.println("*");
//			System.out.println("*");
//			System.out.println("*");
//			System.out.println();
			for(int col=1; col<=row; col++) {
				System.out.println("*");
			}
			System.out.println();
		}
	}

}
