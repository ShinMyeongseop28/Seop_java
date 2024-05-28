package People;

public class Student extends Person{
	//이름, 나이, 학번
	String StudentNo;
	
	//등교한다
	void gotoSchool() {
		System.out.println(name + " 등교한다");
	}

}
