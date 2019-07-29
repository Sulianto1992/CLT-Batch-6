package day10;

import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListExample04 {

	public static void main(String[] args) {
		
		List refList = new ArrayList();
		refList.add("data1");
		refList.add("data2");
		refList.add("data3");
		refList.add("data4");
		
		System.out.println("Iterate using simple for loop");
		for (int i = 0; i < refList.size(); i++) {
			System.out.println(refList.get(i));
		}
		
		System.out.println("Iterate using simple for-each loop");
		for (Object object : refList) {
			System.out.println(object);
		}
		
		System.out.println("Iterate using Java 8 forEach and lambda");
		refList.forEach(temp -> {
			System.out.println(temp);	
		});
		
		System.out.println("Iterate using Iterator");
		Iterator itr = refList.iterator(); //Iterator is an interface.
		while (itr.hasNext()) {
			System.out.println(itr.next());

		}

	}

}
