package chap07.exercise07;

public class SnowTireExample {
	public static void main(String[] args) {
		SnowTire snowTire = new SnowTire();
		Tire tire = snowTire;
		
		snowTire.run();
		tire.run();
		
		tire = snowTire;
		
		if (tire instanceof SnowTire) {
			snowTire = (SnowTire) tire;
		}
		
		System.out.println(tire instanceof SnowTire);
		System.out.println(snowTire instanceof Tire);
		
	}
}
