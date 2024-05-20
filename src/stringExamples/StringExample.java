package stringExamples;

import java.util.Scanner;

public class StringExample {

	public static void main(String[] args) {

		String[] capitalCities = { "Toronto", "QubecCity", "Winnipeg", "Victoria", "Edmonton", "Halifax", "Regina" };

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter city name");
		String cityName = sc.next();

//		boolean isCityACapital;

		for (int i = 0; i < capitalCities.length; i++) {
			if (capitalCities[i].equals(cityName)) {
				System.out.println("This is a capital city");
				break;
			} else {
				System.out.println("This is not a capital city");
			}
		}
	}

}
