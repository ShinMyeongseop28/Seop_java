package view;

public class ListView {
	//배열에 있는 글목록을 출력
	ListView() {
		System.out.println("번호 \t제목 \t작성자 \t작성일자 \t내용");
		for(GuestBook guestBook : GuestBookMain.list) {
			if(guestBook == null) continue;
			System.out.print(guestBook.object_num + "\t");
			System.out.print(guestBook.title + "\t");
			System.out.print(guestBook.name + "\t");
			System.out.print(guestBook.date + "\t");
			System.out.print(guestBook.content + "\t");
			System.out.println();
		}
	}

}
