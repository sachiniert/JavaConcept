package OOPsConceptPart2;

public class HSBCBank implements USBank, BrazilBank {// we are achieving multiple inheritance
	// is a relationship
	
	//if a class is implemented any interface , then its mandatory to define/override all the methods of Interface
	// overriding from USBank
	public void credit() {
		System.out.println("hsbc--credit");
	}
	
	public void debit() {
		System.out.println("hsbc-- debit");
	}
	
	public void transferMoney() {
		System.out.println("hsbc--transferMoney");
	}

	// seperate methods of HABank class
	public void educationLoan() {
		System.out.println("hsbc--edu loan");
	}
	
	public void carLoan() {
		System.out.println("hsbc--Car--loan");
	}
	
	// brazill bank method define here
	public void mutualFund() {
		System.out.println("hsbc--mutual fund");
	}
	
}
