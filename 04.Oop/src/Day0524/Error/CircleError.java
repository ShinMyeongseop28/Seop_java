package Day0524.Error;

public class CircleError {
//	접근제한자(접근제어자):  public, protected, default, private
//	private: 클래스내에서는 접근 가능
	
	private int radius;
	CircleError(int radius) throws Exception{
		if(radius < 0) {
			throw new Exception("음수값은 출력할 수 없습니다.");
		}
		this.radius = radius;
	}
	
	//반지름을 담는 메소드: setRadius() - setter메소드
	//반지름을 알려주는 메소드: getRaius() - getter메소드
	int getRadius() {
		return radius;
	}
	
	//원넓이를 구한다. 원둘레를 구한다.
	double calculateArea() {
		//3.14 * 반지름 *반지름
		double area =3.14 * radius * radius;
		return area;
	}
	
	double calculateAround() {
		//2 * 3.14 * 반지름
		double around = 2 * 3.14 * radius;
		return around;
	}
}
