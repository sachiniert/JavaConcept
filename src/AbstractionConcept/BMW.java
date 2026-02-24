package AbstractionConcept;

public class BMW implements Car {

	public static void main(String[] args) {
		

	}

	@Override
	public void start() {
		System.out.println("BMW--start");
		
	}

	@Override
	public void stop() {
		System.out.println("BMW--stop");
		
	}

	@Override
	public void refuel() {
		System.out.println("BMW--refule");
		
	}
	// non overridden methods:
	public void theftSafety() {
		System.out.println("BMW--thftsafty");
	}

}
