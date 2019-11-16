package chap08;

public class App {
	public static void main(String[] args) {
		Pet pet1 = new Dog();
		Pet pet2 = new Cat();
		
		play(pet1);
		play(pet2);
	}
	
	public static void play(Pet pet) {
		pet.sit();
	}
}
