package day04;
//Anonymous Class
abstract class Oracle{
	abstract void driverConnection();
}//end of Oracle

abstract class Microsoft{// Microsoft and Oracle is not a Parent and Child class
	abstract void getSoftware();
}//end of Microsoft

class A{
	
}

class MyClass {

	void Display() {
		
		
			Oracle refOracle = new Oracle() {
				@Override
				void driverConnection() {
					
					System.out.println("Oracle Driver Connected");
					
				}
					
				};
			refOracle.driverConnection();
				// end of Oracle
				 
		
			Microsoft refMircosoft = new Microsoft() {
				@Override
				void getSoftware() {
					System.out.println("Microsoft Software loaded...");
				}
			};
			refMircosoft.getSoftware();
		}
	
	
		
		
		
		
		
		
	}
	
	
	//MyClass need to access driverConnection() and getSoftware()
	//how to solve this problem


public class AbstractClassExample02 {
	
	public static void main(String []args) {
		new MyClass().Display();
	}
	

}
