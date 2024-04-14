package loopsInJava;

import java.util.Scanner;

public class Amusementpark {
	int height;
	Scanner sc = new Scanner(System.in);

	void helpTheOperatorForFillingRide() {
		for (int i = 1; i <= 10; i++) {
			System.out.println("Enter height of the rider: ");
			height = sc.nextInt();
			if ((height >= 90) && (height <= 200)) {
				System.out.println("You are allowed to get into the ride!!!!!");
			} else {
				System.out.println("Sorry you didn't meet the height criteria! ");
				i = i - 1;
			}
		}
		System.out.println("Sorry Only 10 peoples are allowed, Please choose the next round");
	}

}
