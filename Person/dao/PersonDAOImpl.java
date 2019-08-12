package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import connection.DBConnection;
import model.Person;

public class PersonDAOImpl implements PersonDAO {
		
	Connection conn;
	PreparedStatement stmt;
	
	void getConnection() 
	{
		
		try 
		{
			conn = DBConnection.prepareConnection();
		} 
		catch (ClassNotFoundException | SQLException e) 
		{
			System.out.println("DB Connection Error");
		}
		
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
			catch (SQLException e)
			{
				System.out.println("Caught exception");
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
			catch (SQLException e)
			{
				System.out.println("Caught exception");
			}
		}
	}
	
	public List<Person> listPersons(Person ref)
	{
		try
		{
			getConnection();
		
			stmt = conn.prepareStatement("SELECT * FROM employees");
			ResultSet rs = stmt.executeQuery();
			System.out.println();
			System.out.println("Person ID\t" + "Name\t" + "Password\t" + "Date of Birth\n");
			
			if (rs.next())
			{
				while (rs.next() == true)
				{
					System.out.println(rs.getInt(1) + "\t" + rs.getString(2) + "\t" + rs.getString(3) + 
					"\t" + rs.getString(4));
				} //end while
			} //end if 
		}
		catch (SQLException e)
		{
			System.out.println("No person listed in the list");
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
			catch (SQLException e)
			{
				System.out.println("Caught Exception");
			}
			
			List<Person> listPersons = null;
			return listPersons;
		}
	}//end listPersons
	
	public void getPersonById(Person ref)
	{
		getConnection();
		
		try
		{
			stmt = conn.prepareStatement("SELECT * FROM employees WHERE personID = ?");
			stmt.setInt(1, ref.getPersonID());
			
			ResultSet rs = stmt.executeQuery();
			System.out.println();
			
			System.out.println("Person ID\t" + "Name\t" + "Password\t" + "Date of Birth\n");
			
			if (rs.next())
			{
				while (rs.next() == true)
				{
					System.out.println(rs.getInt(1) + "\t" + rs.getString(2) + "\t" + rs.getString(3) + 
					"\t" + rs.getString(4));
				} //end while
			} //end if 
			
		}
		catch (SQLException e)
		{
			System.out.println("Employee is not in the list.");
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
			catch (SQLException e)
			{
				System.out.println("Caught Exception");
			}
	 } 
	} //end getPersonById
	
	public void removePerson(Person ref)
	{
		getConnection();
		
		try
		{
		stmt = conn.prepareStatement("DELETE FROM employees WHERE personID = ?");
		stmt.setInt(1, ref.getPersonID());
		
		stmt.executeUpdate();
		System.out.println("Person ID:" + ref.getPersonID() + "is removed from the list.");
		
		}
		catch (SQLException e)
		{
			System.out.println("Unable to remove the person from the list.");
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
			catch (SQLException e)
			{
				System.out.println("Caught Exception");
			}
	 } 
	}
} //end PersonDAOImpl