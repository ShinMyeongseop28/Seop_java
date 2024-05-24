package Day0524.Error;

public class CircleErrorMain {

	public static void main(String[] args) {
		CircleError c = null;
		// 반지름 10인 원 만들기
		int radius = -10;
		try {
			c = new CircleError(radius);
			// 원의 넓이 구하기
//		double area = c.calculateArea();
			System.out.println("원의 반지름: " + c.getRadius());
//		c.getRadius = 5; //필드에 직접 접근해 데이터를 변경하지 못하게 접근제한자
			System.out.println("원의 넓이: " + c.calculateArea());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}


	}
}
