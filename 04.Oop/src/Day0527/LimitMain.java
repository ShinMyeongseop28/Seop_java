package Day0527;

public class LimitMain {

	public static void main(String[] args) {
		System.out.println("상한값: " + Limit.UPPER);
		Limit limit = new Limit();
		limit.setNo(50000);
		System.out.println(limit.no);

		limit.setNo(200000);
		System.out.println(limit.no);

	
	
	
	}

}
