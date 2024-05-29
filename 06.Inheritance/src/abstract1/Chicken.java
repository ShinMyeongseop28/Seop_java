package abstract1;

public class Chicken extends Animal {
//	String kind;
	Chicken(String kind) {
//		this.kind = kind;
		super(kind);
	}
	
	void sound() {
		System.out.println(kind + "꼬끼오~");
	}

}
