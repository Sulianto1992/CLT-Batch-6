package file;

import java.io.*;


public class Reader1 {

	public static void main(String[] args) throws IOException {
	  
		DataInputStream in = null;
		
		try {
			// Open the file that is the first command line parameter
			//FileInputStream fs = new FileInputStream("c:\\file\\demo.txt); //absolute path
			FileInputStream fs = new FileInputStream("sample.txt"); // relative path
			//c:\\MyFile.txt absolute path
			// Get the object of DataInputStream
			in = new DataInputStream(fs);
			BufferedReader br = new BufferedReader(new InputStreamReader(in));
			
			String str;
			
			//Read File Line By Line
			while ((str = br.readLine()) != null) {
				// Print the content on the console
				System.out.println(str);
			}
			
			//Close the input stream
			in.close();
		} catch (Exception e) {//Catch exception if any
			//System.err.println("Error: " + e.getMessage());
			System.out.println("file not found...");
		}
		finally {
			
			 //Close the input stream
			in.close();
		}

	}

}
