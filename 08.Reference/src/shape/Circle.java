package shape;

public class Circle {
	int radius;
	
	Circle(int radius){
		this.radius = radius;
	}

	@Override
	public boolean equals(Object obj) {
		//반지름이 같다면 같은 원이라고 하자
		//Object가 원인지 확인
		if(obj instanceof Circle ) {
			// downCasting
			Circle c = (Circle)obj;
			if(this.radius == c.radius) {
				return true;
			}else {
				return false;
			}
		}else {
			return false;
		}
	}

}
