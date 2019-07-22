package dao;

import pojo.UserAccount;

public class AuthenticationImpl implements Authentication {

	public boolean sendStatus;
	
	@Override// To check login information from UserAccount
	public boolean checkLogin(UserAccount ref) {
		if(ref.getLoginID().equals("admin123") && ref.getLoginPW()==12345) { // if condition is right sendStatus will be true
			sendStatus = true;
		} else {
			sendStatus = false;
		}
		return sendStatus;
	}
	

}
