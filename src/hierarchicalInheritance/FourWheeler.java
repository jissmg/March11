package hierarchicalInheritance;

public class FourWheeler extends Vehicle {

	  double increasePriceBy = 1; // 1 times

	  public void finalPrice() {
	    basePrice = basePrice + (basePrice * increasePriceBy);
	    System.out.println(
	      "After modification, The price of car is: Rs." + basePrice
	    );
	  }
	}
