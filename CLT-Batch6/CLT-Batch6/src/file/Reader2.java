package file;

import java.io.*;


public class Reader2 {

	public static void main(String[] args) throws IOException {
		FileReader frRef = null;
		
		try {
			
			//Get data from this file using a file reader.
			frRef = new FileReader("sample.txt"); //"c://nikhil.txt")
			
			//To store the contents read vis File Reader
			BufferedReader br = new BufferedReader(frRef);
			
			//Read br and store a line in 'data', print data
			String s;
			
			while ((s = br.readLine()) != null) {
				System.out.println(s);
			}
		} //end of try

		catch(IOException e) {
			System.out.println("Sorry!! File Not Found...");
		} //end of catch
		
		finally {
			frRef.close();
		} //end finally
	}

}
