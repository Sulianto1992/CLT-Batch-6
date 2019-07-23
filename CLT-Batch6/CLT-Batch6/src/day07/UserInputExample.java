package day07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class UserInput {
	
	void userAccess() throws IOException {
		BufferedReader brRef = new BufferedReader(new InputStreamReader(System.in));
		/*System.out.println("Enter a character : ");
		char c = brRef.readLine().charAt(2);
		
		System.out.println(c);*/
		
		System.out.println("Enter a number : ");
		// int number = brRef.read();  //sread() we use to read a character
		
		String text = brRef.readLine();
		
		int number = Integer.parseInt(text);
		
		System.out.println("You have entered :" + number);
		

	}
}


public class UserInputExample {

	public static void main(String[] args) throws IOException {
		
       UserInput ref = new UserInput();
       ref.userAccess();
	}

}
