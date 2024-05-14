
public class ArrayPracticeEx02 {

	public static void main(String[] args) {
		//각 행열 값 출력하기
		//1행: 10 20 30
		//2행: 1 2 3
		//3행: 100 200 300
		int no[][] = { {10,20,30}, {1,2,3}, {100,200,300} };
		for(int i=0; i<no.length; i++) {
			System.out.print((i+1)+"행: ");
			for(int j=0; j<no[i].length; j++) {
				System.out.print(no[i][j] + " ");
			}
			System.out.println();
			
		}
		
		
	}

}
