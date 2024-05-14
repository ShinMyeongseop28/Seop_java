
public class ArrayEx06 {

	public static void main(String[] args) {
		int no[] = { 10, 20, 30, 40, 50, 60 };
		for(int i=0; i<no.length; i++) {
			System.out.println(no[i]);
		}
		
		for( int n : no ) {
			System.out.println(n);
		}
		
		//no의 값을 합한 결과 출력하기
		int sum=0;
		for(int i=0; i<no.length; i++) {
			sum += no[i];
		}
		System.out.println("합: " + sum);
		//향상된 for문으로 변경하기
		sum = 0;
		for( int value : no ) {
			sum += value;
		}
		System.out.println("합: " + sum);
		
		
	}

}
