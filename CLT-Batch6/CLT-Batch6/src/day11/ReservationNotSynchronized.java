package day11;

	class Reserve implements Runnable {
		int available = 5;
		int wanted;
		Reserve(int i){
			wanted=i;
		}
	
	
       public void run() {
		System.out.println("Available berths: " + available);
		if (available> wanted) {
			// get the name of the passenger
			String name = Thread.currentThread().getName();
			// allot the berth for him
			System.out.println(wanted + " Berths reserved for " + name);
			try {
				Thread.sleep(2000); // wait for printing the ticket
				available = available-wanted; //update the no. of available berths
			} catch (InterruptedException e) {
				
			}
		}  //end of if
		else
			System.out.println("Sorry..no berth available");
		} //end of run
	} //end of class

public class ReservationNotSynchronized {
	public static void main(String[] args) {
		
		Reserve r = new Reserve(3); // tell that 1 berth is needed
		Thread t1 = new Thread(r);
		Thread t2 = new Thread(r);
		Thread t3 = new Thread(r);
		t1.setName("Razli");
		t2.setName("Sulianto");
		t3.setName("Karthik");
		t1.start();
		t2.start();
		t3.start();
	}

}
