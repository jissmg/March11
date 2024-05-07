package inheritance1;

import inheritance.Appliances;

public class Laptop extends Appliances {
	
	
public Laptop(String name,String modelNumber,double price) {
		super(name,modelNumber,price);
	}


public Laptop() {
	super();
}


public void displaySpecification() {
	System.out.println("Display specification of ");
	System.out.println("Show processor details");
	System.out.println("Show memory details");
}
public void orderAdditionalMemory() {
	System.out.println("Placing an order for additional memory");
}
}
