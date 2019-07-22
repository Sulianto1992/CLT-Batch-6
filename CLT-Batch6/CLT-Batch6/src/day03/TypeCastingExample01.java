package day03;

class Parent{
	
}

class Child extends Parent{
	
}

public class TypeCastingExample01 {

	//Implicit and Explicit Casting
	int num1 = 10;
	long num2 = num1;// implicit casting, JVM does it
	
	long num3 = 500;
	int num4 =(int)num3; // we need to add cast, explicit casting
	
	//Up Casting and Down Casting
	String ref1 = "Java";
	//Object is a super class (root class) of all the classes in java
	Object ref2 = ref1;
	
	Parent refParent = new Child();//Up Casting ==>
	
	Object ref3 = "Python";
	String ref4 = (String)ref3;// we need to add cast, Down Casting
	
	//Autoboxing and Unboxing
	
	
	
	public static void main(String[] args) {
		
		
		
		
		
		
	}

}
