public class DataType1 {
	public static void main(String[] args) {		
		//라인주석처리 : // (단축키: ctrl + /, ctrl + shift + c) - 권장
		//여러행주석처리 : /* */ (단축키: crtrl + shift + /)
				
		//변수선언문: 데이터타입 변수명;
		int cup;
		//대입문(데이터 담기/할당하기) : 변수명 = 데이터값;
		//= 는 대입연산자로 = 를 기준으로 우측의 데이터를 좌측의 변수에 담는다(할당한다)		
		cup = 10;
		//변수에는 데이터값이 바뀌어 담길수 있다
		cup = 20;
		//변수에 담긴 데이터값 출력하기
		System.out.println( cup );
		
		//long 타입에 수치데이터를 담을때는 반드시 l/L 을 붙여서 long 임을 알려줘야 한다
		long big;
		big = 100L;
		
		//float 타입에 수치데이터를 담을때는 반드시 f/F 를 붙여서 float 임을 알려줘야 한다.
		float pi1 = 3.14F; 
		double pi2 = 3.14;		
		System.out.println( pi2 );	
	}
}