
public class IfEx01 {

	public static void main(String[] args) {
		//두 수 중 어떤 수가 더 큰 수인지 판단하기
		//두 수를 담을 변수 선언
		int no1, no2;
		no1 = 10;
		no2 = 20;
		if( no1 > no2 ) { // 10 > 20 : F
			System.out.printf( "%d이 %d보다 더 큰 수\n", no1, no2 );
			System.out.println("여기가 실행됨");
		}
		if( no1 < no2 ) { // 10 < 20 : T
			System.out.printf("%d이 %d보다 더 큰 수\n", no2, no1 );
			System.out.println("여기가 실행됨");
		}
		
		System.out.println("Finished");
	}

}
