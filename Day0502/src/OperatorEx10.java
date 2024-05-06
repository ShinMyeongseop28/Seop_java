import java.util.Scanner;

public class OperatorEx10 {

	public static void main(String[] args) {
		//나이를 입력받아 유아, 소아, 청소년, 성인으로 구별해 출력하기
		//유아: 6살 미만
		//소아: 12살 미만
		//청소년: 19살 미만
		//그외는 성인
		Scanner scan = new Scanner( System.in );
		System.out.println("나이를 입력하세요");
		int age;
		age = scan.nextInt();
		String old = age < 6 ? "유아" :
			(age < 12 ? "소아" : (age < 19 ? "청소년" : "성인"));
		System.out.printf( "나이: %d살 -> %s입니다.\n", age, old);
	
	}

}
