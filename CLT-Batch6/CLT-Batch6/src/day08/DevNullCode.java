package day08;

public class DevNullCode {
	
	static void logic(String word) {
		try {
		
			String temp = word;
			
			if (temp.equals(""))
			{
				System.out.println("The string is null");
			}

		}
		catch (NullPointerException e)
		{
			System.out.println("Caught NullPointerException error.");
		}
		
		catch (Exception e) {
			System.out.println("Exception is the super class of all Exception classes");
		}
		finally
		{
			System.out.println("closing files...");
		}
		
		
	}

}
