package service;

import dao.PersonDAO;
import dao.PersonDAOImpl;
import model.Person;


public class PersonServiceImpl implements PersonService {
	
     PersonDAO refPersonDAO;
	
	@Override
	public void addPersonDetails(Person ref) { // call or invoke
	
		refPersonDAO = new PersonDAOImpl();
		refPersonDAO.addPerson(ref);
		
	}
	
	@Override
	public void updatePersonDetails(Person ref) { // call or invoke
	
		refPersonDAO = new PersonDAOImpl();
		refPersonDAO.updatePerson(ref);
		
	}
	
	

}