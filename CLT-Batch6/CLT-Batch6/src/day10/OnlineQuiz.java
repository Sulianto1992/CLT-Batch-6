package day10; //Name of the package

import java.util.ArrayList;
import java.util.Scanner;

public class OnlineQuiz {
	
	//Determine whether the answer is valid
	private static boolean isValid(String reply) {
		
		if (reply.equalsIgnoreCase("A") | reply.equalsIgnoreCase("B") | 
			reply.equalsIgnoreCase("C") | reply.equalsIgnoreCase("D")) {
			
			return true;
		}
		else
		{
			return false;
		} //end if
		
	} //end isValid
	
	//Determine whether the answer for the question is correct
	private static void checkAnswerForAllQuestion(ArrayList<String> answer, int number) {
		
		//Declare arraylist
		ArrayList<String> answerList = new ArrayList<String>(5);
		int count = 0;
		
		//Add correct answer for each question
		answerList.add("B");
		answerList.add("D");
		answerList.add("C");
		answerList.add("D");
		answerList.add("A");
		
		//Determine whether the user gets the correct answer for the question
		if (answer.get(0).equalsIgnoreCase(answerList.get(0)) & (number == 1))
		{
			System.out.println("Correct answer.");
			count++;
		}
		else if (answer.get(1).equalsIgnoreCase(answerList.get(1)) & (number == 2))
		{
			System.out.println("Correct answer.");
			count++;
		}
		else if (answer.get(2).equalsIgnoreCase(answerList.get(2)) & (number == 3))
		{
			System.out.println("Correct answer.");
			count++;
		}
		else if (answer.get(3).equalsIgnoreCase(answerList.get(3)) & (number == 4))
		{
			System.out.println("Correct answer.");
			count++;
		}
		else if (answer.get(4).equalsIgnoreCase(answerList.get(4)) & (number == 5))
		{
			System.out.println("Correct answer.");
			count++;
		}
		else
		{
			System.out.println("Wrong Answer.");
		}

	} //end checkAnswerForAllQuestion

	//Inform the user to go to the next question
    private static void informUser()
    {
    	System.out.println("Please procees to the next question.");
    }
    
	public static void main(String[] args)  {
		
		String answer;
		boolean isValidAnswer, checkQuestion1;
		
		//Declare array
		ArrayList<String> answerList = new ArrayList<>(5);
		
		//Display welcome message
		System.out.println("Welcome to the online quiz!");
		System.out.println("You may begin anytime you wish.\n");
		
		//Display question 1
		System.out.println("Question 1 : Pick up the wrong statement. A refrigerant should have\n");
		System.out.println("(a) Tow specific heat of liquid");
		System.out.println("(b) High boiling point");
		System.out.println("(c) High latent heat of vaporisation");
		System.out.println("(d) Low specific volume of vapour");
		
		//Prompt the user to enter the answer for the question
		System.out.println("\nEnter your answer here: ");
		Scanner sc = new Scanner(System.in);
		answer = sc.next();
		
		//Call the method to determine whether the value is valid
		isValidAnswer = isValid(answer);
		
		//Executes this statement as long as the statement is not true
		while (isValidAnswer != true)
		{
				System.out.println("Invalid input. Please try again.");
				System.out.println("\nEnter your answer here: ");
				sc = new Scanner(System.in);
				answer = sc.next();
				isValidAnswer = isValid(answer);
		} //end while
		
		//Add the answer to the list
		answerList.add(answer);
		
		//Check for the correct answer for question 1
        checkAnswerForAllQuestion(answerList, 1);
		
        //Inform the user to go to the next question
		informUser();
		
		//Display question 2
		System.out.println("Question 2 : A standard ice point temperature corresponds to the temperature of\n");
		System.out.println("(a) water at 0 Degree Celsius");
		System.out.println("(b) ice at -4 Degree Celsius");
		System.out.println("(c) solid and dry ice");
		System.out.println("(d) mixture of ice and water under equilibrium conditions");
			
		//Prompt the user to enter the answer for the question
		System.out.println("\nEnter your answer here: ");
		sc = new Scanner(System.in);
		answer = sc.next();
		
		//Call the method to determine whether the value is valid
		isValidAnswer = isValid(answer);
			
		//Executes this statement as long as the statement is not true
		while (isValidAnswer != true)
		{
				System.out.println("Invalid input. Please try again.");
				System.out.println("\nEnter your answer here: ");
				sc = new Scanner(System.in);
				answer = sc.next();
				isValidAnswer = isValid(answer);
			
		} //end while
		
		//Add the answer to the list
		answerList.add(answer);
		
		//Check for the correct answer for question 1
        checkAnswerForAllQuestion(answerList, 2);
		
        //Inform the user to go to the next question
		informUser();
	
		
		
		
		

	
		

	}

}
