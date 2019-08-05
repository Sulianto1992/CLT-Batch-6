package serialization;

import java.io.*;

public class SerializationDemo implements Serializable {
// public class SerializationDemo {
	String name, city;
	transient int mobile; // we can also make static, if we don't want to serialise the variable
	int age;
	
	public static void main(String[] args) {
		
		SerializationDemo e = new SerializationDemo();
		e.name = "David";
		e.city = "Melbourne";
		e.mobile = 112233344;
		e.age = 30;
		
		try {
			FileOutputStream fileOut = new FileOutputStream("david.txt"); // create
			ObjectOutputStream out = new ObjectOutputStream(fileOut);
			out.writeObject(e);
			out.close();
			fileOut.close();
		} catch (IOException i) {
			i.printStackTrace();
		}

	}

}
