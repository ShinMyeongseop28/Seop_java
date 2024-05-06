
public class VariableEx03 {

	public static void main(String[] args) {
		//두 컵에 담긴 데이터를 바꿔 담기
		int cup1 = 15, cup2 = 5;
		// --> cup1: 15, cup2: 5
		System.out.printf( "cup1: %d, cup2: %d\n", cup1, cup2 );
		
		int cup = cup1;
		cup1 = cup2;
		cup2 = cup;
		System.out.printf( "cup1: %d, cup2: %d, cup: %d\n", cup1, cup2, cup );
		// --> cup1: 0, cup2: 5, cup: 15 
		// --> cup1: 5, cup2: 0, cup: 15 
		// --> cup1: 5, cup2: 15, cup: 0 
	}

}
