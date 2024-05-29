package abstract1;

public class Cat extends Animal{
//	String kind;
	Cat(String kind) {
//		this.kind = kind;
		super(kind);
	}
	
	void sound() {
		System.out.println(kind + "야옹~");
	}

}
