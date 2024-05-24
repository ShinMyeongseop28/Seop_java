package Day0524.Error;

public class RectangleErrorMain {

	public static void main(String[] args) {
		// 가로세로 4 * 2인 사각형 만들기
		try {
			RectangleError r = new RectangleError(-4, 2);
			System.out.printf("가로%d, 세로%d인 사각형\n", r.getWidth(), r.getHeight());
			System.out.println("사각형 넓이: " + r.calculateArea());
			System.out.println("사각형 둘레: " + r.calculateAround());			
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		try {
			RectangleError r = new RectangleError(4, 2);
			rectangleInfo(r);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}

	}
	
	static void rectangleInfo(RectangleError r) {
		System.out.printf("가로%d, 세로%d인 사각형\n", r.getWidth(), r.getHeight());
		System.out.println("사각형 넓이: " + r.calculateArea());
		System.out.println("사각형 둘레: " + r.calculateAround());					
	}

}
