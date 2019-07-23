package day07;

public class StringClassExample {

	//Declare and initialize variables
	String ref1 = "Python";
	String ref2 = "Python";
	
	//Create object of the class String
	String ref3 = new String("Scala");
	String ref4 = new String("Scala");
	
	//Create object of the class Person
	Person ref5 = new Person ("Java");
	Person ref6 = new Person ("Java");
	
	
	/*
	//Display result
	void scenario1() {
		if (ref3 == ref4) {
			System.out.println("same");
		}
		else {
			System.out.println("different");
		}
	} //end of scenario1
	*/
	
	//Display result
	void scenario2() {
		if (ref5.equals(ref6)) {
			System.out.println(ref5.hashCode());
			System.out.println(ref6.hashCode());
			System.out.println("same");
		}
		else {
			System.out.println(ref5.hashCode());
			System.out.println(ref6.hashCode());
			System.out.println("different");
		}
	} //end of scenario2
	
	
	public static void main(String[] args) {
		
		//Create object of StringClassExample
		StringClassExample refStringClassExample = new StringClassExample();
		
		//Invoke methods
		//refStringClassExample.scenario1();
		refStringClassExample.scenario2();

	} //end of main

} //end of class
