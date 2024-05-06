import java.util.Scanner;

public class Operator2 {
	public static void main(String[] args) {
	
		boolean ok;
		// 논리연산자 : 논리곱*(&&), 논리합+(||), not연산자
		// 논리곱: 모두 T 인 경우만 T
		// 논리합: 하나라도 T 이면 T(모두 F인 경우만 F)
		ok = 10 == 5 && 20 > 5 ; //F && T -> F
		System.out.printf( "논리곱: %b \n", ok );
	
		ok = 10 == 5 || 20 > 5 ; //F || T -> T
		System.out.printf( "논리합: %b \n", ok );
	
		ok = 10 != 5 && 20 > 5 ; //T && T -> T
		System.out.printf( "논리곱: %b \n", ok );
	
		ok = 10 != 5 || 20 > 5 ; //T || T -> T
		System.out.printf( "논리합: %b \n", ok );
	
		ok = 10 == 5 || 20 < 5 ; //F || F -> F
		System.out.printf( "논리합: %b \n", ok );
	
		//초기화(맨처음 값 담기) : 1 + (2 - 3) * 4 / 5
		int n1 = 5, n2 = 2, n3 = 5, n4 = 10;
		ok = ( n1 == n2 || n1 == n3 ) &&  !( n3 > n4 );
		//   ( 5 == 2 || 5 == 5 ) && !(5 > 10)
		//   ( F || T ) && !F
		//   T && T --> T
		System.out.println( ok );
		
		// ! : not (반대로 만들기) : true -> false, false -> true
		ok = 10 != 5; //true
		System.out.println( ok );
		
		ok = ! ok;  // true -> false
		System.out.println( ok );
		
		//복합대입연산자: +=, -=, *=, /=, %=
		// a = a + b;  --> a += b;
		// a = a - b;  --> a -= b;
		// a = a * b;  --> a *= b;
		// a = a / b;  --> a /= b;
		// a = a % b;  --> a %= b;
				
		int no = 30;
		// no 에서 (2*3+4)를 빼서 no 에 담기
		no = no - (2*3+4);
		no -= 2*3+4;
		
		//삼항연산자(조건연산자): 조건식 ? 참인경우 반환 : 거짓인 경우 반환
		// "" 의 데이터타입: String
		String result = no == 10 ? "10입니다" : "10이 아닙니다";
		System.out.println( result );
	
		boolean yesno = no == 10 ? true : false;
		System.out.println( yesno );
	
		int n = no == 10 ? 1 : 0;
		System.out.println( n );
	
		int dadAge = 40, momAge = 30;
		String age = dadAge > momAge ?  "네" : "아니요";
		System.out.println("아빠 나이가 엄마 나이보다 많나요? " + age); //"네/아니요"
	
		int javaTest = 55; // Pass / Fail : 60점이상
		String pf = javaTest >= 60 ? "Pass" : "Fail";
		System.out.println("자바 테스트 결과: " + (javaTest >= 60 ? "Pass" : "Fail"));
	
		//어떤 수가 짝수인지 홀수인지 판단해서 출력하기
		int number = 15;
		String odd = number % 2 == 1 ? "홀수" : "짝수";
		System.out.printf("%d은 %s\n", number, odd);

		//키보드 입력값으로 처리하기
		Scanner scan = new Scanner( System.in ); //ctrl + shift + o
		
		//짝수 홀수 판단하기
		System.out.println("짝수/홀수 판단할 수를 입력하세요 ");
		number = scan.nextInt();
		odd = number % 2 == 1 ? "홀수" : "짝수";
		System.out.printf("%d은 %s\n", number, odd);
	
		//과제: 시험성적을 키보드로 입력해서 Pass / Fail 출력하기
		Scanner passFail = new Scanner( System.in );
		System.out.println("시험성적을 입력하세요 ");
		javaTest = passFail.nextInt();
		pf = javaTest >= 60 ? "Pass" : "Fail";
		System.out.println("테스트 결과: " + (javaTest >= 60 ? "Pass" : "Fail"));
		
	}
}