package OOPsConceptPart1;

public class StaticAndNonStaticConcept {
	
	String name ="Tom"; // non static global var
	static int age = 25; // static global var
	

	public static void main(String[] args) {
		
		// How to call static methods and vars ?
		//1. direct calling
		sum();
		
		//2. calling by classname
		StaticAndNonStaticConcept.sum();
		
		System.out.println(age);
		System.out.println(StaticAndNonStaticConcept.age);
		

	}
	
	public void sendMail() { // non static method
		System.out.println("send mail method");
	}
	
	public static void sum() { // static method
	System.out.println("Sum method");
	}

}
