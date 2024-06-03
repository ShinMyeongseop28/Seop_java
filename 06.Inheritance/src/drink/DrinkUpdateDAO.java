package drink;

import java.util.Scanner;

public class DrinkUpdateDAO extends DrinkManage implements DrinkDAO {
	
	DrinkUpdateDAO(DrinkDTO[] drinks, Scanner scan){
		super(drinks, scan);
	}

	@Override
	public void insert() {

	}

	@Override
	public void list() {

	}

	@Override
	public void info() {

	}

	@Override
	public void update() {
		System.out.println("변경하실 음료의 번호를 입력하세요.");
		int num1 = scan.nextInt();
		System.out.println("음료의 이름을 변경하시겠습니까? 예:1 아니오:2");
		int no1 = scan.nextInt();
		scan.nextLine();
		if(no1 == 1) {
			System.out.println("변경하실 이름을 입력해주세요.");
			String name = scan.nextLine();
			drinks[num1-1].name = name;
		}
		
		System.out.println("음료의 가격을 변경하시겠습니까? 예:1 아니오:2");
		int no2 = scan.nextInt();
		if(no2 == 1) {
			System.out.println("변경하실 가격을 입력해주세요.");
			int price = scan.nextInt();
			drinks[num1-1].price = price;
		}
		
		System.out.println("음료의 수량을 변경하시겠습니까? 예:1 아니오:2");
		int no3 = scan.nextInt();
		if(no3 == 1) {
			System.out.println("변경하실 수량을 입력해주세요.");
			int quantity = scan.nextInt();
			drinks[num1-1].quantity = quantity;
		}
		
		System.out.println("변경 처리가 완료되었습니다.");
	}

	@Override
	public void delete() {

	}
	
	@Override
	public void search() {}

}
