import java.util.Scanner;

public class OperatorEx08 {

	public static void main(String[] args) {
		//키보드로 입력받은 수로 처리
		//import 단축키: ctrl+shift+o
		Scanner scan = new Scanner( System.in ); 
		//scan에는 생성한 것이 존재하는 위치(주소)가 담겨있다
		//그 주소를 찾아가면 기능들을 사용할 수 있다
		System.out.println( "홀수/짝수 판단할 수를 입력하세요" );
		
		//수가 홀수/짝수 판단
		int no; 
		no = scan.nextInt(); //초기화
		String odd = no % 2 == 0 ? "짝수" : "홀수";
		System.out.printf( "%d : %s", no, odd );
		//메소드명( 파라미터 )
		//생성자명( 파라미터 )
		
	}

}
