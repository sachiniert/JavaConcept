package OOPsConceptPart2;

public class MBW extends Car{// has a reletionship
	
	//when same methods is present in parent class as well as in child class with the same name and same number of arguments, is called "Method Overriding".
	public void start() {// overriden method
		System.out.println("BMW--start");
	}
	
	public void theftSafty() {
		System.out.println("BMW-- theftSaety");
	}

}
