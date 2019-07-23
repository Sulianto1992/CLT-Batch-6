package day07;

public class CommandLineArgumentExample {

	public static void main(String[] city) {
		
		String cityNames[] = city;
		
		//For Loop
		for (int i = 0; i < cityNames.length; i++)
		{
			System.out.println(cityNames[i]);
		}
		
		
		//For Each Loop
		for (String country: cityNames) 
		{
			System.out.println(country);
		}
		
		

	}

}
