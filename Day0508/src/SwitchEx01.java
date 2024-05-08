
public class SwitchEx01 {

	public static void main(String[] args) {
		//홀수인지 짝수인지 판단하기
		int no = 2;
		switch(no % 2) {
		case 0: //if(no % 2 == 0) {}
			System.out.println(no +": 짝수");
			break;
		case 1: //if(no % 2 == 0) {}
			System.out.println(no +": 홀수");
			break;
		}
		
		switch(no % 2) {
		case 1: //if(no % 2 == 0) {}
			System.out.println(no +": 홀수");
			break;
		default: //if(no % 2 == 0) {}
			System.out.println(no +": 짝수");
			break;
		}
	}

}
