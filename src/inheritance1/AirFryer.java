package inheritance1;

import inheritance.Appliances;

public class AirFryer extends Appliances {
	
	
	
	
	public AirFryer(String name, String modelNumber, double price) {
		super(name, modelNumber, price);
		// TODO Auto-generated constructor stub
	}

	public AirFryer() {
		// TODO Auto-generated constructor stub
	}

	public void displaySpecification() {
		System.out.println("Display specification of "+name);
		System.out.println("Show Airfryer details");
		System.out.println("Show Warrendy details");
	}

}
