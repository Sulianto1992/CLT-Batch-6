package day03;

class MyGenericClass{
	void genericMethod(Object ref){
		System.out.println(ref);
	}
}// end of MyGenericClass

public class WrapperClassExample {

	public static void main(String []args) {
		
		MyGenericClass refMyGenericClass = new MyGenericClass();
		int numberVariable = 20;
		refMyGenericClass.genericMethod(numberVariable);
		Integer numberReference = numberVariable; // Autoboxing ==> int to Integer
		
		
		refMyGenericClass.genericMethod(numberReference);
		
		String reference = "Java";
		refMyGenericClass.genericMethod(reference); //passing String reference to Object
		
		Person refPerson = new Person();
		refMyGenericClass.genericMethod(refPerson); // passing Person reference to Object
		
		Long longReference = (long) 50000;
		long longVariable = longReference; //unboxing ==> Long to long
		
		
	}
	
}
