package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import connection.DBConnection;
import connection.DBConnection2;
import model.Person;

public class PersonDAOImpl implements PersonDAO {
		
	Connection conn;
	PreparedStatement stmt;
	
	void getConnection() 
	{
		conn = DBConnection2.myConnection();
		/*
		try 
		{
			
			//conn = DBConnection.prepareConnection();
		} 
		catch (ClassNotFoundException | SQLException e) 
		{
			System.out.println("DB Connection Error");
		}
		*/
	}
	
	public void addPerson(Person ref)
	{
		try
		{
			getConnection();
			
			String sql = "INSERT INTO employees (personID,name,password,dateOfBirth)" + "VALUES (?,?,?,?)";
			stmt = conn.prepareStatement(sql);
			
			
		    stmt.setInt(1, ref.getPersonID());
		    stmt.setString(2, ref.getPersonName());
		    stmt.setString(3, ref.getPersonPassword());
		    stmt.setString(4, ref.getDateOfBirth());
		    
		    stmt.executeUpdate();
		    System.out.println("A record is added successfully.");

		}
		catch (SQLException e)
		{
			System.out.println("Cannot insert records.");
		}
		finally
		{
			try
			{
				
				if (stmt != null)
				{
					stmt.close();
				}
				
				
				if (conn != null)
				{
					conn.close();
				}
			}
			catch (Exception e)
			{
				e.printStackTrace();
			}
		}
	}
	
	public void updatePerson(Person ref)
	{
		try
		{
			getConnection();
			
			String sql = "UPDATE employees SET password = ?, dateOfBirth = ? WHERE personID = ?";
			stmt = conn.prepareStatement(sql);
			
		    stmt.setInt(3, ref.getPersonID());
		    //stmt.setString(2, ref.getPersonName());
		    stmt.setString(1, ref.getPersonPassword());
		    stmt.setString(2, ref.getDateOfBirth());
		    
		    stmt.executeUpdate();
		    System.out.println("The record is updated successfully.");

		}
		catch (SQLException e)
		{
			System.out.println("Cannot update record.");
		}
		finally
		{
			try
			{
				
				if (stmt != null)
				{
					stmt.close();
				}
				
				
				if (conn != null)
				{
					conn.close();
				}
			}
			catch (Exception e)
			{
				e.printStackTrace();
			}
		}
	}
}
