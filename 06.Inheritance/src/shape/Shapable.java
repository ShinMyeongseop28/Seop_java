package shape;

public class Shapable {
	// 각 도형의 기능: 넓이를 구한다. 둘레를 구한다 -> 추상
	// 상속받을 클래스(원/삼각형/사각형)의 종류에 따라 넓이
	double getArea();
	double getAround();

}
