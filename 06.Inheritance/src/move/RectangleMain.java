package move;

public interface RectangleMain {
	public static void main(String[] args) {
		//(2,1) 위치에 있는 30 X 15의 사각형
		Rectangle r = new Rectangle(30, 15, 2, 1);
		info(r);
		
		//절대좌표이동 (4,5)로 이동하기
		r.moveTo(4, 5);
		info(r);
		
		//상대위치 (4,5)만큼 이동하기
		r.moveBy(4, 5);
		info(r);
		
		r.resize(30, 50);
		info(r);
	}
	
	static void info(Rectangle r) {
		System.out.printf("%d X %d 크기의 사각형위치: (%d, %d)", r.width,
		r.height, r.x, r.y;
	}

}
