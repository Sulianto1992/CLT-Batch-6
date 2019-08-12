package day11;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class HashMapExample {

	public static void main(String[] args) {
		
		
		Map<Integer, String> mapRef = new HashMap<Integer,String> ();
		
		
		//Adding keys (Country, Capital) 
		mapRef.put(52, "Oracle");
		mapRef.put(12, "Java");
		mapRef.put(40, "Python");
		
		for(Map.Entry temp:mapRef.entrySet()) {
			System.out.println(temp.getKey()+ ""+temp.getValue());
		}
		
		TreeMap refTreeMap = new TreeMap(mapRef);
		System.out.println("Sorted HashMap:" + refTreeMap);
	    
	    
	    


	}

}