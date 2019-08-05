package serialization;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeSerialization {

	public static void main(String[] args) {
		
		SerializationDemo e = null;
		try {
			FileInputStream fileIn = new FileInputStream("david.txt");
			ObjectInputStream in = new ObjectInputStream(fileIn);
			e = (SerializationDemo) in.readObject(); // down casting
			in.close();
			fileIn.close();
		}
		catch (IOException i) {
			i.printStackTrace();
			return;
		}
		catch (ClassNotFoundException c) {
			System.out.println("Serialisation class not found.");
			c.printStackTrace();
			return;
		}
		System.out.println("Deserialized Player...");
		System.out.println("Name:     " + e.name); //display
		System.out.println("Address:     " + e.city); //display
		System.out.println("Number:     " + e.mobile); // because the variable was declared as transient / static
		System.out.println("Number:     " + e.age); //display

	}

}
