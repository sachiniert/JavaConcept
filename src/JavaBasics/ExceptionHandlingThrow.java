package JavaBasics;

public class ExceptionHandlingThrow {

	public static void main(String[] args) {
		System.out.println("ABC");
		
		try {
		throw new Exception("Sachin Eception");
		}catch (Exception e)
		{
			e.printStackTrace();
		}

		System.out.println("PQR");
		
		String Exec_Flag =" ";
		if(Exec_Flag.equals(" ")) {
			try {
			throw new Exception("Exce flag is Blank Exception");
		
		}catch(Exception e) {
			
			e.printStackTrace();
		}
		}
		System.out.println("Test");

	}

}
