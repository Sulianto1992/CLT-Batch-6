package day10;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class ArrayListExample2 {
	
	public static void main(String[] args) {

        List<String> refList = new ArrayList<String>();
        
        String answer;
        
        //The first time entering the name into the record
        System.out.println("Welcome to the People Database");
        System.out.println("Please enter the name of the person: "); //Prompt user to enter the name
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine(); //Retrieve the name from the user input
        refList.add(name); //Add the person name into the list
        
        System.out.println("Do you want to add another name? (Yes/No)");
        answer = sc.nextLine(); //Retrieve the name from the user input
        
        while (answer.equalsIgnoreCase("Yes"))
        {
        	   
        	   //Enter another name of the person
               System.out.println("Please enter the name of the person: "); 
               name = sc.nextLine(); 
            
               //Determine whether the user input exists in the array
               if (refList.contains(name))
               {
                  System.out.println("The name " + name + " exists.");
               }
               else
               {
                  refList.add(name);
               }  
               
               System.out.println("Do you want to add another name? (Yes/No)");
               answer = sc.nextLine(); //Retrieve the name from the user input
               
               if (answer.equalsIgnoreCase("No"))
               {
            	   break;
               }
               else
               {
            	   System.out.println("Please enter the correct value");  
                   System.out.println("Do you want to add another name? (Yes/No)");
                   answer = sc.nextLine(); //Retrieve the name from the user input
               }

        }
        
        //Display the list
        System.out.println(refList);
        
        }
}

	

