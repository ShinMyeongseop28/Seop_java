import java.util.Scanner;

public class MethodPracticeEx01 {

	public static void main(String[] args) {
//		실습
//		학생명과 성별을 각각 배열로 담자.
//		"강철리", "김선우", "김종덕", "김현준", "박지빈", "신명섭", "이해진", "한신우"
//		"남", "남", "남", "남", "남", "남", "여", "여"
		String students[] = {"강철리", "김선우", "김종덕", "김현준", "박지빈", "신명섭", "이해진", "한신우"};
		String genders[] = {"남", "남", "남", "남", "남", "남", "여", "여"};
//		키보드로 이름 입력시 해당 성별을 출력하기
		Scanner sc = new Scanner(System.in);
//		제시문: 누구의 성별을 알고 싶나요?
		System.out.println("누구의 성별을 알고 싶나요?");
		String name = sc.next();
//		결과: 홍길동의 성별: 남
		String gender = sexual(students, genders, name);
		System.out.printf("%s의 성별: %s\n", name, gender + (gender.isEmpty() ? "존재하지 않습니다": ""));
		
		int idx = sexual(students, name); 
		if(idx>=0) {
			System.out.printf("%s의 성별: %s\n", name, idx==-1 ? 0 : genders[idx]);
		}else {
			System.out.println(name +"씨는 존재하지 않습니다.");
		}
	}
//
//		선언할 메소드: 
//		1. 성별을 반환하는 메소드
	static String sexual(String students[], String genders[], String name) {
		String gender = "";
		for(int idx=0; idx<students.length; idx++) {
			if(students[idx].equals(name)) {
				gender = genders[idx];
				break;
			}
		}
		return gender;
	}
		
//		2. index 를 반환하는 메소드
	static int sexual(String students[], String name) {
		int index = -1;
		for(int idx=0; idx<students.length; idx++) {
			if(students[idx].equals(name)) {
				index = idx;
				break;
			}
		}
		return index;
	}
		
		
}
//
//
//		"010-1111-2222", "010-2222-3333", "010-3333-4444", "010-4444-5555", "010-5555-6666", "010-6666-7777", "010-7777-8888", "010-8888-9999"

