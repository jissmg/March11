package comparisionOperaters;

public class Comparision {
		int a = 15;
		int b = 10;
		boolean result = false;

		public void isAGreaterThanB() {
			result = a > b;
			System.out.println("Is A Greater Than B  :" + result);
		}

		public void isLessThanB() {
			result = a < b;
			System.out.println("Is A Less Than B  :" + result);
		}

		public void isAGreaterThanOrEqualToB() {
			result = a >= b;
			System.out.println("Is A Greater Than or Equal to B  :" + result);
		}

		public void isALessThanOrEqualToB() {
			result = a <= b;
			System.out.println("Is A Less Than or Equal to B  :" + result);
		}

		public void compareTwoNumbers() {
			result = a == b;
			System.out.println("Is A equal to B: " + result);

		}

		public void compareTwoNumbersEqualOrNot() {
			result = a != b;
			System.out.println("Is A notequal to B: " + result);

		}

}
