package application;

import controller.LoginRequest;

public class LoginApp {

	public static void main (String []args) {
		LoginRequest toLogin = new LoginRequest();
		toLogin.sendLoginRequest();
	}
}
