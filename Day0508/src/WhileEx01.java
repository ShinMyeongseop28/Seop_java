
public class WhileEx01 {

	public static void main(String[] args) {
		//Hello를 10번 출력하기
//		System.out.println("Hello");
//		System.out.println("Hello");
//		System.out.println("Hello");
//		System.out.println("Hello");
//		System.out.println("Hello");
//		System.out.println("Hello");
//		System.out.println("Hello");
//		System.out.println("Hello");
//		System.out.println("Hello");
//		System.out.println("Hello");
		
		//1~10까지 10회
		int no = 1;
		while( no <= 10 ) { // 1 <= 10:T --> 11 <= 10:F
			System.out.println("Hello");
			++no;
		}
		//1~10까지 수를 출력하기
		no = 1;
		while ( no <= 10) { //11 <= 10:F
			System.out.println( no );
			++no;
		}
		//10~1까지 수를 출력하기
		no = 10;
		while ( no >= 1 ) { //10 >= 1:T
			System.out.print( no +"\t" );
			--no;			
		}
		System.out.println();
		
		// * 을 5개 출력하기 : *****
		no = 10;
		while( no <= 14 ) {
			System.out.print("*");
			++no;
		}
	}

}
