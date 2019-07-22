package controller;

import java.util.Scanner;

import pojo.UserAccount;
import service.ServiceLogin;
import service.ServiceLoginImpl;

public class LoginRequest {
	
	UserAccount userInfo;
	ServiceLogin verifyLogin;
	
	public void sendLoginRequest() {
		
		Scanner sc = new Scanner(System.in); 
		System.out.println("Enter login ID : ");// Ask user to input ID
		String loginID = sc.next(); //set the value given to loginID
		System.out.println("Enter password : ");// Ask user to input Password
		int password = sc.nextInt(); // set the value given to password
		userInfo = new UserAccount(); // create a new object to store loginID and password
		userInfo.setLoginID(loginID); //store loginID to setLoginID
		userInfo.setLoginPW(password);//store password to setLoginPW
		
		verifyLogin = new ServiceLoginImpl(); 
		verifyLogin.checkStatus(userInfo);// to check the userInfo for status and print out the message
		
		
		
	}

}
