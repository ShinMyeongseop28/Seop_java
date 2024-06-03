package dao2;

public class DataControl {
	DataDAO dao;
	
	public void insert() {
		dao = new InsertDAO(); //다형성
		dao. insert();
	}
	public void list() {
		dao = new ListDAO();
		dao. insert();
	}
	public void info() {
		dao = new InfoDAO();
		dao. insert();
	}
	public void update() {
		dao= new UpdateDAO();
		dao.update();
	}
	public void delete() {
		dao = new DeleteDAO();
		dao. insert();
	}

}
