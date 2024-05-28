package Geometry;

public class CirecleMain {

	public static void main(String[] args) {
		Circle c = new Circle(5);
		System.out.println("반지름 " + c.radius);
		System.out.println("원넓이 " + c.getArea());
	}

}
