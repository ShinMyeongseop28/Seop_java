package Day0528;

public class StudentMain {

	public static void main(String[] args) {
		//홍길동 학생정보 등록
		Student hong = new Student("홍길동", "남");
		Student park = new Student("박문수", "남", "010-1234-5678");
		info(hong);
		info(park);
	}
	
	static void info(Student who) {
		System.out.println("학번: " + who.id);
		System.out.println("학생명: " + who.name);
		System.out.println("성별: " + who.gender);
		System.out.println("전화번호: " + (who.phone==null ? "" : who.phone));
		System.out.println("--------------------");
		
	}

}
