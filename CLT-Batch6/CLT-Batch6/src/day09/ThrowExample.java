package day09;

class User extends Throwable{
	public User(String ref) {
		System.out.println(ref);
	}
	
	static void validateAge (int age) {
		if (age<18) {
			User refUser = new User("Age can't be less than 19.");
		try {
			throw refUser;
		}
		 catch (User e) {
			 //System.out.println("Age can't be less than 19.");
			 System.out.println("Exception caught..");
		}
		finally {
			System.out.println("");
		}
	  }
    }
}


public class ThrowExample {

	public static void main(String[] args) {
		
		User.validateAge(10);
	}

}
