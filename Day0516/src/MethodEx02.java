
public class MethodEx02 {
	public static void main(String[] args) {
		int n1 = 12, n2 = 7;
		add(n1, n2);
		int n3 = minus(n1, n2);
		int result = multiply(n1, n2);
		System.out.println("곱셈 result: " + result);
		//곱셈 연산 결과값을 나눗셈 연산의 피젯수로 사용해야 한다: 10(피젯수) / 2(젯수)
		double dResult = divide(result, n3);
		System.out.println("나눗셈 result: " + result);
	}
	//두 정수간의 사칙연산을 하는 메소드
	//덧셈연산
	static int add(int no1, int no2) {
		int result = no1 + no2;
		System.out.printf("%d + %d = %d\n", no1, no2, result);
		return result; //return할 데이터가 없는 경우 생략가능
	}
	//뺄셈연산
	static int minus(int no1, int no2) {
		int result = no1 - no2;
		System.out.printf("%d - %d = %d\n", no1, no2, result);
		return result; 
		
	}
	//곱셈연산
	static int multiply(int no1, int no2) {
		int result = no1 * no2;
		System.out.printf("%d * %d = %d\n", no1, no2, result);
		return result;
	}

	//나눗셈연산
	static double divide(int no1, int no2) {
		double result = no1 / (double)no2;
		System.out.printf("%d / %d = %f\n", no1, no2, result);
		return result;
	}

}
