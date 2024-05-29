package abstract1;

public class PersonMain {
	public static void main(String[] args) {
		
		Person p = new Person();
		p.name = "나그네";
		p.age = 18;
		p.eat();
		p.sleep();
		System.out.println("----------");
		
		Student hong = new Student();
		hong.name = "홍길동";
		hong.age = 15;
		hong.studentNo = "240501";
		hong.eat();
		hong.go();
		hong.sleep();
		System.out.println("----------");
		
		Worker sim = new Worker();
		sim.name = "심청";
		sim.age = 30;
		sim.WorkerNo = "201002";
		sim.eat();
		sim.go();
		sim.sleep();
		System.out.println("-----------");
	}

}
