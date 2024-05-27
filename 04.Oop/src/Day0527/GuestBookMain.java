package Day0527;

public class GuestBookMain {

	public static void main(String[] args) {
		//2. 방명록 생성할 main있는 클래스
		//	 방명록 개게 생성해서 등록한 글목록 출력
		
		//홍길동이 첫번째 글 씀
		GuestBook hong = new GuestBook("안녕","반가워","홍길동","24-05-26");
		
		//심청이 두번째 글 씀
		GuestBook sim = new GuestBook("hi","날이덥다","심청","24-05-27");
		
		//박문수가 세번째 글 씀
		GuestBook park = new GuestBook("hello","여름이네","박문수","24-05-27");

		info(hong);
		info(sim);
		info(park);
		
		//목록으로 출력
		GuestBook[] list = new GuestBook[10];
		list[0] = hong;
		list[1] = sim;
		list[2] = park;
		list(list);
		
	}
	
	static void list(GuestBook[] list) {
		System.out.println("번호 \t제목 \t내용 \t작성자 \t작성일자");
		for(GuestBook guestBook : list) {
			if(guestBook == null) continue;
			System.out.println(guestBook.object_num + "\t");
			System.out.println(guestBook.title + "\t");
			System.out.println(guestBook.content + "\t");
			System.out.println(guestBook.name + "\t");
			System.out.println(guestBook.date+ "\t");
			System.out.println();
		}
	}
	
	static void info(GuestBook guestBook) {
		System.out.println("번호: " + guestBook.object_num);
		System.out.println("제목: " + guestBook.title);
		System.out.println("작성자: " + guestBook.name);
		System.out.println("작성일자: " + guestBook.date);
		System.out.println("내용: " + guestBook.content);
		System.out.println("--------------------");
	}

}
