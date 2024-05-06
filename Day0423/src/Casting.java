
public class Casting {
	public static void main(String[] args) {
		//정수 타입: byte(8bit) < short(2byte) < int(기본:4byte) < long(8byte)
		//byte의 범위: 2^10 = 1024 -> 256(-128~127)
		byte no1 = 127;
		System.out.println( "no1: " + no1 );
		
		//no1: 127, no2: 127
		//자동형변환 발생
		int no2 = no1; // byte 127 -> int 127
		System.out.println( "no2: " + no2 );
		
		//no2: 127, no1: 127
		//강제형변환 하기
		no1 = (byte)no2; // int 127 -> byte 127
		System.out.println( "no1: " + no1 );
		
		//no1: 127, no2: 128
		no2 = no1 + 1; // byte 127 + 1 -> int 128
		System.out.println( "no2: " + no2 );
		
		//no2: 128, no1: -128
		//강제형변환 하기 -> 데이터손실 발생함
		no1 = (byte)no2; //int 128 -> byte 128은 표현범위를 벗어남
		//byte 범위에서의 127 다음 데이터는 -128
		System.out.println( "no1: " + no1 );
		
	}

}
