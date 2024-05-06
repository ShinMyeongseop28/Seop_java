
public class OperatorEx07 {

	public static void main(String[] args) {
		//삼항연산자(조건연산자) : 조건 ? 참인경우 데이터 : 거짓인 경우 데이터
		int no = 10;
		boolean tf = no == 10 ? true : false;
		System.out.println( tf );
		
		String result = no > 10 ? "no는 10보다 크다" : "no는 10보다 크지 않다";
		System.out.println( result );
		
		int score = 65;
		//Pass: 60점 이상, Fail: 60점 미만
		result = score >= 60 ? "Pass" : "Fail";
		System.out.printf( "%d점: %s\n", score, result );
		
		// 수가 짝수인지 홀수인지 판단: 2로 나눈 나머지가 0: 짝수, 1: 홀수
		no = 54;
		result = no % 2 == 0 ? "짝수" : "홀수";
		System.out.printf( "%d는 %s\n", no, result );
		
	}

}
