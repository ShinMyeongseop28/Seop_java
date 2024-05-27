package view;

import java.util.Scanner;

public class RegisterView {
	//키보드로 입력하기
	//방명록 글 객체를 생성해서 배열변수에 주소 담기
	
	RegisterView(Scanner sc) {
		System.out.println("글쓰기화면---------------");
		System.out.print("제목: ");
		String title = sc.nextLine();
		
		System.out.print("내용: ");
		String content = sc.nextLine();
		
		System.out.print("작성자: ");
		String name = sc.nextLine();
		System.out.println("-------------------------");
		
		GuestBook guestBook =
				new GuestBook(title, name, "24-05-27", content);
		GuestBookMain.list[GuestBookMain.seq++] = guestBook;
		

	}

}
