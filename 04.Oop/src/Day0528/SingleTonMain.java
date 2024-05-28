package Day0528;

public class SingleTonMain {

	public static void main(String[] args) {
//		SingleTon s1 = new SingleTon();
//		System.out.println(s1);
//		
//		SingleTon s2 = new SingleTon();
//		System.out.println(s2);
		SingleTon s1 = SingleTon.getInstance();
		System.out.println(s1);
		
		SingleTon s2 = SingleTon.getInstance();
		System.out.println(s2);
	}

}
