package controller;

import java.util.InputMismatchException;
import java.util.Scanner;
import model.Person;
import service.PersonService;
import service.PersonServiceImpl;

public class PersonController {
	
	PersonService refPersonService; // PersonService is an interface
	Person refPerson; // Person is a POJO
	Scanner sc = new Scanner(System.in);
	private void sysout() {
		// TODO Auto-generated method stub

	}
	
	public void personDetailsController()
	{
		//personInput();
		updatePersonDetails();
	}//end personDetailsController method
	
    void personInput() 
	{
    	System.out.println("Please enter the employee details: ");
    	System.out.println();
    	System.out.println();
    	
    	//Prompt user for his or her identification number
    	System.out.println("Please enter the user identification number: ");
    	int personID = sc.nextInt();
    	
    	//Prompt user for his or her name
    	System.out.println("Please enter the name: ");
    	String personName = sc.next();
    	
    	//Prompt user for his or her password
    	System.out.println("Please enter the password: ");
    	String personPassword = sc.next();
    	
    	//Prompt user for his or her date of birth
    	System.out.println("Please enter the date of birth: ");
    	String personDateOfBirth = sc.next();
    	
    	//Create object of Person class
    	refPerson = new Person();
    	
    	//Set value to setter method of Person Class
    	refPerson.setPersonID(personID);
    	refPerson.setPersonName(personName);
    	refPerson.setPersonPassword(personPassword);
    	refPerson.setDateOfBirth(personDateOfBirth);
    	
    	//Create object of PersonServiceImpl class and refer to it interface
    	refPersonService = new PersonServiceImpl(); 
		refPersonService.addPersonDetails(refPerson);
    	
	} //end personInput

    void updatePersonDetails()
    {
    	
		//Prompt user for his or her identification number
		System.out.println("Please enter the user identification number: ");
		int personID = sc.nextInt();
		
		//Prompt user for his or her password
    	System.out.println("Please enter the password: ");
    	String personPassword = sc.next();
    	
    	//Prompt user for his or her date of birth
    	System.out.println("Please enter the date of birth: ");
    	String personDateOfBirth = sc.next();
    	
    	//Create object of Person class
    	refPerson = new Person();
    	
    	//Set value to setter method of Person Class
    	refPerson.setPersonID(personID);
    	refPerson.setPersonPassword(personPassword);
    	refPerson.setDateOfBirth(personDateOfBirth);
    	
    	//Create object of PersonServiceImpl class and refer to it interface
    	refPersonService = new PersonServiceImpl(); 
		refPersonService.updatePersonDetails(refPerson);
    }
} //end PersonController