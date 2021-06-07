package A1;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
		restauranttDescription rd = new restauranttDescription("\n||Xymaxx Restaurant||", "Xymaxx Restaurant's Description", "Nasi Lemak", "Teh Tarik", "Ais Kacang", "locally and trusted suppliers", "American Express, Mastercard, Visa, credit card and mobile payment", "brunch, food, desserts and drinks ", "Pulau Langkawi" , "Buffet", "0123456789");
		System.out.println(rd);
		rd.printInfo();
		System.out.println();
	
		
		advertisement_marketing am = new advertisement_marketing("\n||Xymaxx Restaurant||", "Xymaxx Restaurant's Advertisement and Marketing Method", "\n\tFacebook\t(Xymaxx Restaurant) \n\tInstagram\t(Xymaxx_Restaurant) \n\tTwitter\t\t(XymaxxRestaurant)", "Buffet Restaurant");
		System.out.println(am);
		am.printInfo();
		System.out.println();
		
		
		menuDescription md = new menuDescription("||Xymaxx Restaurant||", "Xymaxx Restaurant's Menu and Theme Description", "Malaysian Tradisional dishes");
		System.out.println(md);
		md.printInfo();
		System.out.println();
		
		inventory_employeeManagement m = new inventory_employeeManagement("||Xymaxx Restaurant||", "Xymaxx Restaurant's Inventory and Employee Management", "xymaxx123@gmail.com/0123456789/www.xymaxxrestaurant.com","full time, part time or contract");
		System.out.println(m);
		m.printInfo();
		System.out.println();
		
		sales s = new sales("Xymaxx Restaurant", "Sales and Customer Management System", 150, 60, 1);
		System.out.println(s);
		s.printInfo();
		s.getPayment();//interface
		System.out.println();
		
		
		Finance f = new Finance("Xymaxx Restaurant", "<<Xymaxx Restaurant's Financial Management>>", 150, 60, 1, 2500000, 1250000, 1250000, 150);
		System.out.println(f);
		f.printInfo();
		f.calcProfit();//interface
		System.out.println();
	}

}
