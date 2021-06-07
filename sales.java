package A1;

import java.util.Scanner;

public class sales implements Payment {//2.5 Interface

	protected String name;
	protected String service;
	protected int price;
	protected int time;
	protected int person;
    
    public sales(String name, String service, int price, int time, int person){//	 											
      this.name = name;
      this.service = service;
      this.price = price;											
      this.time = time;	
      this.person = person;
       
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
	
	public int total() {//Constructor with no argument
		return price*(time/60);
	}
	
	 public int total(int time){//Constructor with one argument
	 	return price*(time/60);
	}
	     
	public int total(int price, int time){//Constructor with two argument
	    return price*(time/60);
	}
	
	public int getpayment(int time) {//interface
		return (price*2)*(time/60);
	}
	
	public void getPayment() {//2.5 interface
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
     
  	public String toString() { 
  	  return  "\n\t<<" + name + "'s Sales Department>>" +
  			  "\nService: " + service +
  			  "\n#Price List and Charging Standard#" +
  			  "\nRM" + price + " per "+ person + " person(s) for " + 
  			  "\nTime \t= " + time + " mins or " + (time/60)+"hour(s) " + (time%60) + " mins" +
  			  "\nTotal price for one person for one hour\t\t: RM" + total() +
  			  "\nTotal price for one person for two hour\t\t: RM" + total(120) +
  			  "\nTotal price for one person for three hour\t: RM" + total(150, 180) +
  			  "\nTotal price for two person for one hour\t\t: RM" + getpayment(60) +
  			  "\n(Etcetera)";
  	}
	
	
}
