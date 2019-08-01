package file; //Name of the package

import java.io.*; //Input output operation
import java.util.Scanner; //Read the user input


public class ReadWriteFile {

	public static void main(String[] args) throws IOException {
		
		//Variable Declaration
		FileWriter fw = null;
		FileReader frRef = null;
		DataInputStream in = null;
		BufferedReader br =  null;
		BufferedWriter bw = null;
		int count = 0;
		String line;
		
		//Display welcome message
		System.out.println("Welcome to the File Word Counting!!");
		System.out.println("Please enter the filename: ");
		
		//Prompt the user for the filename
		Scanner sc = new Scanner(System.in);
		String fileName = sc.nextLine();
		System.out.println("");
		
		File f = new File(fileName);
		boolean exists = f.exists();
		System.out.println(exists);
		
		//Display output result whether the file exists in the project folder
		if (exists == false)
		{
			System.out.println(fileName + " does not exist.");
			System.out.println("A new file is created.");
			f.createNewFile();
		}
		else
		{
			System.out.println(fileName + " exists.");
		} //end if
		
		//Prompt the user to enter words
		System.out.println("Enter Text to the File: ");
		sc = new Scanner(System.in);
		String text = sc.nextLine();
		System.out.println("");
		
		
		try  
		{
			//Write text to the file
			bw = new BufferedWriter(new FileWriter(fileName));
			bw.write(text); 
			bw.close();
             
			//Read the content of the file
			br = new BufferedReader(new FileReader(fileName));
		    
			//Read the content line by line
		    while ((line = br.readLine()) != null) 
		    {
			    count++;   
			    String[] words = line.split(" ");
			    count = count + (words.length - 1);
            } //end while
        
		System.out.println("Number of words is : " + count); //Display the number of words in the text file
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		} 
		finally 
		{
			//Close the input stream
	        in.close();
		} // end try catch
	} //end main
} //end ReadWriteFile class

