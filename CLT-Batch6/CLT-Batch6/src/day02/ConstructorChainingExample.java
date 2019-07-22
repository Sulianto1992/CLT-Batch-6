package day02;

class Laptop{
	Laptop(){
		this(30,"apple");
		System.out.println("Hello i am in default constructor..");
	}
	
	Laptop(int price){
		System.out.println(price+"apple");//20
	}
	
	Laptop (int price, String brand){
		System.out.println(price +" "+brand);//20 , apple
		
	}
}

public class ConstructorChainingExample {
	
	public static void main(String[] args) {
		new Laptop();
		
	}

}
