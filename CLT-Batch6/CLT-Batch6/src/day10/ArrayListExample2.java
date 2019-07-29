package day10;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayListExample2 {
	
	public static void main(String[] args) {

        List<Object> refList = new ArrayList<String>();
        
        String answer = "";
        
        do {
        
        
        System.out.println("Enter the name of the person: "); //Prompt user to enter the name
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine(); //Retrieve the name from the user input
        
        for (int i = 0; i < refList.size(); i++)
        {
        	if (name.equals()
        }
        
        /*
        for (Object temp : refList) {
			
          if (name.equals(refList))
          {
        	  System.out.println("This name has existed.");
          }
          else
          {
        	  refList.add(temp);
        	  System.out.println(temp);
          }
        }
        */
        
        System.out.println("Is there any more name that would you like to add?");
        Scanner ans = new Scanner(System.in);
        answer = ans.nextLine(); //Retrieve the name from the user input
       
        } while(answer.equalsIgnoreCase("Yes"));
        
        
        
        }
        
	}

        /*
        refList.add("Charles");
        refList.add("Jerret");
        refList.add("Jerret");
        */
  /*    

       */

	

