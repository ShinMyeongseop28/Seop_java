
public class VariableEx02 {
	
	public static void main(String[] args) {
		//변수: 데이터를 얼마든지 바꿔 담을 수 있다.
		int hour = 4;
		int minute =5;
		System.out.println(hour + "시간" + minute + "분");
		
		hour = 6;
		minute = 30;
		System.out.printf( "%d시간 %d분\n", hour, minute );
		
		//상수: 절대 변하지 않는 데이터를 갖는다. - final
		//상수는 대문자로 선언하자: 암묵적규칙
		final double pi = 3.14;
		//pi = 4.14;
		System.out.println( pi );
		
	}

}
