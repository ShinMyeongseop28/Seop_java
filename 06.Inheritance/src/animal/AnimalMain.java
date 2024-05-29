package animal;

public class AnimalMain {

	public static void main(String[] args) {
		Dog dog = new Dog();
		dog.kind = "진돗개";
		dog.eat();
		dog.run();
		dog.sleep();
		
		Bird bird = new Bird();
		bird.kind = "비둘기";
		bird.eat();
		bird.fly();
		bird.sleep();
	}

}
