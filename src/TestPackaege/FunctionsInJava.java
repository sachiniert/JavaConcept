package TestPackaege;

public class FunctionsInJava {

	public static void main(String[] args) {
		// create object of class:
		FunctionsInJava obj = new FunctionsInJava();
		obj.test();
		int d = obj.sum();
		System.out.println(d);
		
	    String s1 = obj.PQR();
	    System.out.println(s1);
	    
	   int d2 =  obj.div(30, 10);
	    System.out.println(d2);
	    
	   int d3 =  obj.div(50, 5);
	   System.out.println(d3);

	}
	// 1 . no input and no output function:
	// void -- means does not return any value
	public void test() 
	{
		System.out.println("test method");
	}
	// 2. no input but some output
	// return type -- int
	public int sum() {
		System.out.println("Sum method");
		int a = 10;
		int b = 20;
		int c = a + b;
		return c;
	}
	// return type -- String
	public String PQR() {
		System.out.println("PQR Method");
		String s = "selenium";
		return s;
	}
	// some input some output
	public int div(int x, int y) {
		System.out.println("DIV method");
		int z = x/y;
		return z;
	}
	
	public String sendMail(int p, String q) {
		System.out.println("send mail method");
		String h = q+p;
		return h;
		
		
	}

}
