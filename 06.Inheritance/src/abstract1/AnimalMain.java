package abstract1;

public class AnimalMain {

	public static void main(String[] args) {
//		Animal a = new Animal("동물");
		Dog dog = new Dog("진돗개");
//		dog.sound();
		sound(dog);
		
		Cat cat = new Cat("코숏");
//		cat.sound();
		sound(cat);
		
		Chicken chicken = new Chicken("금계");
//		chicken.sound();
		sound(chicken);
		
		Animal dog2 = new Dog("시츄");
//		dog2.sound();
		sound(dog2);
		
		Animal cat2 = new Cat("러시안블루");
//		cat2.sound();
		sound(cat2);
	}
	
	static void sound(Animal animal) {
		animal.sound();
	}

}
