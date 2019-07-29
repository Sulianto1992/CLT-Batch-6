package day10;

import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

class Customer {
	String name;
	Customer(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return name;
	}
} //end of Customer


public class ArrayExample03 {

	public static void main(String[] args) {
		
		List refList = new ArrayList();
		
		refList.add(new Customer("Charles"));
		refList.add(new Customer("Jerret"));
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Name : ");
		String name = sc.next();
		refList.add(new Customer(name));
		System.out.println(refList);
	}

}
