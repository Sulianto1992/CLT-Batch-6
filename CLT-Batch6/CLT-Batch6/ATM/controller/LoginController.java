package controller;

import java.util.Scanner;

import pojo.User;
import service.LoginService;
import service.LoginServiceImpl;

public class LoginController {
	
	LoginService refLoginService; // LoginService is an interface
	User refUser; // User is a POJO (Plain old Java object)
	public void userLoginController() {
		userInput();
		
	}
	
	void userInput() {
		Scanner sc = new Scanner(System.in);
		//step 1 : ask user ID and Password
		System.out.println("Enter User ID : ");
		int userID = sc.nextInt();
		
		System.out.println("Enter User Password : ");
		String password = sc.next();
		
		//step 2 : create object of User class
		refUser = new User();
		
		//step 3 : set value to setter method of User Class
		refUser.setUserID(userID);
		refUser.setUserPassword(password);
		
		//step 4 : create object of LoginServiceImpl class and refer to it interface
		refLoginService = new LoginServiceImpl();//we have to create object
		refLoginService.checkStatus(refUser);
	}
	
	

}
