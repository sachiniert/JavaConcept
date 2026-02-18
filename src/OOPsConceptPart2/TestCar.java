package OOPsConceptPart2;

public class TestCar {

	public static void main(String[] args) {
		// static polymorphism -- compile time polymorphism
		MBW b = new MBW();
		b.start();
		b.stop();
		b.refuel();
		b.theftSafty();
		b.engine();
		System.out.println("*************");
		
		
		Car c = new Car();
		c.start();
		c.stop();
		c.refuel();
		System.out.println("*****************");
		
		// To Casting
		Car c1 = new MBW(); // child class object can be referred by parent class reference variable --dynamic polymorphism-->RunTime Polymorphism
        c1.start();
        c1.stop();
        c1.refuel();
        
        // Down Casting
      //  MBW b1 =(MBW )new Car(); // ClassCastException
       
		
	}

}
