
public class DoWhileEx01 {

	public static void main(String[] args) {
		//1~10까지 출력
		int no = 1;
		do {
			System.out.println(no);
			++no;
		}
		while( no <= 10 ); 
		System.out.println("--------");
		
		//10~1까지 수를 출력하기
		//no: 11
		do {
			--no;
			if( no==0 )break;
			System.out.println( no );
		}while( no >= 1 );
		
		//반복문을 빠져나가기 위한 명령문: break;
		
		
	}

}
