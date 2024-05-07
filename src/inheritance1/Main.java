package inheritance1;

import inheritance.Appliances;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Appliances app=new Appliances(); 
		//AirFryer airFryer=new AirFryer("Air Fryer","ggsjhg56",70);
	//	airFryer.displaySpecification();
		Macbook mac=new Macbook();
		mac.orderAdditionalMemory();
		mac.displayCustomerReviews();
		mac.displaySpecification();
	}

}
