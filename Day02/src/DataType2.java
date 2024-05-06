public class DataType2 {
	public static void main(String[] args) {
		char ch = 'a';
		ch = '가';
		System.out.println( ch );
		
		boolean ok;
		ok = false;
		ok = true;
		System.out.println( ok );
		
		//동일한 타입의 변수 여러개 선언가능
		int n1, n2, n3, n4;
		n1 = 10;  // 초기화식: 맨 처음 데이터를 담는(할당하는) 처리
		n2 = 20; 
		
		//변수는 초기화되어 있어야(한 번은 데이터를 담아야) 사용할 수 있다.
		System.out.println( n1 );		
		System.out.println( n2 );		//초기화하지 않았기 때문에 문법적 오류
	}
}