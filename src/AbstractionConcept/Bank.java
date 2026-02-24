package AbstractionConcept;

public abstract class Bank {
	
	int amt = 100;
	final int rate = 10;
	static int loanRate = 5;
	
	// partial abstraction
	// hiding the implementation logic -- is called Abstraction(OOps concept)
	// abstract class can have abstract method and non abstract method
	// can not create object of abstract class
	
	public abstract void loan(); // abstract method -- no method body
	
	// below two are called non abstract methods
	public void credit() {
		
		System.out.println("Bank-- Credit");
	}
	
	public void debit() {
		System.out.println("Bank --debit");
	}

}
