package day03;

//inheritance

//Parent/Base/Super and Child/Derived/Sub
	
//

class Visa{
	
	void ageLimit() { // Visa follows rule ==> user can't apply for credit card, if age < 18
		System.out.println("Age must be 18 and above");
		
		
	}
	
	//method overloading, since it within a class, same method name, parameter different
	int ageLimit(int number) { // we are not following method overiding
		return number;
	}
	
}

class CitiBank extends Visa{ // We use extends keyword to call Parent Class
	

	//In inheritance, child class overide method of parent class
	//method name same, parameter same, return type must be same
	@Override
	int ageLimit(int number) { //method overriding ==> line number 14
		// TODO Auto-generated method stub
		return super.ageLimit(number);
	}
	
	@Override
	void ageLimit() {
		// TODO Auto-generated method stub
		super.ageLimit();
		System.out.println("....");
		
	}

	
	


	
	
	
	} 



public class Inheritance {
	
	public static void main(String []args) {
		new CitiBank().ageLimit();
		System.out.println(new CitiBank().ageLimit(15));
	}

}
