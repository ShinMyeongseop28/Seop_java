
public class CarMain {

	public static void main(String[] args) {
		Car park = new Car();
		park.owner = "박문수";
		park.model = "K5";
		System.out.printf("차주: %s 차종: %s\n", park.owner, park.model);
		park.start();
		park.speedUp();
		System.out.println("현재 속도: " + park.speed);
		
		park.speedUp();
		System.out.println("현재 속도: " + park.speed);
		
		park.speedUp();
		System.out.println("현재 속도: " + park.speed);
	
		park.speedUp();
		System.out.println("현재 속도: " + park.speed);
	
		
		park.speedDown();
		System.out.println("현재 속도: " + park.speed);
		
		park.speedDown();
		System.out.println("현재 속도: " + park.speed);
	
		park.speedDown();
		System.out.println("현재 속도: " + park.speed);
	
		park.speedDown();
		System.out.println("현재 속도: " + park.speed);
		
		park.stop();
		
		
		Car seop = new Car();
		seop.owner = "신명섭";
		seop.model = "oudi";
		System.out.printf("차주: %s 차종: %s\n", seop.owner, seop.model);
		
		seop.start();
		//가속하기
		oudiSpeedUp(seop);
		oudiSpeedUp(seop);
		oudiSpeed(true, seop);

		//감속하기
		oudiSpeedDown(seop);
		oudiSpeedDown(seop);
		oudiSpeed(false, seop);
		seop.stop();

	}
	
	static void oudiSpeedUp(Car car) {
		car.speedUp();
		System.out.println("현재 속도: " + car.speed);		
	}
	
	static void oudiSpeedDown(Car car) {
		car.speedDown();
		System.out.println("현재 속도: " + car.speed);		
	}
	
	static void oudiSpeed(boolean up, Car car) {
		if(up) {
			car.speedUp();
		}else {
			car.speedDown();
		}
		System.out.println("현재 속도: " + car.speed);
	}

}
