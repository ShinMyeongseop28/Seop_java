package move;

//위치이동 인터페이스
public interface Movable {
	// 절대위치로 이동
	void moveTo(int x, int y);
	// 성대위치로 이동
	void moveBy(int x, int y);
}
