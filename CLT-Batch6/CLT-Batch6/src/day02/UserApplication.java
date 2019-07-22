package day02;
//example of encapsulation
//hibernate/ JPA(Java Persistance API) ==> application area of POJO class
//this user class also known as ==> POJO class/ entity class

import java.util.Scanner;

public class UserApplication {

	public static void main(String []args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter ID : ");
		String userID = sc.next(); // take data from console and store to userID
		
		System.out.println("Enter Password : ");
		String userPassword = sc.next(); // take data from console and store to userPassword
		
		System.out.println("Enter age : ");
		int userAge = sc.nextInt(); // take data from console and store to userAge
		
		User refUser = new User();
		
		refUser.setUserID(userID);
		refUser.setUserPassword(userPassword);
		refUser.setAge(userAge);
		
		//call the getter methods
		
		System.out.println(refUser.getUserID()+" "+refUser.getUserPassword()+" "+refUser.getAge());
		sc.close();
		
		
	} // end of main()
	
}// end of UserApplication class
