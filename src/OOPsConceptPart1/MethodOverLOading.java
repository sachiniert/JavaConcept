package OOPsConceptPart1;

public class MethodOverLOading {

	public static void main(String[] args) {
		
		MethodOverLOading obj = new MethodOverLOading();
		obj.sum();
		obj.sum(10);
		obj.sum(10,5);

	}
	
	public static void main(int p) {
		
	}
public static void main(int p,int q) {
		
	}
   //we can overload main method also
	// you can not create a method inside a method 
	//duplicate methods--i.e same method name with same number of arguments are not all0owed
	
	//method overloading -- when the method name is same with different argument or input parameters within the same class
	public void sum() { // input parameter
		System.out.println("Sum method - zero parameter");
	}
	public void sum(double d) {
		
	}
	
	
	public void sum(int i) { // 1 input parameter
		System.out.println("Sum method --1 input parameter");
		System.out.println(i);
	}
	public void sum(int k, int l) { // 2 input parameter
		System.out.println("Sum method ---2 input parameter");
		System.out.println(k+l);
	}

}
