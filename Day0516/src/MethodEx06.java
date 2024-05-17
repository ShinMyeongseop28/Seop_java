
public class MethodEx06 {
	
	//첫번째 수부터 두번째 수까지의 모든 정수를 출력하는 처리
	static void between2(int no1, int no2) {
		//no1: 5, no2: 1
		
		//no1: 1, no2: 5
		//no1 > no2인 경우 두 데이터를 바꾼다
		if(no1>no2) {
			int no3 = no1;
			no1 = no2;
			no2 = no3;			
		}
		for(int no=no1; no<=no2; no++) {
			System.out.print(no + " ");
		}
		System.out.println();
	}
	
	static void between(int no1, int no2) {
		if (no1 > no2) {
			//no1: 5, no2: 1
			for(int no=no1; no>=no2; no--) {
				System.out.print(no + " ");
			}
		}else {
			//no1:1, no2: 5
			for(int no=no1; no<=no2; no++) {
				System.out.print(no + " ");
			}
		}
		System.out.println();			
	}
	
	public static void main(String[] args) {
		
		between2(5, 1);
		between2(1, 5);
		System.out.println("^^^^^^^^^");
		
		// 1 ~ 5까지의 수 출력하기
		between(5, 1);
				
		// 1 ~ 5까지의 수 출력하기
		between(1, 5);
		System.out.println("---------");

		// 10 ~ 25까지의 수 출력하기
		between(10, 25);
		
		// 5 ~ 9까지의 수 출력하기
		between(5, 9);
	}

}
