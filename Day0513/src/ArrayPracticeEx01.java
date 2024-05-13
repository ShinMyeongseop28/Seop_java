
public class ArrayPracticeEx01 {

	public static void main(String[] args) {
		//1.정수 5개를 저장할 배열을 선언하고,
		//2.각 배열요소에 10,20,30,40,50을 저장하기 - for문
		//3.각 배열요소의 합을 구하여 출력하기 - for문
		int no[]= new int[5];
		int sum = 0;
		for(int idx=0; idx<no.length; idx++) {
			no[idx] = (idx+1)*10;
			System.out.println(no[idx]);
			sum += no[idx];
		}
		System.out.println("합: " + sum);
		
		
		
		
		
	}

}
