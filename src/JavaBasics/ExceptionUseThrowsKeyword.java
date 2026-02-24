package JavaBasics;

public class ExceptionUseThrowsKeyword {

	public static void main(String[] args) {
		ExceptionUseThrowsKeyword obj = new ExceptionUseThrowsKeyword();
		obj.sum();
		System.out.println("ABC");
		

	}
	public void sum() {
		try {
		div();
		}catch(ArithmeticException e) {
			
			
		}
	}
	
	public void div() throws ArithmeticException {
		
		int i = 9/0; // exception line
	}

}
