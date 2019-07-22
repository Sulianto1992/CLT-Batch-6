package day05;
class A{
	B refB;// class A has a reference of class B
//	void getData() {
//		refB.show();
//	}
	//setter method
//	public void setRefB(B refB) {
//		this.refB = refB;
//	}
	public A(B refB) {
		this.refB = refB;
	}
	
	public B getRefB() {
	return refB;
	}
	
	
}

class B{
	C refC;
	
	// setter
	//public void setRefC(C refC) {
	//this.refC = refC;
	//}
//	
//	void show(){
//		System.out.println("I am in class B.. ");
//	}
	
	public B(C refC) {
		this.refC = refC;
	}

	public C getRefC() {
		return refC;
	}
}

class C{
	String name;
//
//	public String getName() {
//		return name;
//	}
//
//	public void setName(String name) {
//		this.name = name;
//	}
	
	C (String name){
		this.name = name;
	}// end of constructor
	
	public String getName() {
		return name;
	}
	
	
}


public class SimpleApplication {

	
	public static void main(String []args) {
		C refC = new C("Hello");
		B refB = new B(refC);
		A refA = new A(refB);
		
		
		
		
		System.out.println(refA.getRefB().getRefC().getName());
		
		
	}
	
}
