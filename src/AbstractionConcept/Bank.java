package AbstractionConcept;

public abstract class Bank {
	
	// partial abstraction
	// hiding the implementation logic -- is called Abstraction
	
	public abstract void loan(); // abstract method -- no method body
	
	public void credit() {
		
		System.out.println("Bank-- Credit");
	}
	
	public void debit() {
		System.out.println("Bank --debit");
	}

}
