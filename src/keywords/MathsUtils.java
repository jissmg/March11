package keywords;

public class MathsUtils {

	final double pi = 3.14;
	double g = 9.8;
	

	
	//Final method cannot be overridden
	
	final public void finalmethod() {
		System.out.println("Inside final method ");
		
		String s = "keyword";
		
		System.out.println(s.substring(0,3));
	}
	
	final public void finalmethod(String a) {
		System.out.println("overloaded finalmethod : "+a);
	}

	 public void add(int a, int b) {
		int sum = a+b;
		System.out.println("Sum : "+sum);
	}
	
}