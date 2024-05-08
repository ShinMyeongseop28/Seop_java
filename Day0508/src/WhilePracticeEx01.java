import java.util.Scanner;

public class WhilePracticeEx01 {

	public static void main(String[] args) {
		//제시문: 구구단 몇단?
		//ex)7
		//출력결과
		//7단
		//7 X 1 = 7
		//....
		//7 X 9 = 63
		System.out.println("구구단 몇단?");
		int multi, num = 1;
		Scanner s = new Scanner(System.in);
		multi = s.nextInt();
		while(num < 10){
			System.out.printf("%d X %d = %d\n", multi, num, multi*num);
			++num;
		}
	}

}
