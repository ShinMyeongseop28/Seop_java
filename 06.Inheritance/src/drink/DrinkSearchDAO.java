package drink;

import java.util.Scanner;

public class DrinkSearchDAO extends DrinkManage implements DrinkDAO {
	
	DrinkSearchDAO(DrinkDTO[] drinks, Scanner scan){
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
	public void search() {
		//......
		System.out.println("검색한 음료정보출력....");
	}

	@Override
	public void update() {

	}

	@Override
	public void delete() {

	}

}
