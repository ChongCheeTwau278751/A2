package A1;

public abstract class Restaurant {//2.4 abstraction
//super class
	private String name;
	private String service;
    
    	public Restaurant(String name, String service){//constructor with 2 arguments 	//Xymaxx Restaurant
    	this.name = name;
    	this.service = service;
    }
    	//2.3 Encapsulation
    	public String getName(){
    	    return this.name;
    	}
    	
    	public String getService(){
    	    return this.service;
    	}
    	//2.2 Polymorphism
    	public void printInfo(){
    	    System.out.println("");
    	}
    	
    	public String toString(){ 
    		return name + 
    			"\nDepartments of Xymaxx Restaurant" + 
    			"\nService: \t\t <<" + service + ">>";

    	}

}
