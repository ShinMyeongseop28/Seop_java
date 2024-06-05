package Question03;

import java.util.Scanner;

public class C {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("성적을 입력하세요!");
		int jumsu;
		String result="";
		System.out.print("성적은: ");
		
		while( true ) {
			jumsu = scan.nextInt();
			if(jumsu>100) {
				System.out.println("100점을 넘으면 안됩니다. 다시 입력해주세요.");
			}
			else if(jumsu >= 90) {
				result = "A";
				break;
			}else if (jumsu >= 80) {
				result = "B";
				break;
			}else if (jumsu >= 70) {
				result = "C";
				break;
			}else if (jumsu >= 60) {
				result = "D";
				break;
			}else if (0<= jumsu && jumsu < 60){
				result = "F";
				break;
			}else if (jumsu < 0) {
				System.out.println("음수 입력 안됩니다. 0이상 100이하의 값을 쓰세요.");
			}
			
		}
		scan.close();
		System.out.printf("성적은: %s", result);
	}

}
