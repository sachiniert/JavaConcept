package JavaBasics;

public class FinallyConcept {

	public static void main(String[] args) {
	//test1();
	//test2();
		division();

	}
	public static void test1() {
		try {
			System.out.println("inside test1 method");
			throw new RuntimeException("test");
		}catch(Exception e) {
			System.out.println("inside catch block");
		}
		finally {
			System.out.println("inside finally block");
		}		
	}
	public static void test2() {
		try {
			System.out.println("inside test2");
		}finally {
			System.out.println("finally code in test2 method");
		}
	}
	//
	
	public static void division() {
		int i = 10;
		try {
			System.out.println("inside try block");
			int k = i/0; 
		}
		catch(ArithmeticException e) {// use NullPointerException 
			System.out.println("Inside catch block");
			System.out.println("division by zero error");
		}
		finally {// finally always call 
			System.out.println("execute this code after any exception");
		}
		
	}

	

}
