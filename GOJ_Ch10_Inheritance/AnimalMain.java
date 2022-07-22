package GOJ_Ch10_Inheritance;

public class AnimalMain {

	public static void main(String[] args) {
		Animal animal1 = new Animal();
		Animal animal2 = new Dog();
		Animal animal3 = new Cat();
		animal1.sound();
		animal2.sound();
		animal3.sound();
		System.out.println(animal2.legCount);
		System.out.println(animal3 instanceof Cat);
		System.out.println(animal3 instanceof Animal);
	}
}
