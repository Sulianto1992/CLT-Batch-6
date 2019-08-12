package controller;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
import model.Person;
import service.PersonService;
import service.PersonServiceImpl;

public class PersonController {
	
	PersonService refPersonService; // PersonService is an interface
	Person refPerson; // Person is a POJO
	Scanner sc = new Scanner(System.in);
	int choice;
	
	public void personDetailsController()
	{
		mainPage();
		/*
		personInput();
		updatePersonDetails();
		retrievePersonList();
		getPersonDetails();
		removePersonDetails();
		*/
	}//end personDetailsController method

	void mainPage()
	{

		do
		{
		
			//Prompt user for input
			System.out.println("Please choose one of the following options (1 to 5): \n");
			System.out.println("1. Add a person to the list");
			System.out.println("2. Update details of a person in the list");
			System.out.println("3. Display all details from the list");
	        System.out.println("4. Retrieve a person details using his or her person ID");
	        System.out.println("5. Remove a person details from the list");
	        System.out.println("6. Exit the program");
	        
	        choice = sc.nextInt();
	
        	//Prompt the user for the correct value
            while (choice < 1 || choice > 5)
            {
            	System.out.println("Incorrect value. Please input the correct value. \n");
        		System.out.println("Please choose one of the following options (1 to 5): \n");
        		System.out.println("1. Add a person to the list");
        		System.out.println("2. Update details of a person in the list");
        		System.out.println("3. Display all details from the list");
                System.out.println("4. Retrieve a person details using his or her person ID");
                
                choice = sc.nextInt();
            	
            } //end while
	       
	        
	        switch (choice)
	        {
	        	case 1: personInput();
	        	        break;
	        	case 2: updatePersonDetails();
	        	        break;
	        	case 3: retrievePersonList();
	        	        break;
	        	case 4: getPersonDetails();
	        	        break;
	        	case 5: removePersonDetails();
	        	        break;
	        } //end switch

		} while (choice != 6);
		
	 System.out.println("Thank you for using our system!");

	} //end mainPage

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
    
    void retrievePersonList() 
    {
    	//Create object of Person class
		refPerson = new Person();
		
		//Create object of PersonServiceImpl class and refer to it interface
		refPersonService = new PersonServiceImpl();
		refPersonService.retrievePersonList(refPerson);
		
	} //end retrievePersonList
    
    void getPersonDetails()
    {
    	//Create object of Person class
		refPerson = new Person();
		
		//Create object of PersonServiceImpl class and refer to it interface
		refPersonService = new PersonServiceImpl();
		
		//Prompt user input
		int personID = sc.nextInt();
		
		//Set the value of PersonID
		refPerson.setPersonID(personID);
		refPersonService.getPersonById(refPerson);
		
    } //end getPersonDetails
    
    void removePersonDetails() 
    {
    	//Create object of Person class
		refPerson = new Person();
		
		//Create object of PersonServiceImpl class and refer to it interface
		refPersonService = new PersonServiceImpl();
		
		//Prompt user input
		int personID = sc.nextInt();
		
		//Set the value of PersonID
		refPerson.setPersonID(personID);
		refPersonService.removePerson(refPerson);
		
	} //end removePersonDetails
    
} //end PersonController