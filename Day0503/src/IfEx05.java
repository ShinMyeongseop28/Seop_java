
public class IfEx05 {

	public static void main(String[] args) {
		//성적에 따른 학점 출력하기
		//성적을 담을 변수
		int score = 80;
		if(score >= 90) {
			System.out.println("A학점");
		}
		else if(score >=80) {
			System.out.println("B학점");
		}
		else if(score >=70) {
			System.out.println("C학점");
		}
		else if(score >=60) {
			System.out.println("D학점");
		}
		else {System.out.println("F학점");
		}
		
	}

}
