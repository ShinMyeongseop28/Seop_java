package shape;

import cloth.Cloth;

public class CircleMain {

	public static void main(String[] args) {
		Circle c1 = new Circle(5);
		Circle c2 = new Circle(5);
		Circle c4 = new Circle(3);
		Cloth c3 = new Cloth();
		
		if(c1.equals(c4)) {
			System.out.println("같은 원");
		}else {
			System.out.println("다른 원");
		}
	}

}
