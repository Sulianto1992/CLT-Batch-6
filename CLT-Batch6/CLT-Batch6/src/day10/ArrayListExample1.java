package day10;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample1 {

	public static void main(String[] args) {
		
		List<Object> refList = new ArrayList<Object>();
		refList.add("Hello");
		refList.add(60);
		refList.add(new User("Charles"));
		
		//System.out.println(refList);
      
		for (Object temp : refList) {
			System.out.println(temp);
		}
	}
}

class User{

	String name;
	
	public User(String string) {
		name  = string;
	}
	
	@Override
	public String toString() {
		return name;
	}
}
	