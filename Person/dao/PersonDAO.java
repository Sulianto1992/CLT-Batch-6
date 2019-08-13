package dao; //Name of the package

import java.util.List;
import model.Person;

public interface PersonDAO //Name of the interface
{	
	public void addPerson(Person pRef);
	public void updatePerson(Person pRef);
	public List<Person> listPersons(Person pRef);
	public void getPersonDetails(Person pRef);
	public void removePerson(Person pRef);
} //end PersonDAO interface