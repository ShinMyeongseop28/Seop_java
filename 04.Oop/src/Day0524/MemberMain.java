package Day0524;

public class MemberMain {

	public static void main(String[] args) {
		//홍길동 회원가입
		Member hong =
		new Member("홍길동", "hong", "1234", "남", "010-1234-5678", 18);
		hong.phone = "02-1245-2548";
		myInfo(hong);
		
		//박문수 - 필수항목만 입력
		Member park;
		park = new Member("박문수", "park", "9999", "남");
		myInfo(park);
		
		//회원목록조회
		Member[] list = new Member [2];
		list[0] = hong;
		list[1] = park;
		
		memberList(list);
		
		//박문수회원의 전화번호 변경하기
//		String phone = "062-4824-1578";
		park.changePhone("062-4824-1578");
		System.out.println("박문수의 전화번호 변경하기");
		//park.phone = phone;
//		park.changePhone(phone);
		
		//박문수회원정보 확인하기

	}
	
	static void memberList(Member[] list) {
		System.out.println("----------회원목록----------");
		System.out.println("회원명 \t아이디 \t성별 \t전화번호 \t나이");
		for( Member member: list) {
			System.out.println(member.name  
					+ "\t" + member.id
					+ "\t" + member.gender
					+ "\t" + (member.phone==null ? "" : member.phone)
					+ "\t" + (member.age==0 ? "" : member.age));
			
		}
	}
	
	static void myInfo(Member member) {
		System.out.println("       회원정보");
		System.out.println("회원명: " + member.name);
		System.out.println("아이디: " + member.id);
		System.out.println("비밀번호: " + "******");
		System.out.println("성별: " + member.gender);
		System.out.println("전화번호: " + (member.phone==null ? "" : member.phone));
		System.out.println("나이: " + (member.age==0 ? "" : member.age));
	}

}
