package application;


import java.sql.Connection;
import java.sql.SQLException;

import controller.PersonController;

public class PersonDatabase {

	public static void main(String[] args) throws ClassNotFoundException, SQLException  {
		System.out.println("Welcome to the Worker Party Database!");
		PersonController refPersonController = new PersonController();
		refPersonController.personDetailsController();

	}

}
