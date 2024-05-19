
public class MethodEx04 {
	//어떤 수가 3의 배수인지 아닌지 판단하여 출력할 메소드 선언하고 호출하기
	//출력문은 main 메소드에서
	static String multiply(int no) {
		String result;
		if(no % 3 == 0) {
			//System.out.println("3의 배수입니다.");
			result = "3의 배수입니다.";
		} else {
			//System.out.println("3의 배수가 아닙니다.");
			result = "3의 배수가 아닙니다.";
		}
		return result;
	}
	static int multiply2(int no) {
		int mod = no % 3;
		return mod;
	}
	static boolean multiply3(int no) {
		boolean tf;
		if(no % 3 == 0) {
			tf=true;
		}
		else { 
			tf=false;
		}
		return tf;
	}
	

	public static void main(String[] args) {
		int no = 18;
		System.out.printf("%d은(는) %s\n", no, multiply(no));
		System.out.printf("%d의 나머지는 %d입니다.\n", no, multiply2(no));
		System.out.printf("%d은(는) %b입니다.\n", no, multiply3(no));
		
	
	}

}
