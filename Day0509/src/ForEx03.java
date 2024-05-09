import java.util.Scanner;

public class ForEx03 {
	public static void main(String[] args) {
		//1부터 입력한 수까지 중 3의 배수만 출력하기 - for문
		Scanner s = new Scanner(System.in);
		System.out.println("수를 입력하세요");
		int num = s.nextInt();
		for(int j=1; j<=num; j++) {
			if(j%3==0) {
			System.out.println(j);
			}
			
		}
		
//		for(int j=3; j%3==0; j++) {
//			System.out.println(j);
//		} 3에서 한번만 나오고 4에서 끝나버린다.

	}

}
