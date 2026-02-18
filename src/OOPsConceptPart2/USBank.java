package OOPsConceptPart2;

public interface USBank {
	
	int min_bal =100;
	
	public void credit();
	
	public void debit();
	
	public void transferMoney();

	// properties.
	// only method declaration
	// no method body -- only method prototype
	// in Interface, we can declare the variable, vars are by default static in nature
	// vars value will not be changed
	// no static method in Interface
	// no main method in Interface
	// we can not create the object of Interface
	// Interface is abstract in nature
}
