import java.util.Scanner;

public class ForGugudan {
	public static void main(String[] args) {
		//구구단 7단 출력하기
		//7 X 1 = 7
		//7 X 9 = 63
		int dan = 7;
		for(int by=1; by<=9; by++) {
			System.out.printf("%d X %d = %d\n", dan, by, dan*by);
		}
		
		
	}

}
