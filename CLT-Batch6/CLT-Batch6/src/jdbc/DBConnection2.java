package jdbc; //Name of the package

import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DBConnection2 
{
	public static Connection myConnection() 
	{
		Connection con = null;
		FileReader fReader = null;
		//Create Properties object
		Properties propRef = new Properties();
		
		try 
		{
			fReader = new FileReader("db.properties");
			//Load jdbc related properties in above file.
			propRef.load(fReader);
			//load the Driver class
			Class.forName(propRef.getProperty("db_driver_class")); //this key can be anything "key"
			//create the connection
			con = DriverManager.getConnection(
					propRef.getProperty("db_url"),
					propRef.getProperty("db_username"),
					propRef.getProperty("db_password")
		);
		}//end of try
		//FileNotFoundException is already caught in IOException
		catch (IOException | ClassNotFoundException | SQLException e)
		{
			System.out.println("DBConnection2 ==> DB Connection Error..");
		} //end of catch
		return con;
	} //end of myConnection()
} //end of DBConnection2
	
	