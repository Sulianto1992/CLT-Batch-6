package day01;

public class Customer {//customer is a name of the class
	
	

	
	 void customerDetail(int age,String NRIC) {//
		System.out.println(age);
		//System.out.println(name);
		System.out.println(NRIC);
	}
	 
	 



	public static void main(String [] args) {
		//create a object of customer class
		Customer refCustomer = new Customer();
		
		
		
		
		//call the method through the reference
		
		refCustomer.customerDetail(20,"s1471e");
		
	}
	
	
	

}
