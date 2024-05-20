import java.util.Scanner;

public class MethodAge {

	public static void main(String[] args) {
		//실습
		//학생명과 나이를 각각 배열로 담자.
		String students[] = { "철리", "선우", "명섭" };
		int ages[] = { 34, 27, 29 };

		//키보드로 이름 입력시 해당 나이를 출력하기
		Scanner sc = new Scanner(System.in);
		
		//제시문: 누구 나이를 알고 싶나요?
		System.out.println("누구 나이를 알고 싶나요?");
		String name = sc.next();

		//결과: 홍길동의 나이: 28세
		int age = studentAge(students, ages, name);
		if(age > 0) {
			System.out.printf("%s의 나이 : %d세\n", name, age);			
		}else {
			System.out.println(name + "씨는 정보가 없습니다.");
		}
		
		int i = studentAge(students, name);
		if(i >= 0) {
			System.out.printf("%s의 나이 : %d세\n", name, i==-1 ? 0 : ages[i]);			
		}else {
			System.out.println(name + "씨는 정보가 없습니다.");			
		}					
	}
	
	static int studentAge(String[] students, String name) {
		int index = -1;
		for(int i=0; i<students.length; i++) {
			if(name.equals(students[i])) {
				index = i;
				break;
			}
		}
		return index;
	}
	
	//선언할 메소드: 나이를 반환하는 메소드
	static int studentAge(String[] students, int[] ages, String name) {
		int age = 0;
		for(int i=0; i<students.length; i++) {
			if(name.equals(students[i])) {
				age = ages[i];
				break;
			}
		}
		return age;
	}
}
