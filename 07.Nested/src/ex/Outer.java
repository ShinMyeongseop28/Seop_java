package ex;

public class Outer {
	int field = 10;
	public Outer() {
		System.out.println("Outer 클래스의 생성자");
	}
	
	public class Inner1{
		int field = 20;
		public Inner1() {
			System.out.println("Outer의 멤버 Inner1 의 생성자");
		}
		void innerMethod() {
			System.out.println("Outer의 멤버 Inner1 의 메소드");
		}
	}
	
	static public class Inner2 {
		int field = 30;
		public Inner2() {
			System.out.println("Outer의 멤버 Inner2의 생성자");
		}
		void innerMethod() {
			System.out.println("Outer의 멤버 Inner2의 메소드");
		}
	}

}
