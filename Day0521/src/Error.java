
public class Error {

	public static void main(String[] args) {
		int no1, no2, no;
		no1 = 10;
		no2 = 2;
		no = no1 / no2;
		System.out.printf( "%d / %d = %d\n", no1, no2, no);
		
		//문법적 오류는 아니나(컴파일은 정상적),
		//프로그램 실행시 오류가 발생하는 경우: 프로그래밍적으로 해결한다
		//: 발생한 예외(Exception)에 대한 처리
		//1.익셉션이 발생될 수 있는 부분을 try 블럭처리
		//2. JVM에게 예외상황을 알린다.
		//	어떤 예외 상황인지 판단 -> 발생한 예외에 적합한 Exception객체를 생성
		//	-> 예외상황이 발생했던 곳에 던진다.
		//	-> 던져진 Exception 객체를 받아서 처리한다.
		//3. catch 블럭처리
		//	적절한 처리: ..., 에러메시지 출력
		//4. finally 블럭처리: 오류여부와 무관하게 처리할 부분
		
		no1 = 5;
		no2 = 0;
		try {
			no = no1 / no2;
			System.out.printf("%d / %d = %d\n", no1, no2, no);
		}catch(java.lang.ArithmeticException e) {
			System.out.println(e.getMessage() + " : 산술연산오류" );
		}finally {
			System.out.println("Finished");
		}
		
		int datas[] = {10, 20, 30};
		try {
			for(int idx=0; idx<=datas.length; idx++) {
				System.out.println(datas[idx]);
			}
		}catch(java.lang.ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage() + ": 인덱스 범위를 벗어남");
		}
		
		int[] values = {5, 4, 0, 3, 2, 1};
		for(int i=0; i<10; i++) {
			try {
				int result = 100 / values[i];
				System.out.printf("100 / %d = %d\n", values[i], result);
			}catch(Exception e) {
				System.out.println(e.getMessage());
			}
//			try {
//				int result = 100 / values[i];
//				System.out.printf("100 / %d = %d\n", values[i], result);
//				
//			}catch(ArithmeticException e) {
//				System.out.println(e.getMessage() + "산술연산오류");
//			}catch(ArrayIndexOutOfBoundsException e) {
//				System.out.println(e.getMessage() + "인덱스 없음");
//			}
		}		
	}

}
