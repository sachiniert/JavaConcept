package JavaBasics;

public class ConstructorWithThisKeyword {
	// class variable-- this keyword is initialize 
	String name;
	int age;
	
	public ConstructorWithThisKeyword(String name, int age){
		this.name = name;// this.global_variable = local_variable
		this.age = age;
		System.out.println(name);
		System.out.println(age);
		
	}

	public static void main(String[] args) {
		ConstructorWithThisKeyword obj  = new ConstructorWithThisKeyword("Tom",30);
		

	}

}
