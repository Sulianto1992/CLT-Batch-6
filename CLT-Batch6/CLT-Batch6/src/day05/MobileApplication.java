package day05;

import java.util.Scanner;

public class MobileApplication {
	
public static void main(String [] args){
	
	//step : 1
	Mobile refMobile = new Mobile();
	
	//step : 2
	Scanner sc = new Scanner(System.in);
	
	//step 3
	System.out.println("Enter your text : ");
	String myText= sc.next();
	Chat refChat = new Chat();
	refChat.setChat(myText);// this argument will set the value to setter method in Chat Class
	
	//step 4
	WhatsApp refWhatsApp = new WhatsApp();
	refMobile.setRefWhatsApp(refWhatsApp);
	
	//step 5
	refWhatsApp.setRefChat(refChat);
	
	System.out.println(refMobile.getRefWhatsApp().getRefChat().getChat());
	
}
}
