package day08;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.InputMismatchException;
import java.util.Scanner;

public class DevCode2 {

	// 1. handle NullPointerException (pointing null) //Done
	// 2. handle NumberFormatException (BufferedReader) //Done
	// 3. handle InputMisMatchException (Scanner)
	
	
	static void logic(int temp) throws InputMismatchException, NumberFormatException, IOException, InputMismatchException{
		
		try 
		{   
			/*
            String temp = word;
			
			if (temp.equals(""))
			{
				System.out.println("The string is null");
			}
			*/
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter number2 : ");
			int number = Integer.parseInt(br.readLine());
			temp = number;
			System.out.println(temp);

		}
		catch (NullPointerException e)
		{
			System.out.println("Caught NullPointerException error.");
		}
		/*
		catch (NumberFormatException e)
		{
			System.out.println("Caught NumberException error.");
		}
		*/
		catch (InputMismatchException e)
		{
			System.out.println("Caught InputMismatchException error.");
		}
		finally
		{
			System.out.println("closing files...");
		}
		
		
		
		
		
		/*
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter number2 : ");
		int number = Integer.parseInt(br.readLine());
		System.out.println(number);
		*/
	}
}
