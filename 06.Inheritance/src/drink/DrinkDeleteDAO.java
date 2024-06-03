package drink;

import java.util.Scanner;

public class DrinkDeleteDAO extends DrinkManage implements DrinkDAO {
	
	DrinkDeleteDAO(DrinkDTO[] drinks, Scanner scan){
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

	}

	@Override
	public void delete() {
		System.out.println("삭제할 음료를 골라주세요.");
		int num1 = scan.nextInt();
		System.out.println("이름 정보를 삭제하시겠습니까? 1)예 2)아니오");
		int no1 = scan.nextInt();
		if(no1==1) {
			System.out.println("이름 정보를 삭제합니다.");
			drinks[num1-1].name = null;
		}

		System.out.println("가격 정보를 삭제하시겠습니까? 1)예 2)아니오");
		int no2 = scan.nextInt();
		if(no2==1) {
			System.out.println("가격 정보를 삭제합니다.");
			drinks[num1-1].price = 0;
		}
		
		System.out.println("수량 정보를 삭제하시겠습니까? 1)예 2)아니오");
		int no3 = scan.nextInt();
		if(no3==1) {
			System.out.println("수량 정보를 삭제합니다.");
			drinks[num1-1].quantity = 0;
		}
		
	}
	@Override
	public void search() {}

}
