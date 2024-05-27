package Day0527;

public class GuestBook {
	//1. 글번호가 자동으로 부여되는 방명록 클래스 선언
	//	 필드선언: 공유글번호, 객체글번호, 제목, 작성자, 작성일자, 내용
	//	 생성자선언: 파라미터 4개짜리 선언
	
	//글번호 자동 부여
	static int share_num= 1;
	int object_num; 
	String title, name, date, content;
	GuestBook(String title, String name, String date, String content) {
		this.object_num = ++share_num;
		this.title=title;
		this.name=name;
		this.date=date;
		this.content=content;

	}

}
