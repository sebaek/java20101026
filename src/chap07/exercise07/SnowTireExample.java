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
		
//		SnowTire s = (SnowTire) new Tire();
		
//		method((SnowTire) new Tire());
		
		method(snowTire);
	}
	
//	public static void method(SnowTire s) {
//		s.run();
//	}
	
	public static void method(Tire t) {
		t.run();
	}
}











