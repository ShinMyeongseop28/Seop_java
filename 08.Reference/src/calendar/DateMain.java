package calendar;

import java.util.GregorianCalendar;

public class DateMain extends Object{

	public static void main(String[] args) {
		GregorianCalendar date1 = new GregorianCalendar(2024, 06 , 8);
		GregorianCalendar date2 = new GregorianCalendar(2024, 06 , 8);
		System.out.println(date1);
		if(date1 == date2) {
			System.out.println("같은 날짜");
		}else {
			System.out.println("다른 날짜");
		}
		
		//equals 메소드는 원래 주소가 같은지 판단
		//Calendar 클래스에서 Object의 equals 메소드를 오버라이딩해서
		//날짜 데이터인 경우 년월일시분초 데이터가 같다면 
		//같은 날짜로 판단하는 처리로직이 되어 있다.
		//GregorianClendar가 상속받아 갖고 있는 Calendar의 equals 메소드가 호출
		//같은 날짜로 판단됨
		if(date1.equals(date2)) {
			System.out.println("같은 날짜");
		}else {
			System.out.println("다른 날짜");
		}
	}

}
