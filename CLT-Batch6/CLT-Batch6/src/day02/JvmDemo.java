package day02;
class MyClass{
	int number = 20;
	String reference = "data";
	
	void displayNumber() {
		System.out.println(number);
	}
	
}
public class JvmDemo {
	
	public static void main(String []args ) { //entry point of the execution
		MyClass refMyClass = new MyClass();
		refMyClass.displayNumber();
		System.out.println(refMyClass.reference);
		refMyClass=null; // we are doing garbage collection by freeing memory
		
	}

}
