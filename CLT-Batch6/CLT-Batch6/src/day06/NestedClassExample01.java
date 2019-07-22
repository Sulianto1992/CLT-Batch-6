package day06;
//nested (inner) class

//a. non-static inner  class
//b. static inner class
//c. method local inner class
//d. anonymous inner class

//example of non-static inner class , static and method local inner  class



class JpMorgan{
	
	void adminAccess() {
		
		class AdminJPMC{
			void display(){
			System.out.println("hello i am in Admin...");
			}//end of display
		}// end of AdminJPMC
		//create object of AdminJPMC
		AdminJPMC refAdminJPMC = new AdminJPMC();
		refAdminJPMC.display();
			
		}//end of AdminJPMC
	
	
	

static void adminAccess2() {
		
		class FinanceJPMC{
			void display(){
			System.out.println("hello i am in Finance...");
			
			}//end of display
			
		}//end of FinanceJPMC
		
		//create object of FinanceJPMC
		FinanceJPMC refFinanceJPMC = new FinanceJPMC();
		refFinanceJPMC.display();
		
	}//end of adminAccess2
	
}//end of JpMorgan

public class NestedClassExample01 {
	
	public static void main(String []args) {
		//how to display method and get the output?
		JpMorgan.adminAccess2();
		
		JpMorgan ref = new JpMorgan();
		ref.adminAccess();
		
		
	}

}
