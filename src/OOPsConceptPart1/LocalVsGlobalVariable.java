package OOPsConceptPart1;

public class LocalVsGlobalVariable {
    // Global vars -- class variable
	String name = "Tom";
	int age = 25;

	public static void main(String[] args) {
		

		int i = 10; // Local variable 
		System.out.println(i);
		
	}

	public void sum() {
		int i = 10;
		int j = 20;
		int age = 25;
	}
}
