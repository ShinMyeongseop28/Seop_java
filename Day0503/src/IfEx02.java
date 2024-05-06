
public class IfEx02 {

	public static void main(String[] args) {
		//어떤 수가 홀수인지 짝수인지 출력하기
		int no = 5;
		//2로 나눈 나머지가 0이면 짝수
		//2로 나눈 나머지가 1이면 홀수
		if( no % 2 == 0 ) {
			System.out.println( no + "는 짝수");
		}
		if( no % 2 == 1) {
			System.out.println( no + "는 홀수");
		}
		
		System.out.println("Finished");
		
		//실습하기
		//성적이 Pass/Fail(60점이상)인지 출력하기 - if문
		
		//String grade;
		//if( no >= 60 ? "Pass" ) {
		//내 성적이 60점 이상이면 Pass
		//내 성적이 60점 미만이면 Fail
		int score = 58;
		if( score >= 60) {
			System.out.printf("내 성적: %d점! 합격!", score);
			
		}
		if( score < 60) {
			System.out.printf("내 성적: %d점.. 불합격ㅠㅠ", score);
		}
		
	}

}
