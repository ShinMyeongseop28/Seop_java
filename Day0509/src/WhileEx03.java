
public class WhileEx03 {

	public static void main(String[] args) {
		//1~100까지 출력
		//1~100의 합 출력: 1+2+3+4...+100
		int no = 1, sum = 0;
		while( no <= 100 ) {
			System.out.println( no );
			sum += no;	//sum = sum + no;
			++no;
		}
		System.out.println("1~100의 합: " + sum);
		//no:  1	2	  3
		//sum: 0+1	0+1+2 0+1+2+3
		
	}

}
