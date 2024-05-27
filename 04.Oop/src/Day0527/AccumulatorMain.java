package Day0527;

public class AccumulatorMain {

	public static void main(String[] args) {
		System.out.println(Accumulator.getGTotal());
		
		System.out.println(Accumulator.gTotal);
		
		Accumulator a1 = new Accumulator();
		
		Accumulator a2 = new Accumulator();
		
		a1.accumulate(10);
		System.out.println("a1: total " + a1.total);
		System.out.println("a1: gTotal " + a1.gTotal);
		
		a2.accumulate(20);
		System.out.println("a2: total " + a2.total);
		System.out.println("a2: gTotal " + a2.gTotal);
		
		System.out.println("static gTotal " + Accumulator.gTotal);
		
		System.out.println("총 누적: " + Accumulator.getGTotal());
		//객체는 객체의 구성요소에 접근
		System.out.println("a1 누적: " + a1.total);
		System.out.println("a2 누적: " + a2.total);
		//객체는 동일한 클래스로 존재하는 static 요소에의 접근 가능
		System.out.println("a1 총 누적: " + a1.gTotal);
		System.out.println("a2 총 누적: " + a2.gTotal);
		
	}

}
