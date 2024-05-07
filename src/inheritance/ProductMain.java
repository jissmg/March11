package inheritance;

import inheritance1.AirFryer;
import inheritance1.Laptop;

public class ProductMain {

	public static void main(String[] args) {
		Appliances laptop=new Appliances("Asuse Laptop","34255666",900);
		AirFryer airfryer= new AirFryer();
		laptop.displaySpecification();
		
		Laptop hpLaptop=new Laptop();
		hpLaptop.name="HP laptop";
		hpLaptop.modelNumber="fsfd345";
		hpLaptop.price=900;
		System.out.println("Display price:"+hpLaptop.price);
		hpLaptop.displayCustomerReviews();
		hpLaptop.displaySpecification();
		airfryer.name="Air Fryer";
		airfryer.modelNumber="90189";
		airfryer.price=70;
		airfryer.displaySpecification();
		WashingMachine wash=new WashingMachine();
		wash.setNum("10");
		Reviews customerReviewWm=new Reviews();
		wash.customerReview.setRating(3.5);
		String[] comments= {"good product","not nice"};
		customerReviewWm.setRating(3.5);
		customerReviewWm.setComments(comments);
		wash.customerReview=customerReviewWm;
		wash.displayCustomerReviews();
		
	}

	
}
