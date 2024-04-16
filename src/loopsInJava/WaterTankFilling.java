package loopsInJava;

import java.util.Scanner;

public class WaterTankFilling {
	/*
	 * There is a water tank of capacity 100 litres. Water is filled into it using
	 * bucket which have capacity of 10 litres. Write a program which fills the tank
	 * to its capacity using these buckets. Also include a mechanism in your program
	 * to stop the tank from over flowing.
	 */
	void WaterTankFillingUsingBucket() {
		double bucketCapacity = 10;
		double tankCapacity = 100;
		double bucketsUsed = 0;
		double totalWaterFilled = 0;
		double tankLevel = 0;

		Scanner scanner = new Scanner(System.in);

		for (double i = 0; i <= tankCapacity; i = 1 + 1) {
			System.out.println("Current water level in tank: " + tankLevel + " litres");
			System.out.print(	"Enter the amount of water in the bucket (0 to " + bucketCapacity + " litres, -1 to stop): ");
			double waterInBucket = scanner.nextDouble();
			if (waterInBucket == -1) {
				System.out.println("Stopping the process.");
			}
			if ((waterInBucket <= 0) || (waterInBucket > bucketCapacity)) {
				System.out.println("Invalid input. Please enter a value between 0 and " + bucketCapacity + " litres.");
			}

			double spaceLeftInTank = tankCapacity - tankLevel;
			double waterToAdd;
			if (spaceLeftInTank < bucketCapacity) {
				waterToAdd = spaceLeftInTank;
			} else {
				waterToAdd = waterInBucket;
			}

			tankLevel += waterToAdd;
			totalWaterFilled += waterToAdd;
			bucketsUsed++;

			System.out.println("Filling the tank with " + waterToAdd + " litres from the bucket.");

			if (tankLevel == tankCapacity) {
				System.out.println("Tank is full.");
				break;
			}
		}

		System.out.println("Tank filled with " + tankLevel + " litres of water using " + bucketsUsed + " buckets.");
		System.out.println("Total water filled: " + totalWaterFilled + " litres.");

	}
}
