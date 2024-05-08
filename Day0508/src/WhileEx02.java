
public class WhileEx02 {

	public static void main(String[] args) {
		// 3 X 1 = 3
		// 3 X 2 = 6
		// 3 X 3 = 9
		// ....
		// 3 X 9 = 27
		int by = 1;
		while( by < 10 ) { // by <= 9
			System.out.printf("3 X %d = %d\n", by, 3*by);
			++by;
		}
		
		
	}

}
