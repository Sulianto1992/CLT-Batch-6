package application; //Name of the package

import java.sql.SQLException;
import controller.PersonController;

public class PersonDatabase //Name of the class
{
	public static void main(String[] args) throws ClassNotFoundException, SQLException //Start of the program
	{
		System.out.println("Welcome to the Sulianto's Database!");
		PersonController refPersonController = new PersonController();
		refPersonController.personDetailsController();
	}
} //end PersonDatabase