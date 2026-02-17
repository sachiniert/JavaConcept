package JavaBasics;

public class LoopsConcept3 {

	public static void main(String[] args) {
	 // 1. while loop:disadvantage of while loop : it will generate infinte loop if you don't give incremental/decremental part
		
		int i = 1;
		while(i <= 10) {// condition
			System.out.println(i);
			i = i + 1; // incremental/decremental
		}
		
		System.out.println("**************************");
		
	// 2. for loop
		// print 1 to 10
		for(int j=1; j<=10; j++) { // Initialization; Condition; Incremental/decremental
			System.out.println(j);
			
		}
		
		System.out.println("############");
		// print 10 to 1
		
		for(int k =10; k>=1; k--) {
			System.out.println(k);
		}
		// print 10 to -10
		
		for(int l=10; l>=-10; l--) {
			System.out.println(l);
		}
		
		
		
		
		

		
	}

}
