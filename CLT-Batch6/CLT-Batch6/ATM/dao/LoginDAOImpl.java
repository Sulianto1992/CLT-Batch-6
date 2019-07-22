package dao;

import pojo.User;

public class LoginDAOImpl implements LoginDAO {

	boolean status;
	
	//Connect with the DB here
	
	@Override
	public boolean loginValidate(User ref) {
		
		if(ref.getUserID()==1234 && ref.getUserPassword().equals("test")) {
			status = true;
		} else {
			status = false;
		}
		
		return status;
	}
	

}
