package day01;
import java.util.Scanner;

class UserAccount{
	
}

class AuthenticationLogic{
	//write a logic to validate user
	String userID, userPassword;
	
	public void userInput() {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter User ID");
		String userID = sc.next();
		System.out.println("Enter User Password");
		String userPassword = sc.next();
		sc.close();
		this.userID = userID;
		this.userPassword = userPassword;
		checkLogin();
		
	}
	
	public void checkLogin() {
		if(userID.equals("admin") && userPassword.equals("admin123")) {
			System.out.println("Welcome");
		} else {
			System.out.println("Not valid");
		}
	}

	}


public class Example04 {
	
	public static void main(String []args) {
	AuthenticationLogic admin = new AuthenticationLogic();
	admin.userInput();
	
		
	}
}
