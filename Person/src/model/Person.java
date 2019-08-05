package model; //Name of the package


public class Person 
{

	//Data members and variables
	private int personID;
	private String personName;
	private String personPassword;
	private String dateOfBirth;
	
	//Setters and Getters
	public int getPersonID() 
	{
		return personID;
	}

	public void setPersonID(int userID) 
	{
		this.personID = userID;
	}
	
	public String getPersonName() 
	{
		return personName;
	}
	
	public void setPersonName(String userName) 
	{
		this.personName = userName;
	}
	
	public String getPersonPassword() 
	{
		return personPassword;
	}
	
	public void setPersonPassword(String userPassword) 
	{
		this.personPassword = userPassword;
	}
	
	public String getDateOfBirth()
	{
		return dateOfBirth;
	}
	
	public void setDateOfBirth(String userDateOfBirth) 
	{
		this.dateOfBirth = userDateOfBirth;
	}
	

} //end Person
