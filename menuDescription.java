package A1;

public class menuDescription extends Restaurant {//2.1 Inheritance

	private String menu;
	
	 public menuDescription(String name, String service, String menu) {
		super(name, service);
		this.menu = menu;
	}
	
	//2.2 Polymorphism
	public void printInfo(){ 
	    System.out.println("#Soft Reminder: Don't forget to check " + super.getService() + " for hidden and mystery menu or dishes!");
	}
	
	//2.3 Encapsulation
	public void setMenu(String menu) {
		this.menu = menu;
	}
 
	public String getMenu() {
	return menu;//Malaysian Tradisional dishes
	}
	
	//about menu/dishes
    public String Description() {
    	return "\nXymaxx Restaurants have different themes everyday as shown below:"
				+ "\nMon/Wed/Fri \t: The Amazing Malaysia"
				+ "\nTue/Thur/Sat \t: The Uniqueness of Malaysia"
				+ "\nSun \t\t: The best out of the best in Malaysia";
    }
    
    public String Description(String t) {
    	return "\n#Xymaxx Restaurants will have the top ranked Malaysian Tradisional Dishes of the week on every " + t + "." ;//Sunday
    }
    
    public String Description(String m1, String m2) {
    	return "\nHighlight dishes in Menu '" + m1 + "' \t:"
				+ "\nNasi Lemak"
				+ "\nRendang"
				+ "\nRoti Canai"
				+ "\nSatay"
				+ "\nCurry Laksa"
				+ "\nChar Kuey Teow"
				+ "\n\nHighlight dishes in Menu '" + m2 +"' \t:"
				+ "\nNasi Kerabu"
				+ "\nHainanese Chicken Rice"
				+ "\nBak Kut Teh"
				+ "\nNasi Briyani"
				+ "\nRoti Tisu"
				+ "\nAis Kacang";
    }
	
    public String toString() { 
    	  return super.toString() + 
    			"\nXymaxx Restaurant serves " + menu + " without occasional excursions into other countries' ingredients and style!" +
  				Description() + 
  	  			Description("Sunday") + 
  	  			Description("The Amazing Malaysia", "The Uniqueness of Malaysia");
    }
}