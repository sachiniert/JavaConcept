package OOPsConceptPart1;

public class MethodOverLOading {

	public static void main(String[] args) {
		
		MethodOverLOading obj = new MethodOverLOading();
		obj.sum();
		obj.sum(10);
		obj.sum(10,5);

	}
	public void sum() { // input parameter
		System.out.println("Sum method - zero parameter");
	}
	
	public void sum(int i) { // 1 input parameter
		System.out.println("Sum method --1 input parameter");
		System.out.println(i);
	}
	public void sum(int k, int l) { // 2 input parameter
		System.out.println("Sum method ---2 input parameter");
		System.out.println(k+l);
	}

}
