package A2Final;

import java.util.Scanner;

public class Finance extends sales implements Payments {//2.1 Inheritance & 2.5 Interface

	private int income;
	private int spending;
	private int profit;
	private int tprice;
	    
	public Finance(String name, String service, int price, int time, int person, int income, int spending, int profit, int tprice){
		   //Constructor with nine arguments		
	       super(name, service, price, time, person);  										
	       this.income = income;
	       this.spending = spending;
	       this.profit = profit;
	       this.tprice = tprice;
	       				
	       Payments daily = new totalPayment();//2.5 Interface
	       System.out.println("\n\t<<" + name + "'s Sales Department>>");
	       System.out.println("\t\tXymaxx Restaurant Sales Record");
	       System.out.println("\t\tAverage Daily Sales: RM" + daily.getPayment());
	       System.out.println("\t\tAverage Monthly Profit: RM" + daily.getPayment(income,spending));
	    }
		//2.2 Polymorphism
		public void printInfo(){ 
    	System.out.println("#" + super.getService() + " is updated every last day of a month.");
    	}
		//2.3 Encapsulation
	    public void setIncome(int income) {
			this.income = income;
		}
		
		public void setSpending(int spending) {
			this.spending = spending;
		}
		
		public void setProfit(int profit) {
			this.profit = profit;
		}
		
		public void settPrice(int tprice) {
			this.tprice = tprice;
		}
		
		public int getIncome() {
			return income;
		}
		
		public int getSpending() {
			return spending;
		}
		
		public int getProfit() {
			return profit;
		}
		
		public int gettPrice() {
			return tprice;
		}
		
		@Override
		public int getPayment() {//2.5 Interface
			
			return spending;
		}
		@Override
		public int getPayment(int person, int price) {//2.5 Interface
			
			return person*price*25;
		}
		
		
		public int TotalProfit() {//Overloading with no argument
			return (tprice*1/5);//one customer
		}
		
		public int TotalProfit(int customerN) {//Overloading with one argument
			return (tprice*customerN)-((tprice*4/5)*customerN);//a day
		}
		
		public int TotalProfit(int customerN, int day) {//Overloading with two arguments
			return (tprice*customerN*day) - spending;
		}
		
		public void calcProfit() {
			Scanner scan = new Scanner(System.in);
			System.out.println("\n\t##Profit Calculations##");
			System.out.println("Insert total income for the month\t: RM");
			int tI = scan.nextInt();
			System.out.println("Insert total spending for the month\t: RM");
			int tS = scan.nextInt();
			int tP = tI - tS;
			System.out.println(	"\nTotal Income(a month)\t: RM" + tI +
								"\nTotal Spending(a month)\t: RM" + tS);
			if(tP>0) {
				System.out.println("Total Profit(a month)\t: RM" + tP);
				System.out.println("Xymaxx Restaurant is making profit this month."
								 + "\nKeep on the great work!");
			}else if (tP<0) {
				System.out.println("Total Profit(a month)\t: RM" + tP);
				System.out.println("Xymaxx Restaurant is facing loss this month."
								 + "\nSome changes or upgrade is needed.");
			}else if (tP==0) {
				System.out.println("Total Profit(a month)\t: RM" + tP);
				System.out.println("Xymaxx Restaurant do not have net income for this month."
								 + "\nMaybe there are some problems in our restaurant management and operation.");
			}
		}
	  	//Overriding
	  	public String toString() {									
	  	  return super.toString() + 
	  			  	"\n\nService: <<Xymaxx Restaurant's Financial Status>>" +
					"\nTotal income for a month(estimated)\t\t: RM" + income +
					"\nTotal income for a month\t\t\t: RM" + getPayment(1000,150) +//TotalIncome(1000) +
					"\nTotal spending for a month(estimated)\t\t: RM" + spending +
					"\nTotal spending for a month\t\t\t: RM" +  getPayment() +//TotalSpending() + 
					"\nProfit(one customer)\t\t\t\t: RM" + TotalProfit() +
					"\nProfit(a day-estimated)\t\t\t\t: RM" + TotalProfit(100) + 
					"\nTotal Profit for a month(estimated)\t\t: RM" + profit +
					"\nTotal Profit for a month\t\t\t: RM" + TotalProfit(1000, 25);

	  	}

}
