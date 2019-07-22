package day01;

class StaticNonStaticDemo{
	int variable1 =50;
	static int variable2 = 60;
	
	void showVariable() { //not static method
		System.out.println(variable1+"\n"+variable2);//no need to create object
		//call variable 1 and variable 2
	}
	
	public int returnSt () {
		return variable1;
	}
 // end of showVariable

static String reference1 = "AAAAA";
String reference2 = "BBBBB";

static void showReferences() { //static data can only access static data number directly
	//(without creating object)
	
	System.out.println(reference1);
	//reference2 can't be call directly, since it not a static
	//create an object
	System.out.println(new StaticNonStaticDemo().reference2);
	
}// end of references

}//end of StaticNonStatic

public class Example03 {
	public static void main(String []args) {
		new StaticNonStaticDemo().showVariable();
		StaticNonStaticDemo.showReferences();
		System.out.println(new StaticNonStaticDemo().returnSt());
	}// end of psvm
	
	

}// of example 03
