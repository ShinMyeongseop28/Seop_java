import java.util.Scanner;

public class MethodPracticeEx01 {

	public static void main(String[] args) {
//		실습
//		학생명과 성별을 각각 배열로 담자.
//		"강철리", "김선우", "김종덕", "김현준", "박지빈", "신명섭", "이해진", "한신우"
//		"남", "남", "남", "남", "남", "남", "여", "여"
//		"010-1111-2222", "010-2222-3333", "010-3333-4444", "010-4444-5555", "010-5555-6666", "010-6666-7777", "010-7777-8888", "010-8888-9999"
		String students[] = {"강철리", "김선우", "김종덕", "김현준", "박지빈", "신명섭", "이해진", "한신우"};
		String genders[] = {"남", "남", "남", "남", "남", "남", "여", "여"};
		String []phones  = {"010-1111-2222", "010-2222-3333", "010-3333-4444", "010-4444-5555", "010-5555-6666", "010-6666-7777", "010-7777-8888", "010-8888-9999"};
//		키보드로 이름 입력시 해당 성별을 출력하기
		Scanner sc = new Scanner(System.in);
//		제시문: 누구의 성별을 알고 싶나요?
		System.out.println("누구의 성별을 알고 싶나요?");
		String name = sc.next();

		//결과: 홍길동의 성별: 남
		String gender = sexual(students, genders, name);
		printInfo(name, gender, ! gender.isEmpty());
//		String gender = sexual(students, genders, name);
//		if(gender.isEmpty()) {
//			System.out.println(name + "의 정보가 없습니다.");
//		}else {
//			System.out.printf("%s의 성별: %s\n", name, gender);						
//		}
		
		//인덱스 출력하기
		int idx = sexual(students, name);
		printInfo(name, idx==-1 ? "": genders[idx], idx==-1 ? false : true);
//		int idx = sexual(students, name);
//		if(idx == -1) {
//			System.out.println(name + "의 정보는 없습니다.");
//		}else {
//			System.out.println(name + "의 성별: " + genders[idx]);
//		}
		
		//성별과 전화번호 출력하기
		String[] info = sexual(name, students, genders, phones);
		boolean exist = info[0] == null ? false : true;
		printInfo("성별", name, info[0], exist);
		printInfo("전화번호", name, info[1], exist);
//		if(info[0] == null) {
//			System.out.println(name + "의 정보가 존재하지않습니다");
//		}else {
//			System.out.println(name + "의 성별: " + info[0]);
//			System.out.println(name + "의 전화번호: " + info[1]);
//		}
		
//		String phone = sexual(name, students, genders, phones)[1];
//		gender = sexual(name, students, genders, phones)[0];
//		System.out.println(name + "의 전화번호 : "+ phone);
		
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
	
//	3. 성별과 전화번호를 반환하는 메소드
	static String[] sexual(String name, String students[], String genders[], String phones[]) {
		String info[] = new String[2];
		for(int idx=0; idx<students.length; idx++) {
			if(name.equals(students[idx])) {
				info[0] = genders[idx];
				info[1] = phones[idx];
				break;
			}
		}
		return info;
	}
	
//	4. 출력 메소드
	static void printInfo(String name, String gender, boolean exist) {
		if(!exist)
			System.out.println(name + "의 정보가 없습니다.");
		else
			System.out.println(name + "의 성별: " + gender);
	}

	static void printInfo(String title, String name, String info, boolean exist) {
		if(!exist)
			System.out.println(name + "의 정보가 없습니다.");
		else
			System.out.printf(name + "의 %s: " + info + "\n", title);
	}
		
		
}

