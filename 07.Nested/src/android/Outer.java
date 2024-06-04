package android;

public class Outer {
	int field = 10; //선언한 필드에 데이터 담기
	String data = "10";
	
	//익명클래스
	Button btn = new Button() {
		public void click() {
			System.out.println("익명 버튼클래스 필드 클릭");
		}
	};
	
	String function() {
		return new String();
	}
	
	Button method() {
		return new Button() {
			public void click() {
				System.out.println("익명 버튼클래스 메소드 클릭");
			}
		};
	}

}
