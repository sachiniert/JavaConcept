package JavaBasics;
import java.util.ArrayList;

public class ArrayListConcept {

	public static void main(String[] args) {
		
		ArrayList ar = new ArrayList();
		ar.add(100); // index 0
		ar.add(200); //1
		ar.add(300);//2
		System.out.println(ar.size());
		
		ar.add(400);//3
		ar.add(500);//4
		System.out.println(ar.size());
		
		ar.add("tom");//5
		ar.add("Hello");//6
		ar.add(2.33);//7
		ar.add('M');//8
		ar.add(600); 
		System.out.println(ar.size());
		ar.remove(9);
		
		System.out.println(ar.size());
		System.out.println(ar.get(4));
		// System.out.println(ar.get(9)); // OutOfBondException
         
		// to print all the value of arralist: for loop using
		
		for(int i=0; i<ar.size(); i++) {
			System.out.println(ar.get(i));
		}
		
		ArrayList<Integer> ar1 = new ArrayList<Integer>();
		ar1.add(100);
		//ar1.add('M'); allow only interger value
		
		ArrayList<String> ar2 = new ArrayList<String>();
		ar2.add("Tom");
		//ar2.add(100); allow only string
	}

}
