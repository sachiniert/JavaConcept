package JavaBasics;

public class ArrayConcept4 {

	public static void main(String[] args) {
	// array : to store similar data type value in a array variable
		//1.  int array 
		// lowest bound/index =0
		// upper bound/index = n-1 ( n is size of array)
		
		//disadvantage of array 
		//1 size is fixed-- static array
		//2. store on;y similar data types-- to overcase of this problem--we use collection --ArraList,HashTable--use dynamic array
		int i[] = new int[4];
		i[0] = 10;
		i[1] = 20;
		i[2] = 30;
		i[3] = 40;
		
		System.out.println(i[2]);
		System.out.println(i[3]);
		
		// System.out.println(i[4]); ArrayIndexOutOfBoundException 
		
		System.out.println(i.length); // size length of array
		
		// print all  the value of array : use for loop concept
		System.out.println(" ****************");
		for(int j=0; j<i.length; j++) {
			System.out.println(i[j]);
		}

		// 2. double array
		
		double d[] = new double[3];
		d[0] = 12.33;
		d[1] = 12.44;
		d[2] = 45.55;
		
		System.out.println(d[2]);
		
		// 3 char array
		
		char c[] = new char[3];
		c[0] = 'q';
		c[1] = '2';
		c[2] = '$';
		
		// 4 boolean aaray 
		boolean b[] = new boolean[2];
		b[0] = true;
		b[1] = false;
		
		// 5. String Array
		String s[] = new String[3];
		s[0] = "test";
		s[1] = "Hello";
		s[2] = "World";
		
		System.out.println(s.length);
		System.out.println(s[1]);
		
		//6 object array(Object is class)
		Object ob[] = new Object[6];
		ob[0] = "Tom";
		ob[1] = 25;
		ob[2] = 12.33;
		ob[3] = "1/2/1990";
		ob[4] = 'M';
		ob[5] = "London";
		System.out.println(ob[5]);
		System.out.println(ob.length);
		
	}

}
