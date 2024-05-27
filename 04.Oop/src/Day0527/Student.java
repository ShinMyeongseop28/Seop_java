package Day0527;

public class Student {
	static int seqID = 24001;
	int id;
	String name, phone, gender;
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
