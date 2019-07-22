package day02;
class Mobile{// class name should always be Noun
	int price = 500;
	//JVM creates a default constructor of Mobile class
	// constructor name and class name must be same
	//constructor doesn't have any return type, not even void
	Mobile(){
		System.out.println(price);
	}// end of Mobile constructor
	
	//Difference of method and constructor 
	//verb / action ==> method
	//method always has some return type or void(no return type)
	
}// end of Mobile class

public class ConstructorExample {
	public static void main(String []args) {
		new Mobile();//once we create object of Mobile class
	
	}
}
