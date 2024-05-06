
public class Const {
	public static void main(String[] args) {
		
		int no = 10; //변수
		
		//문자열은 ""표현
		System.out.println( "no에 담긴 값은 " + no ); // no에 담긴 값은 10
		// + 의 역할: 연결연산자
		
		no = no + 10; // +의 역할: 산술연산자
		System.out.println( "no에 담긴 값은 " + no ); // no에 담긴 값은 20
		
		//상수 : final - 대문자로만 표현
		final double PI;
		
		PI = 3.14;
		System.out.println( "pi에 담긴 " + PI ); // no에 담긴 값은 3.14
		//PI = 4.14; //final 상수는 값의 변경 불가로 오류
	}

}
