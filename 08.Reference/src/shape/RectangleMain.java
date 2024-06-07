package shape;

public class RectangleMain {

	public static void main(String[] args) {
		Rectangle r1 = new Rectangle(5, 10);
		Rectangle r2 = new Rectangle(5, 10);
		Rectangle r3 = new Rectangle(10, 5);
		Rectangle r4 = new Rectangle(20, 10);
		Circle c1 = new Circle(10);
		
		if(r1.equals(r4)) {
			System.out.println("같은 사각형");
		}else {
			System.out.println("다른 사각형");
		}
		
		
	}

}
