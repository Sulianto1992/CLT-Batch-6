package day01;

class User {
	
}

class Userlogic{
	
}

 class UserApplication{
	 public static void main(String[] args) {
		 System.out.println("hello");
	 }
	 
	
}
 
 class StaticDemo{
	 static int number = 10;
	 int number2 = 30;
 }

public class Example02 {
	public static void main(String []args) {
		System.out.println("hi");
		UserApplication.main(null);
		System.out.println(StaticDemo.number); // classname.variable since variable is static
		
		//to call non-static variable we must create object of the class StaticDemo
		StaticDemo sd = new StaticDemo();
		System.out.println(sd.number2);
		
	}
	
}

