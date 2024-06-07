package shape;

public class Rectangle {
	int width, height;
	
	Rectangle(int width, int height) {
		this.width = width;
		this.height = height;
	}
	
	@Override
	public boolean equals(Object obj) {
		// 사각형의 너비와 높이가 같으면 같은 사각형이라고 하자
		if(obj instanceof Rectangle) {
			// Object --> Rectangle :
			Rectangle r = (Rectangle)obj;
			if(this.width == r.width && this.height == r.height) {
				return true;
			}else if(this.width == r.height && this.height == r.width) {
				return true;
			}else {
				return false;
			}
		}
		return false;
	}
	
	
}
