
public class SwitchEx03 {
	public static void main(String[] args) {
		//3의 배수(3으로 나눈 나머지가 0)인지 아닌지 출력하기
		//0,1,2
		int no = 5;
		switch( no % 3 ) {
		case 0:
			System.out.println( no + "은(는) 3의 배수" );
			break;
		case 1:
		case 2:
			System.out.println( no + "은(는) 3의 배수 아님" );
		}
		
//		else = default
		
	}

}
