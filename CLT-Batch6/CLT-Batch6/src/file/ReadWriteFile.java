package file;

import java.io.*;
import java.util.Scanner;


public class ReadWriteFile {

	public static void main(String[] args) throws IOException {
		
		FileWriter fw = null;
		BufferedReader bufferedReader =  null;
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
		
		//Determine whether the file exists in the project folder
		if (exists == false)
		{
			System.out.println(fileName + " does not exist.");
			System.out.println("A new file is created.");
			f.createNewFile();
		}
		else
		{
			System.out.println(fileName + " exists.");
		}
		
		//Prompt the user to enter words
		System.out.println("Enter Text to the File: ");
		sc = new Scanner(System.in);
		String text = sc.nextLine();
		System.out.println("");
	
		/*
		try (FileWriter writer = new FileWriter(fileName)) {
			writer.write(text);
			
		    bufferedReader = new BufferedReader(new FileReader(fileName));
		
		while ((line = bufferedReader.readLine()) != null) 
		{
		    count++;   
		    String[] words = line.split(" ");
		    count = count + words.length;
		    System.out.println(count);
        }
		System.out.println("Number of words is : " + count);
		} catch (IOException e) 
		{
			e.printStackTrace();
		} finally {
			
	    try 
	    {
            if(null != bufferedReader) 
            {
                bufferedReader.close();
            }
        } 
        catch (IOException e)
	    {
            e.printStackTrace();
        }
	}
		*/
		
		//Write the content to the file
		try (FileWriter writer = new FileWriter(fileName)) {
			writer.write(text);
			
			//Open the file
			FileInputStream fs = new FileInputStream(f);
			
			//Create array of byte 
			byte[] bytesArray = new byte[(int)f.length()];
			fs.read(bytesArray);
			//Create new object of String
			String s = new String(bytesArray);
			String [] data = s.split(" ");
			
			//Increment to the total number of words
			for (int i = 0; i < data.length; i++)
			{	
				count++;	
			}
			
			//Display the number of words
			System.out.println("Number of words :" + count);
		}
		catch (Exception e)
		{
			//Display the message 
			System.out.println("No text entered.");
		}
		
		

	}

}
