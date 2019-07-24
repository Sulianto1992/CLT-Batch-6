package day08;

import java.util.Scanner;

class Person{

	public int id; 
	public String name;
	
	//Getters
	public int getId() {
		return id;
	}
	
	public String getName()
	{
		return name;
	}
	
	//Setters
	public void setId(int number)
	{
		this.id = number; 
	}
	
	public void setName(String personName)
	{
		this.name = personName;
	}
	
	
	/*
	public Person(int id, String name) {
		this.id = id;
		this.name = name;
		
	}
	
   @Override
   public String toString() {
	   return id + " " + name;
   }
   */
	
}

public class ArrayExample {

	public static void main(String[] args) {
		
		
		/*
		String str[] = {"Physics", "Chemistry","Maths"};
		
		
		for (int i = 0; i <str.length; i++)
		{
			System.out.println(str[i]);
		} //traditional for loop
		
		
		for (String subject: str)
		{
			System.out.println(subject);
		} //for each loop
		*/

		Scanner sc = new Scanner(System.in);
		System.out.println("How many records you want to enter : ");
		int number = sc.nextInt(); // 5
		Person pRef[] = new Person[number]; //Create a space for array
		
	    
		for (int i = 0; i < pRef.length; i++)
		{
			System.out.println("Enter your ID : ");
			int id = sc.nextInt();
			System.out.println("Enter your Name : ");
			String name = sc.next();
			
			Person p1 = new Person();
			p1.setId(id);
            p1.setName(name);			
			
            
            pRef[i] = p1;
			//pRef[i] = new Person(id, name); //Insert records into the array
			
		} //end of traditional for loop
		
		
		for (Person person : pRef) {
			
			System.out.println(person.getId() + " " + person.getName());
			
			//System.out.println(person); // person is reference of Person class
		}

	}

}
