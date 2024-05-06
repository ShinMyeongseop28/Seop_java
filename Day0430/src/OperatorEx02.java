
public class OperatorEx02 {

	public static void main(String[] args) {
		//산술연산자: +, -, *, /, %
		int no1 = 10, no2 = 5, result; 
		String comma = "+";
		//String comma = "사칙연산";
		result = no1 + no2;
		System.out.printf( "%d %s %d = %d\n", no1, comma, no2, result );
		
		comma = "-";
		result = no1 - no2;
		System.out.printf( "%d %s %d = %d\n", no1, comma, no2, result );
		

		comma = "*";
		result = no1 * no2;
		System.out.printf( "%d %s %d = %d\n", no1, comma, no2, result );
		
		
		comma = "/";
		result = no1 / no2;
		System.out.printf( "%d %s %d = %d\n", no1, comma, no2, result );
		
		
		comma = "%";
		result = no1 % no2;
		System.out.printf( "%d %s %d = %d\n", no1, comma, no2, result );
		

	}

}
