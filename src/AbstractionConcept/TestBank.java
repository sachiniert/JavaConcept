package AbstractionConcept;

public class TestBank {

	public static void main(String[] args) {
		
		HDFCBank hb = new HDFCBank();
		hb.credit();
		hb.debit();
		hb.loan();
		hb.funds();
		System.out.println("**********");
		
		Bank b  = new HDFCBank(); // Dynamic poly morphism
		b.loan();
		b.debit();
		b.loan();
		// b.funds(); not access because not part of bank

	}

}
