package A1;

public class restauranttDescription extends Restaurant {//2.1 Inheritance
	
	private String food;
	private String beverage;
	private String desserts;
	private String about;
	private String features;
	private String meals;
	private String location;
	private String operation;
	private String phoneNumber;
    
    
    public restauranttDescription(String name, String service, String food, String beverage, String desserts, String about, String features, String meals, String location, String operation, String pNumber){ 		
       super(name,service);  							
       this.food = food;
       this.beverage = beverage;
       this.desserts = desserts;
       this.about = about;
       this.features = features;
       this.meals = meals;
       this.location = location;
       this.operation = operation;
       this.phoneNumber = pNumber;
       							
     }
    //2.2 Polymorphism
    public void printInfo(){ 
    	System.out.println("#Please refer to <<" + super.getService() + ">> to know better about Xymaxx Restaurant!");
    }
  	//about restaurant
    public String restaurants() {//Constructor with no argument
    	return "\n\tXymaxx Restaurant provides Malaysian Tradisional dishes such as:"
    			+ "\n\t\t Rendang from the Malay"
    			+ "\n\t\t Char Kway Teow from the Chinese"
    			+ "\n\t\t Roti Canai from the Indian"
    			+ "\n\t#Menu change according to theme everyday, let's taste Malaysia!";
    }
	
	public String restaurants(String f) {//Constructor with one argument
    	return "\n\tXymaxx Restaurant only serves Malaysian traditional dishes and foods such as " + f + " which is wellknown all around the world!";
    }
    
    public String restaurants(String b, String d) {//Constructor with two argument
    	return "\n\tXymaxx Restaurant also serves Malaysian traditional drinks and desserts such as " + "\n\t\t" +
    			b + " which known as Malaysia's national drinks and " + "\n\t\t" + 
    			d + " which is one of the classic street food snack in Malaysia!";
    }
   
    //2.3 Encapsulation
    public void setFood(String food) {
		this.food = food;
	}
    
    public void setBeverage(String beverage) {
		this.beverage = beverage;
	}
    
    public void setDesserts(String desserts) {
		this.desserts = desserts;
	}
	
	public void setAbout(String about) {
		this.about = about;
	}
	
	public void setFeatures(String features) {
		this.features = features;
	}
	
	public void setMeals(String meals) {
		this.meals = meals;
	}
	
	public void setLocation(String location) {
		this.location= location;
	}
	
	public void setOperation(String operation) {
		this.operation = operation;
	}
	
	public void setPhonenumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	public String getFood() {
		return food;//Nasi lemak
	}
	
	public String getBeverage() {
		return beverage;//Teh tarik
	}
	
	public String getDesserts() {
		return desserts;//Apam balik
	}
	
	public String getAbout() {
		return about;//locally and trusted suppliers
	}
	
	public String getFeatures() {
		return features;//American Express, Mastercard, Visa, credit card and mobile payment
	}
	
	public String getMeals() {
		return meals;//brunch, food, desserts and drinks 
	}
	
	public String getOperation() {
		return operation;//Buffet Restaurant
	}
	
	public String getLocation() {
		return location;//Pulau Langkawi
	}
	
	public String getPhonenumber() {
		return phoneNumber;//0123456789
	}
  	
  	public String toString() { 
  	  return super.toString() + 
  			"\n\t<<Xymaxx Restaurant>> is welcoming you to Malaysia!" + 
  			"\n\tType of operation \t: " + operation +
  			"\n\tLocation \t\t: " + location +
  			"\n\tContact number \t\t: " + phoneNumber +
  			"\n\tMust try food \t\t: " + food +
  			"\n\tMust try beverage \t: " + beverage + 
  			"\n\tMust try desserts \t: " + desserts +
  			"\n\tAbout our restaurant:" + restaurants() + 
  			restaurants("NASI LEMAK") + 
  			restaurants("TEH TARIK","AIS KACANG") + 
  			"\n\nMore details about Xymaxx Restaurant\t:" +
			"\n\t1. Xymaxx Restaurant mainly use the ingredients sourced from " + about + " to the extent possible!" +
			"\n\t2. Xymaxx Restaurant brings a brilliant taste of Malaysian traditional culinary and beverage to offer a quality " + meals +"to the customers!" +
			"\n\t3. Xymaxx Restaurants accepts " + features + ".";
  	}
}
