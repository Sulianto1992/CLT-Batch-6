package day06;

public class NestedClassExample02 {
	class MyInnerClass {//non-static inner class
		void myMethod1() {
			System.out.println("I am in MyInnerClass1 => myMethod1");
		}
		/*
	static void myMethod2() {// compilation error, we can't write static method in non-static inner class
		}
  		*/
		
		
 
	}//end of MyInnerClass
	
	void printMethod1AndMethod3() {
		MyInnerClass ref = new MyInnerClass();
		MyInnerClass2 ref1 = new MyInnerClass2();
		ref.myMethod1();
		ref1.myMethod3();
	}
	
	static class MyInnerClass2{//static inner class
		void myMethod3() {
			System.out.println("I am in MyInnerClass2 =>myMethod3");
		}
		
		static void myMethod4() {
			System.out.println("I am in MyInnerClass2 =>myMethod4");
		}
	}//end of MyInnerClass2
	
	void access() {
		class myInnerClass3{//method local inner class
			
			void myMethod5() {
				System.out.println("I am in MyInnerClass3 =>myMethod5");
			}
			/*
			static void myMethod6() {//compilation error, we can't write static method inside non-static inner class
				
			}
			*/
		}//end ofMyInnerClass3
		
	}//end of access
	
	public static void main(String []args) {
		NestedClassExample02 ref = new NestedClassExample02();
		ref.printMethod1AndMethod3();
		NestedClassExample02.MyInnerClass2 ref1 = new NestedClassExample02.MyInnerClass2();
		ref1.myMethod4();
		
	}

}
