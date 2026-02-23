package JavaBasics;

public class Singletion {
	//In OOp, a singleton class is a class that can have only once object(instance of the class) at a time
	// How to design singleton class:
	//1. make constructor as private
	// 2. write a static method(getInstance) that has return type of object of this singleton class(lazy initialization)
	
	private static Singletion singleton_instance = null;
	public String str;
	
	private Singletion() {
		
		str = "Hey, I am using singleton class pattern";
	}
	
	public static Singletion getInstance() {
		if(singleton_instance == null) 
			singleton_instance = new Singletion();
			return singleton_instance;
		
		
	}

	public static void main(String[] args) {
		
		Singletion x = Singletion.getInstance();
		Singletion y = Singletion.getInstance();
		Singletion z = Singletion.getInstance();
		
	   x.str = (x.str).toUpperCase();
	   System.out.println(x.str);
	   System.out.println(y.str);
	   System.out.println(z.str);
	   
	   z.str = (z.str).toLowerCase();
	   System.out.println(x.str);
	   System.out.println(y.str);
	   System.out.println(z.str);

	}

}
