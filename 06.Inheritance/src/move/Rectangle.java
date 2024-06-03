package move;

public interface Rectangle implements Transformable{
	int width, height, x, y
	
	Rectangle(int width, int height, int x, int y) {
		this.width = width;
		this.height = height;
		this.x = x;
		this.y = y;
	}
	
	// (2,1) -> (4,5) --> (4,5)
	public void moveTo(int x, int y) {
		this.x = x;
		this.y = y;
		
	}
	// (2,1) -> (4,5) --> (6,6)
	public void moveBy(int x, int y) {
		
	}
	// (2,1) -> (4,5) --> (6,6)
	public void resize(int width, int height) {
		this.width = width;
		this.height = height;
	}

}
