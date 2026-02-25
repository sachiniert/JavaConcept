package ProgrammingQuestion;

public class PalindromeNumber {
	
	// 151  454   34543  78987 :  Palindrome number
	
	
	public static void inPalindromeNumber( int num) {
		System.out.println("Given numver is :"+ num);
		int r = 0;
		int sum = 0;
		int t ;
		
		t = num;
		
		while(num > 0) {
			r = num % 10; // get the remainder
			sum = (sum*10) + r;
			num = num/10;
		}
		
		if(t==sum) {
			System.out.println("Palindrome Number");
		}else {
			
			System.out.println("Not Palindrome");
		}
		
	}
	public static void main(String[] args) {
		
		inPalindromeNumber(151);
		inPalindromeNumber(152);

	}

}
