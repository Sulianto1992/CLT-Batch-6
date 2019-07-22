package day02;

public class MethodOverLoadingExample {

	public static void main(String []args) { //Step 1
		System.out.println("class loader loads this main...");
		main(20); //Step 2
		System.out.println("final step"); //step 8
		
	}// end of main
	
	public static void main(int number) { //step 3
		main("data");//step 4
		System.out.println(number);//step7
	}// end of main
	
	public static void main(String references) {//step5
		System.out.println(references);//step 6
	}// end of main
}// end of MethodOverloadingExample class
