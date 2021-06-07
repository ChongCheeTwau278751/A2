package A1;

public class advertisement_marketing extends Restaurant {//2.1 Inheritance
	
	private String aMethod;
	private String mMethod;
    
    public advertisement_marketing(String name, String service, String aMethod, String mMethod){ 		
       super(name, service);  
       this.aMethod = aMethod;
       this.mMethod = mMethod;							
     }
    //2.2 Polymorphism
    public void printInfo(){ 
    	System.out.println("#" + super.getService() + " meet the latest social media trends and development.");
    	}
  	//2.3 Encapsulation
    public void setMMethod(String mMethod) {
		this.mMethod = mMethod;	
	}
	
	public void setAMethod(String aMethod) {
		this.aMethod = aMethod;	
	}
	
	public String getMMethod() {
		return mMethod;
	}
	
	public String getAMethod() {
		return aMethod;
	}
	
	
	public String Uniqueness() {//Constructor with no argument
		return "\nKnown as restaurant with buffet service where all the food provided is Malaysian Tradisional Dishes!";
	}
	
	public String Uniqueness(int u) {//Constructor with one argument
		return "\nWelcome to taste Malaysia at only RM " + u + "per person(1 hour)!";//RM150
	}
	
	public String Uniqueness(String cn, String web) {//Constructor with two argument
		return "\nPlease call " + cn + " or visit our official website " + web + " for reservation(only 50 table is reserved a day!)";//0123456789, website
	}
    
  	public String toString() { 
  	  return super.toString() + 
			"\nXymaxx Restaurant's marketing method: " + mMethod +
			"\nCheck more about Xymaxx Restaurant on: " + aMethod +
			"\nXymaxx Restaurant's uniqueness:\n" +
			Uniqueness() +
			Uniqueness(150) + 
			Uniqueness("0123456789", "www.xymaxxrestaurant.com");

  	}
}
