
public class ArrayEx09 {

	public static void main(String[] args) {
		int[][]no = 
				new int[4][2]; //4행 2열
		//1행
		no[0][0] = 1; //0,0
		no[0][1] = 2; //0,1
		//2행
		no[1][0] = 3; //1,0
		no[1][1] = 4; //1,1
		//3행
		no[2][0] = 5; //2,0
		no[2][1] = 6; //2,1
		//4행
		no[3][0] = 7; //3,0
		no[3][1] = 8; //3,1
		
		//1행만 출력 1헹의 길이 - no[0].length
//		for(int col=0; col<no[0].length; col++) {
//			System.out.println(no[0][col]);
//		}
		//2행만 출력 2헹의 길이 - no[1].length
//		for(int col=0; col<no[1].length; col++) {
//			System.out.println(no[1][col]);
//		}
		
		//행의 길이: no.length
		for(int row=0; row<no.length; row++) {
			for(int col=0; col<no[row].length; col++) {
				System.out.println(no[row][col]);
			}
		}
		
		
		
	}

}
