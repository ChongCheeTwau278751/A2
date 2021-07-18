package A2Final;

import java.util.Scanner;

public class sales implements Payments {//2.5 Interface

	protected String name;
	protected String service;
	protected int price;
	protected int time;
	protected int person;
    
    public sales(String name, String service, int price, int time, int person){//Constructor with five arguments											
      this.name = name;
      this.service = service;
      this.price = price;											
      this.time = time;	
      this.person = person;
      
      Payments1 pay = new totalPayment1(); //2.5 Interface
      System.out.println("\t<<Xymaxx Restaurant Sales, Billing and Financial System>>");
      System.out.println("\t\tXymaxx Restaurant is a buffet restaurant");
      System.out.println("\t\tXymaxx Restaurant charge RM" + pay.getPayment1() + " for 1 hour(1 person)");
      
      
    }   
    //2.2 Polymorphism
    public void printInfo(){
        System.out.println("#" + this.service + " is updated everyday.");
    }
    
    public String getService(){
	    return this.service;
	}
    //2.3 Encapsulation
    public void setPrice(int price) {
		this.price = price;
	}
	
	public void setTime(int time) {
		this.time = time;
	}
	
	public void setPerson(int person) {
		this.person = person;
	}
	
	public int getPrice() {
		return price;//150
	}
	
	public int getTime() {
		return time;//1 hour
	}
	
	public int getPerson() {
		return person;//per one person
	}
	
	public int total() {//Overloading with no argument
		return price*(time/60);
	}
	
	 public int total(int time){//Overloading with one argument
	 	return price*(time/60);
	}
	     
	public int total(int price, int time){//Overloading with two arguments
	    return price*(time/60);
	}
	
	@Override
	public int getPayment() {
		
		int price = 150;
		
		return price*2;
	}
	@Override
	public int getPayment(int person, int price) {
		
		return person*price;
	}
	
	public void getPayments() {//method
		Scanner in = new Scanner(System.in);
		System.out.println("\n\t##Price Calculation##");
		System.out.println("Enter the number of customer\t:");
		int n = in.nextInt();
		System.out.println("Enter the time spent in the restaurant(in minutes)\t:");
		int t = in.nextInt();
		System.out.println("Time spent\t: " + t + " mins or " + (t/60) + " hour(s) and " + (t%60) + " mins");
		if(t <= 60) {
			int p1 = 150*n;
			System.out.println("Total price\t: RM" + p1);
		}else if(t>60 && t<=120) {
			int p2 = 300*n;
			System.out.println("Total price\t: RM" + p2);
		}else if(t>120 && t<=180) {
			int p3 = 450*n;
			System.out.println("Total price\t: RM" + p3);
		}
	}
	
	
    //Overriding
  	public String toString() { 
  	  return  "\nService: " + service +
  			  "\n#Price List and Charging Standard#" +
  			  "\nRM" + price + " per "+ person + " person(s) for " + 
  			  "\nTime \t= " + time + " mins or " + (time/60)+"hour(s) " + (time%60) + " mins" +
  			  "\nTotal price for one person for one hour\t\t: RM" + total() +
  			  "\nTotal price for one person for two hour\t\t: RM" + total(120) +
  			  "\nTotal price for one person for three hour\t: RM" + total(150, 180) +
  			  "\nTotal price for two person for one hour\t\t: RM" + getPayment() +
  			  "\nTotal price for two person for two hours\t: RM"+ getPayment(2,300) +
  			  "\nTotal price for two person for three hours\t: RM"+ getPayment(2,450) +
  			  "\n(Etcetera)";
  	}
	
}
