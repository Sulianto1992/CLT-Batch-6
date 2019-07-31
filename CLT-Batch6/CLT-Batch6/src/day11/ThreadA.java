package day11;

public class ThreadA extends Thread{

	@Override
	public void run() {
		System.out.println("Thread is runnig hii..");
	}
	
	public static void main(String[] args) {
		
		ThreadA ta = new ThreadA();
		Thread t = new Thread(ta); 
		//ta.start(); // not a good practice
		t.start(); // once we call start(), it invokes run() automatically
		// ta.run(); // not a good practice
		// t.run(); // not a good practice

	}

}
