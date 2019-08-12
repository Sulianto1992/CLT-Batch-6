package service;

import dao.PersonDAO;
import dao.PersonDAOImpl;
import model.Person;


public class PersonServiceImpl implements PersonService {
	
     PersonDAO refPersonDAO;
	
	@Override
	public void addPersonDetails(Person ref) 
	{ // call or invoke
	
		refPersonDAO = new PersonDAOImpl();
		refPersonDAO.addPerson(ref);	
	}
	
	@Override
	public void updatePersonDetails(Person ref) { // call or invoke
	
		refPersonDAO = new PersonDAOImpl();
		refPersonDAO.updatePerson(ref);
		
	}
	
	@Override
	public void retrievePersonList(Person ref) 
	{
		refPersonDAO = new PersonDAOImpl();
		refPersonDAO.listPersons(ref);
	}
	
	@Override
	public void getPersonById(Person ref) 
	{
		refPersonDAO = new PersonDAOImpl();
		refPersonDAO.getPersonById(ref);
	}
	
	@Override
	public void removePerson(Person ref) 
	{
		refPersonDAO = new PersonDAOImpl();
		refPersonDAO.removePerson(ref);
	}
	
} //end PersonServiceImpl