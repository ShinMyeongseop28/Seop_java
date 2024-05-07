import java.util.Scanner;

public class HomeworkEx01 {

	public static void main(String[] args) {
		//키보드로 나이를 입력하자.
		//제시문: 당신의 나이는?
		//입력한 나이에 따라 연령대(유아, 소아, 청소년, 성인)출력하기
		//유아: 6세 미만
		//소아: 12세 미만
		//청소년: 19세 미만
		//성인: 그 외 
		
		Scanner scan = new Scanner(System.in);
		System.out.println("당신의 나이는?");
		int age;
		age = scan.nextInt();
		String range;
		if (age < 6) {
			range = "유아";
//			System.out.printf("%d세는 유아입니다.", age);
		}
		else if (age < 12) {
			range = "소아";
//			System.out.printf("%d세는 소아입니다.", age);
		}
		else if (age < 19) {
			range = "청소년";
//			System.out.printf("%d세는 청소년입니다.", age);
		}
		else {
			range = "성인";
//			System.out.printf("%d세는 성인입니다.", age);
		}
		System.out.printf("%d세는 %s", age, range);
		
	}

}
