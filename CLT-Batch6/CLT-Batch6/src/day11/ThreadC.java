package day11;

public class ThreadC extends Thread{

	@Override
	public void run() {
		
		for (int i = 1; i <= 5; i++)
		{
			try 
			{
				Thread.sleep(500);
				
			}
			catch (Exception e) {
				System.out.println(e);
			}
			System.out.println(i);
			
		}
		
	}
	public static void main(String[] args) {
		
		//create 5 threads
		ThreadC t1 = new ThreadC();
		ThreadC t2 = new ThreadC();
		ThreadC t3 = new ThreadC();
		ThreadC t4 = new ThreadC();
		ThreadC t5 = new ThreadC();
	
		t1.start();
		
		t1.setName("Thread 1");
		t2.setName("Thread 2");
		t3.setName("Thread 3");
		t4.setName("Thread 4");
		t5.setName("Thread 5");
		
		try {
	         
			t1.join();
		} catch (Exception e) {
			System.out.println(e);
		}
		
		t2.start();
		try {
			t2.join();
		} catch (Exception e) {
			System.out.println(e);
		}
		
		
	    t3.start();
	    t4.start();
	    t5.start();
        
		
	}

}
