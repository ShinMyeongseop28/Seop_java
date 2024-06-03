package drink;

import java.util.Scanner;

public class DrinkListDAO extends DrinkManage implements DrinkDAO {
	
	DrinkListDAO(DrinkDTO[] drinks, Scanner scan){
		super(drinks, scan);
	}

	@Override
	public void insert() {

	}

	@Override
	public void list() {
		// ......]
		int num = 0;
		for(DrinkDTO drink : drinks) {
			if( drink == null) break;
			num++;
			System.out.println(num + " " + drink.name + " " + drink.price + " " + drink.quantity);
		}
	}

	@Override
	public void info() {

	}

	@Override
	public void update() {
		

	}

	@Override
	public void delete() {

	}
	@Override
	public void search() {}

}
