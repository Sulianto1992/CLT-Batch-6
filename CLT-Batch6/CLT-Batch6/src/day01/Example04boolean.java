package day01;

import java.util.Scanner;

class UserAccount1{
	
}

class AuthenticationLogic1{
	//write a logic to validate user
	String userID, userPassword;
	boolean status;
	
	public void userInput(String userID,String userPassword) {
		this.userID = userID;
		this.userPassword = userPassword;
		validateUser();
		logic();
	
		
	}
	
	public void logic() {
		if(status) {
			System.out.println("Welcome");
		} else {
			System.out.println("Not valid");
		}
	}
	
	public boolean validateUser() {
		if(userID.equals("admin") && userPassword.equals("admin123")) {
			status = true;
		} else {
			status = false;
		}
		return status;
	}

	}

public class Example04boolean {
	
	public static void main(String []args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter User ID");
		String userID = sc.next();
		System.out.println("Enter User Password");
		String userPassword = sc.next();
		sc.close();
		AuthenticationLogic1 admin = new AuthenticationLogic1();
		admin.userInput(userID,userPassword);
		
			
		}

}
