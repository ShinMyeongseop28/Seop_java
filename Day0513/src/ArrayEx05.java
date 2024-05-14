import java.util.Scanner;

public class ArrayEx05 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//시험성적을 4과목 입력하기-배열 사용하기
		//4과목의 평균 출력하기, 학점 출력하기
		String subjects[] //= new String[4];
					= {"자바", "HTML", "CSS", "자바스크립트"};
		int[] scores = new int[4];
		System.out.println("각 과목의 성적을 입력하세요!");
		for(int idx=0; idx<subjects.length; idx++) {
			System.out.printf("%s: ", subjects[idx]);
			scores[idx] = scan.nextInt();
		}
		
		int total = 0;
		for(int idx=0; idx<subjects.length; idx++) {
			total += scores[idx];			
		}
		System.out.println("총점: " + total);
		
		double avg = total / (double)scores.length;
		System.out.printf("평균: %.1f\n", avg);
		String grade;
		if(avg>=90) {
			grade = "A";
		}else if(avg >=80) {grade = "B";}
		else if(avg >=70) {grade = "C";}
		else if(avg >=60) {grade = "D";}
		else {grade = "F";}
		System.out.println("학점: " + grade);
				
	}

}
