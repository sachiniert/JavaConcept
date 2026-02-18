package OOPsConceptPart2;

public class TestBank {

	public static void main(String[] args) {
		
		System.out.println(USBank.min_bal);

		HSBCBank hs =  new HSBCBank();
		hs.credit();
		hs.debit();
		hs.transferMoney();
		hs.educationLoan();
		hs.carLoan();
		
		// Dynamic polymorphism
		// child class object can be referred by parent Interface reference var
		USBank b1 = new HSBCBank();
		b1.credit();
		b1.debit();
		b1.transferMoney();
		
		

		
	}

}
