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
//		String old = age < 6 ? "유아" :
//			(age < 12 ? "소아" : (age < 19 ? "청소년" : "성인"));
		if (age < 6) {
//			System.out.printf("%s입니다.", old);
			System.out.println("유아입니다.");
		}
		else if (age < 12) {
//			System.out.printf("%s입니다.", old);
			System.out.println("소아입니다.");
		}
		else if (age < 19) {
//			System.out.printf("%s입니다.", old);
			System.out.println("청소년입니다.");
		}
		else {
//			System.out.printf("%s입니다.", old);
			System.out.println("성인입니다.");
		}
		
	}

}
