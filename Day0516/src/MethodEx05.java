
public class MethodEx05 {

	//1. 두 수 사이의 정수를 출력하는 처리 만들기
	static void between(int no1, int no2) {
		for(int no=no1+1; no<no2; no++) {
			System.out.print(no + " ");
		}
		System.out.println();
		
	}

	
	
	public static void main(String[] args) {
		
		//2. 메소드를 호출하기
		between(1, 5);
		
		//1과 5사이의 정수 출력하기
//		for(int no=2; no<5; no++) {
//			System.out.println(no + " ");
//		}
//		System.out.println();
		between(5, 10);
		
		//5와 10사이의 정수 출력하기
//		for(int no=6; no<10; no++) {
//			System.out.println(no + " ");
//		}
		
		between(15, 20);
		//15와 20사이의 정수 출력하기
//		for(int no=16; no<20; no++) {
//			System.out.println(no + " ");
//		}
		
		
		
	}

}
