import java.util.Scanner;

public class DoWhileEx02 {

	public static void main(String[] args) {
		//사용자로부터 10 이상의 수를 입력받자
		Scanner scan = new Scanner(System.in);
		int no;
		do {
			System.out.println("10이상의 수를 입력하세요");
			no = scan.nextInt();	
		}while(no < 10);
		
	}

}
