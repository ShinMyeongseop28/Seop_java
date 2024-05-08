import java.util.Scanner;

public class SwitchPracticeEx01 {

	public static void main(String[] args) {
		//각 월별 분기 출력하기
		//제시문: 지금 몇 월인가요?
		//ex)6
		//출력: 6월은 2분기 입니다
		Scanner scan = new Scanner(System.in);
		System.out.println("지금 몇 월인가요?");
		int month;
		month = scan.nextInt();
		switch(month) {
		case 1:
		case 2:
		case 3:
				System.out.printf("%d월은 1분기입니다", month);
				break;

		case 4:
		case 5:
		case 6:
				System.out.printf("%d월은 2분기입니다", month);
				break;
			
		case 7: 
		case 8: 
		case 9: 
				System.out.printf("%d월은 3분기입니다", month);
				break;
			
		case 10: 
		case 11: 
		case 12: 
				System.out.printf("%d월은 4분기입니다", month);
				break;
			
			
		}
				
	}

}
