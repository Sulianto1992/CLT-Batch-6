package day04;

 class Parent{
	
}

class Child extends Parent{
	
}



abstract class Visa{//abstract class will behave like parent class
	
	//static abstract void login() you declare static or private and final as a abstract class
	
	abstract void login();//abstract method, without a body, ends with a semicolon
	
	// iff we declare any abstract method in a abstract class we must define in its sub class
	
	void logout() {
		//method with a body
	}//end of logout
	
} // end of visa

class HSBC extends Visa{ // HSBC ==> child class
	
	void login() {
		
	}
	
}

public class AbstractClassExample01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		
	}

}
