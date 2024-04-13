package productDiscount;

public class DiscountMain {

	public static void main(String[] args) {
		DiscountOnAProduct dp=new DiscountOnAProduct();
		dp.actualValue=1000;
		//dp.promo="Promo5";
		dp.productDiscount();
		dp.promo="Promo5";

	}

}
