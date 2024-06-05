package Question02;

import java.util.Scanner;

public class B {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a, b;
		System.out.println("두 정수를 입력하세요");
		System.out.print("a: ");
		a = scan.nextInt();
		System.out.print("b: ");
		b = scan.nextInt();
		int result = 0;
		if(a > b) {
			result = a - b;
		}else if(a < b) {
			result = a + b;	
		}else if(a == b) {
			result = a * b;
		}
		System.out.println("결과: " + result);
		
	}

}
