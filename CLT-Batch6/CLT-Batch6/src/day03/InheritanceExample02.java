package day03;

 class Bank{
	 Bank(String location){
		 System.out.println("I am in default constructor ==> Bank " +location);
	 }
 }// end of bank
 
 class DigitalBank extends Bank{

	public DigitalBank(String location,int code) {
		super(location);// we must use super keyword to call parent class constructor
		System.out.println("Code : "+code); //1234
		//either we can print location here or we can call parent class constructor
		
		// TODO Auto-generated constructor stub
	}
	 
	 
	
 }// end of digital bank
 
 class ChildClassOfDigitalBank extends DigitalBank{

	public ChildClassOfDigitalBank(String location, int code,boolean queue) {
		super(location, code);
		if(queue) {
			System.out.println("Queue status : crowded");
		} else {
			System.out.println("Queue status: not crowded");
		}
		// TODO Auto-generated constructor stub
	}
	 
}

  
public class InheritanceExample02 {
	
	public static void main(String []args) {
		new DigitalBank("Digibank",1234);// it will call line no 12
		System.out.println();
		new ChildClassOfDigitalBank("DBS",5123,false);
		System.out.println();
		new ChildClassOfDigitalBank("OCBC",8747,true);
		
	}
	
	
	

}
