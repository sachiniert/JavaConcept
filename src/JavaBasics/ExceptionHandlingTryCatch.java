package JavaBasics;

public class ExceptionHandlingTryCatch {
//	int a = 10;
//	static ExceptionHandlingConcept obj;

	public static void main(String[] args) {
	
		/* 
		 * un caught exception
		    i = 9/0;
		System.out.println(i);
		*/
		
		/* caught exception
		Thread.sleep(2000);*/
		
		// try - catch block	
		try 
		{
			int i = 9/0;// this code will throw on exception
		}
		catch(ArithmeticException e) // Throwable is parent of all error and exception
		{
			e.printStackTrace();
			System.out.println(e.getMessage());
			System.out.println("Hey -- this / by zero error");
			
		}
		System.out.println("ABC");
		System.out.println("ABC");
		System.out.println("ABC");
		System.out.println("ABC");
	}

}
