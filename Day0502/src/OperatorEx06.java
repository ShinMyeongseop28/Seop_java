
public class OperatorEx06 {

	public static void main(String[] args) {
		//논리연산자: 논리합연산자||, 논리곱연산자&&, not연산자!
		//논리합연산자: 둘 다 False인 경우만 False
		//논리곱연산자: 둘 다 True인 경우만 True
		//not연산자: True -> False, False -> True
		int no1 = 5, no2 = 3;
		System.out.println( no1 > no2 );
		
		int no3 = 3, no4 = 5;
		System.out.println( no3 > no4 );
		
		//논리합
		System.out.println(no1 > no2 || no3 > no4);

		System.out.println(!(no1 > no2) || no3 > no4);
		
		//논리곱
		System.out.println(no1 > no2 && no3 > no4);
		
		System.out.println(no1 > no2 && !(no3 > no4));
		
		
		
		
		
		
	}

}
