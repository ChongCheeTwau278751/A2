package A1;

public class inventory_employeeManagement extends Restaurant {//2.1 Inheritance
	
	private String enquiries;
	private String employeeType;
    
    public inventory_employeeManagement(String name, String service, String enquiries, String employeeType){ 			
       super(name,service);  										
       this.enquiries = enquiries;
       this.employeeType = employeeType;
       								
     }
    //2.2 Polymorphism
    public void printInfo(){ 
    	System.out.println(super.getService() + " expressing our warm welcome in advance! Welcome to join us!");
    }
  	//2.3 Encapsulation
    public void setEnquiries(String enquiries) {
		this.enquiries = enquiries;
	}
	
	public void setEmloyeeType(String employeetype) {
		this.employeeType = employeetype;
	}
	
	public String getEnquiries() {
		return enquiries;
	}
	
	public String getEmloyeeType() {
		return employeeType;
	}
  	
	public String RestaurantData() {//Constructor with no argument
		return "\nXymaxx Restaurant only accept 50 online reservations a day as the number of tables is limited! Be quick!";
	}
	
	public String RestaurantData(int tN) {//Constructor with one argument
		return 	"\nTotal number of tables\t\t\t: " + tN;
	}
	
	public String RestaurantData(int r, int a) {//Constructor with two argument
		return 	"\nTotal number of current employees\t: " + r + 
				"\nTotal number of employees needed\t: " + a;
	}
  	
  	public String toString() {									
  	  return super.toString() +  
			"\nPlease contact us for works enquiries\t: " + enquiries +
			"\nXymaxx Restaurant do accept " + employeeType + " worker(s). " +
			"\nReservation:" +
			RestaurantData() + 
			RestaurantData(100) +
			RestaurantData(10,30);

  	}
	
}
