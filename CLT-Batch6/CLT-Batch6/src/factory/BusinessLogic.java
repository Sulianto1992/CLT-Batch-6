package factory;

public class BusinessLogic {
	
	public static Bank myFactoryMethod(String reference) {
		if(reference.equals("dbs")) {
			return new DBSBank(); // implemented class
		} else if (reference.equals("citi")) {
			return new CitiBank(); // implemented class
		}
		
		else 
			return new OtherBank();// implemented class
		
	}// end of myFactoryMethod

}// end of BusinessLogic
