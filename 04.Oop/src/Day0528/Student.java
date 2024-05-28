package Day0528;

public class Student {
	static int seqID;
	int id;
	String name, phone, gender;
	//static 필드 초기화블럭
	static {
		seqID = 24001;
		System.out.println("클래스 로딩때 static block");
	}
	
	Student( String name, String gender) {
		this.id = seqID++;
		this.name = name;
		this.gender = gender;
	}
	Student(String name, String gender, String phone) {
		this(name, gender);
		this.phone = phone;
	}

}
