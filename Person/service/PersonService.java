package service; //Name of the package

import model.Person;

public interface PersonService //Name of the interface
{
	void addPersonDetails(Person ref);
	void updatePersonDetails(Person ref);
	void retrievePersonList(Person ref);
	void getPersonById(Person ref);
	void removePerson(Person ref);
} //end PersonService Interface