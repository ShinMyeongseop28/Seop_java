
public class VariableEx01 {

	public static void main(String[] args) {
//		주석처리:ctrl + shift + c, ctrl + /
		//변수선언: 데이터타입 변수명
		//정수 10을 담을 그릇 준비하기
		int var1;//변수선언
		//변수에 맨처음 데이터를 담는 행위: 초기화
		var1 = 10; //var1에 10 담기: = 대입(할당)연산자
		var1 = var1 + 5;
		//var1에 담긴 데이터값 확인: 출력문으로
		System.out.println(var1);

		//라인복사붙여넣기: ctrl + alt + 방향키(상하)
		//라인이동: alt + 방향키(상하)
		//변수: 값을 여러번 바꿀수 있다.
		//var1에 10을 추가
		var1 = var1 + 20;
		System.out.println("var1: " + var1); // +: 연결(결합)연산자
		//var1에는 30이 담겨있다.
		System.out.println("var1에는 " + var1 + "이 담겨있다."); //출력문의 가독성이 낮아짐
		//출력의 형태를 지정해서 출력하기: printf
		//데이터타입에 맞는 형식: 정수%d, 소수%f, 문자%c, 문자열%s, 불리언%b
		System.out.printf("%s에는 %d이 %s있다.\n", "var1", var1, "담겨");


		//라인삭제:ctrl + d

		long data;
		data = 2200000000L; //초기화

		//부동소수: 기본형(double), float
		double pi;
		pi = 3.14;
	    //float pi = 3.14F; //초기화
		//pi 라는 변수명에 담긴 데이터값 확인: 출력문으로
		//로컬변수(local variable)의 사용은 초기화해야만 한다.
		System.out.println( pi );

		//문자타입: char - 문자 한 개만 담을 수 있다: 데이터 표현시 ''
		//문자를 담을 변수 선언하기: 데이터타입 + 변수명;
		char cup = '가';
		System.out.println( cup );

		//문자열타입: String - 여러개의 문자를 담을 수 있다: 데이터 표현시 ""
		//"처음 배우는 자바" 문자열을 담을 변수 선언하기
		String cup2 = "처음 배우는 자바";
		System.out.println( cup2 );

		//데이터타입: 기본타입(primitive타입)byte, short, int, long, float, char, boolean, String
		// " "   : 참조타입(reference타입)String

		//boolean: 참/거짓(tre/false)의 데이터를 담을 수 있다.
		boolean today;
		//개강날짜를 담을 변수 선언하기
		int firstDay = 29;
		today = firstDay == 29; // ==: 동등비교연산자
		//24 == 29 : 아니오 - false
		System.out.println(today);


	}

}
