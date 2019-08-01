package file;

import java.io.*;

public class Writer1 {

	public static void main(String[] args) throws IOException {
		
		FileWriter fw = null;
		
		try { //warning: Exceptions available 
			boolean newFile = false;
			
			File f = new File("abcxyz.doc");
			System.out.println(f.exists()); //look for a real file // false true
			
			newFile = f.createNewFile(); // maybe create a file!
			System.out.println(newFile); //already there?      //true      false
			System.out.println(f.exists()); // look again */   //true      false
			
			fw = new FileWriter("abcxyz.doc");
			BufferedWriter br = new BufferedWriter(fw);
			
			br.write("this is filewriter? ");
			//br.flush();
			br.newLine();
			//br.flush();
			br.write("thank you..");
			br.newLine();
			br.write("Java");
			br.newLine();
			br.write("SAP");
			br.newLine();
			br.write(".NET");
			br.newLine();
			br.close();
			
		} catch (IOException e) {
			System.out.println("Sorry!! File Not Found...");
		}
		finally {
			fw.close();
		}
		
		

	}

}
