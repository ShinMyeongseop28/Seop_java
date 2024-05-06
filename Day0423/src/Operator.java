
public class Operator {
	public static void main(String[] args) {
		// 대입연산자: =
		// 연결연산자: + 
		// 산술연산자: +, -, *, /, %(나머지)
		System.out.println( 10 + 20 ); //산술연산자 
		System.out.println( "10" + 20 ); //연결연산자
		System.out.println( 10 * 20 ); //산술연산자
		
		int no1 = 20, no2 = 3;
		int no3 = no1 / no2;
		System.out.println( no1 + " / " + no2 + " = " + no3 ); // "10 / 3 = 3"
		
		//출력의 형태를 포맷해보자
		//포맷형식: 정수(%d), 소수(%f), 문자(%c), 문자열(%s), 엔터(%n)
		System.out.printf( "%d / %d = %d", no1, no2, no3 );
		System.out.println();
		//( ? ) : ?는 파라미터(매개변수)
		
		int no4 = no1 % no2;
		System.out.print( no1 + " % " + no2 + " = " + no4 + "\n" ); // "10 % 3 = 1"
		
		
		final double PI = 3.14;
		//원의 둘레 : 2* PI* 반지름
		//반지름인 5인 원의 둘레 출력하기
		double radius = 9.3;
		double around = 2 * PI * radius;
		System.out.printf( "반지름인 %.1f인 원의 둘레는 %.2f"+ "\n", radius, around );
		
						
		//증감(증가/감소)연산자 : ++/--  : 어떤 수에 1만큼 증가/감소
		int no5 = no4;
		System.out.printf( "no5: %d %n", no5 );
		System.out.println("--------------");
				
		//no5 = no5 + 1;
		//++no5; //선증가
		no5++;   //후증가
		System.out.printf( "no5: %d %n", no5 );
		
		//no5 = no5 - 1;
		//--no5; //선감소
		no5--;	 //후감소	 
		System.out.printf( "no5: %d %n", no5 );
		
		
		//증감연산자의 위치에 따라서 달라지는 부분
		//선증가/감소: 변수값이 선 증가/감소 한 후에 변수가 사용됨
		//후증가/감소: 변수가 사용된 후에 변수값이 증가/감소함		
		int no = 10, result; 
		result = ++no; //no:11(선증가), result:11(선증가된 값이 담김)
		System.out.printf("no, result : %d, %d \n", no, result);
		
		result = no++; //no:11 -> result: 11(값이 담김) -> no: 12(사용된 후에 증가)
		System.out.printf("no, result : %d, %d \n", no, result);
		
		result = --no; //no:11(선감소) -> result:11(선감소된 값이 담김)
		System.out.printf("no, result : %d, %d \n", no, result);
		
		result = no--; //no:11 -> result: 11(값이 담김) -> no: 10(사용된 후에 감소) 
		System.out.printf("no, result : %d, %d \n", no, result);
		
		
		//비교연산자: >, <, >=, <=, ==, !=
		System.out.println( 10 > 5 ); // true
		System.out.println( 10 <= 5 ); // false
		
		// true/false 데이터를 담는 데이터타입: boolean
		boolean ok = 10 > 5;
		System.out.println( ok );
		
		ok = 10 == 5; //false
		System.out.println( ok );

		ok = 10 != 5; //true
		System.out.println( ok );
	}
}