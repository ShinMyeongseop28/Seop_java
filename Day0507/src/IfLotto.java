import java.util.Random;
import java.util.Scanner;

public class IfLotto {

	public static void main(String[] args) {
		//1~45까지의 수를 랜덤추출/수동선택
		System.out.println("로또 선택 자동/수동(0/1)?");
		Scanner scan;
		scan = new Scanner(System.in);
		int choice = scan.nextInt();
		if( choice == 0 ) {
			System.out.println("자동으로 추출됩니다");
			Random r = new Random();
			int auto1 = r.nextInt(45) + 1;
			int auto2 = r.nextInt(45) + 1;
			int auto3 = r.nextInt(45) + 1;
			int auto4 = r.nextInt(45) + 1;
			int auto5 = r.nextInt(45) + 1;
			int auto6 = r.nextInt(45) + 1;
			System.out.printf("%02d %02d %02d %02d %02d %02d", 
					auto1, auto2, auto3, auto4, auto5, auto6);
		}
		else if( choice == 1 ) {
			System.out.println("수동으로 추출됩니다");			
			System.out.print("1.");
			int pass1 = scan.nextInt();
			System.out.print("2.");
			int pass2 = scan.nextInt();
			System.out.print("3.");
			int pass3 = scan.nextInt();
			System.out.print("4.");
			int pass4 = scan.nextInt();
			System.out.print("5.");
			int pass5 = scan.nextInt();
			System.out.print("6.");
			int pass6 = scan.nextInt();
			System.out.printf("%02d %02d %02d %02d %02d %02d", 
					pass1, pass2, pass3, pass4, pass5, pass6);
			
		}
				
	}

}
