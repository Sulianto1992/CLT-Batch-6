package day11; //Name of the package

import java.util.Scanner;

class TicketCounter{
	   
	int availableTickets = 5; //Total number of tickets available
    
synchronized void bookTicket(String personName,int wantedTickets)
 {
	System.out.println("Available tickets :" + availableTickets);
	
    if((availableTickets>=wantedTickets) && (wantedTickets > 0))
    {
        System.out.println(personName + " : "+ wantedTickets +" Tickets Booking Successful\n");
        availableTickets-=wantedTickets;
    } else {
        System.out.println(personName + " : Tickets Booking Unsuccessful\n");
    } //end if
    
 } //end bookTicket
}

class TicketBookingThread extends Thread{

	//Declare variables
    TicketCounter tc;
    String name;
    int seats;
    
    //Constructor
    TicketBookingThread(TicketCounter t,String pname,int pseats)
    {
        tc = t;
        name = pname;
        seats = pseats;
        start(); //Begin the execution of the thread
    }

    public void run()
    {
        tc.bookTicket(name, seats);
    }
}

public class ReservationSynchronized  {

    public static void main(String[] args) {
    
    TicketCounter tc = new TicketCounter();
    
    int ticketForSulianto, ticketForRazli, ticketForKarthik;
    
    System.out.println("Welcome to the Ticket Reservation System");
    System.out.println("Please indicate the number of tickets for the following people\n");
    
    System.out.print("How many tickets does Sulianto wants?");
    Scanner sc = new Scanner(System.in);
    ticketForSulianto = sc.nextInt();
    System.out.println("");
    
    System.out.print("How many tickets does Razli wants?");
    sc = new Scanner(System.in);
    ticketForRazli = sc.nextInt();
    System.out.println("");
    
    System.out.print("How many tickets does Karthik wants?");
    sc = new Scanner(System.in);
    ticketForKarthik = sc.nextInt();
    System.out.println("");
    
    TicketBookingThread th1 = new TicketBookingThread(tc,"Sulianto",ticketForSulianto);
    TicketBookingThread th2 = new TicketBookingThread(tc,"Razli",ticketForRazli);
    TicketBookingThread th3 = new TicketBookingThread(tc,"Karthik",ticketForKarthik);
        
        
    }
}
