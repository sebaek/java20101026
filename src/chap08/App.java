package chap08;

public class App {
	public static void main(String[] args) {
		Dog pet1 = new Dog();
		Pet pet2 = new Cat();
		
		play(pet1);
		play(pet2);
		
		Pet p = pet1;
		Guard g = pet1;
		
		guard(pet1);
		guard(g);
	}
	
	public static void play(Pet pet) {
		pet.sit();
	}
	
	public static void guard(Guard guard) {
		guard.stop();
	}
}
