import java.util.Scanner;

public class OperatorEx09 {

	public static void main(String[] args) {
		//키보드로 입력받은 성적이 Pass인지 Fail인지 출력하기
		Scanner scan = new Scanner( System.in );
		System.out.println( "성적을 입력하세요" );
		String result;
		int score;
		score = scan.nextInt();
		result = score >= 60 ? "Pass입니다." : "Fail입니다.";
		System.out.printf( "성적: %d점 -> %s\n", score, result);
		
		//입력한 성적에 대한 학점 출력하기
		//90점 이상: A학점
		//80점 이상: B학점
		//70점 이상: C학점
		//60점 이상: D학점
		//그외: F학점
		String grade = score >=90 ? "A" : 
			(score >= 80 ? "B" : (score >= 70 ? "C" :
				(score >= 60 ? "D" : "F")));
		System.out.printf( "성적: %d점 -> %s학점입니다.\n",score, grade );

	}

}

