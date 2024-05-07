package inheritance;

public class Appliances {
	private String num;
	String defaultValue;
	public String getDefaultValue() {
		return defaultValue;
	}
	public void setDefaultValue(String defaultValue) {
		this.defaultValue = defaultValue;
	}
	public String getNum() {
		return num;
	}
	protected String name;
	protected String modelNumber;
	protected double price;
	//double rating;
	//String[] comment;
	Reviews customerReview;
	
	public Appliances() {
		
	}
	public Appliances(String name, String modelNumber, double price) {
		super();
		this.name = name;
		this.modelNumber = modelNumber;
		this.price = price;
	}
	
	public void displayCustomerReviews() {
		System.out.println("Display customer reviews");
		
	}
	public void checkOffer() {
		System.out.println("Check Offer");
		
	}
	public void displaySpecification() {
		System.out.println("Display Specification of "+name);
		
	}
	public void setNum(String num) {
		this.num = num;
	}
	
}
