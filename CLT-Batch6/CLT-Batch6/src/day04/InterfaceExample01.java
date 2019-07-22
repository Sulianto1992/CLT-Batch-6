package day04;

//interface is a fully abstract class
interface Bank{ //we use interface keyword to create an interface
	void deposit(); // method is abstract by default
	abstract void withdraw();// abstract is optional to write
	void checkBalance();
	//int code; // we can't declare like this, complication error
	final static int code = 200450;// we have to declare variable value , by default it is final and static
}//end of bank

interface UserLoginCredential{
	void userLogin();
	void userLogout();
}// end of UserLoginCrendential

//functional interface : Java 1.8 version onwards

@FunctionalInterface
	interface SingleMethod{//functional interface can't have more than one abstract method
		void method1();
	}// end of SingleMethod

//Java 1.8 new feature ==> default method in interface
interface DefaultMethod extends SingleMethod{// interface can extends another interface
	default public void myMethod() {
		System.out.println("from Java 1.8 version we can have a method with a body..");
	}
}// end of DefaultMethod


class CitiBank implements Bank,UserLoginCredential{ // Java supports multiple inheritance by using interface

	@Override
	public void userLogin() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void userLogout() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deposit() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void withdraw() {
		// TODO Auto-generated method stub
		System.out.println(Bank.code);
		
	}

	@Override
	public void checkBalance() {
		// TODO Auto-generated method stub
		
	}
	
	
}

public class InterfaceExample01 {
	public static void main (String []args) {
		System.out.println(Bank.code);
	}
}
