package aMissionLToTheMars;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Simulation {

	public ArrayList<Item> loadItems(String filename) throws FileNotFoundException {
		ArrayList<Item> items = new ArrayList<>();
		File file = new File(filename);
		Scanner scanner = new Scanner(file);
		while (scanner.hasNextLine()) {
			String line = scanner.nextLine();
			String[] parts = line.split("=");
			String name = parts[0].trim();
			int weight = Integer.parseInt(parts[1].trim());
			items.add(new Item(name, weight));
		}
		scanner.close();
		return items;
	}

	public ArrayList<R1> loadU1(ArrayList<Item> items) {
		ArrayList<R1> rockets = new ArrayList<>();
		R1 rocket = new R1();

		for (Item item : items) {
			if (rocket.canCarry(item)) {
				rocket.carry(item);
			} else {
				rockets.add(rocket);
				rocket = new R1();
				rocket.carry(item);
			}
		}
		rockets.add(rocket);
		return rockets;
	}

	public ArrayList<R2> loadU2(ArrayList<Item> items) {
		ArrayList<R2> rockets = new ArrayList<>();
		R2 rocket = new R2();

		for (Item item : items) {
			if (rocket.canCarry(item)) {
				rocket.carry(item);
			} else {
				rockets.add(rocket);
				rocket = new R2();
				rocket.carry(item);
			}
		}
		rockets.add(rocket);
		return rockets;
	}

	public int runSimulation(ArrayList<? extends Rocket> rockets) {
		int totalBudget = 0;

		for (Rocket rocket : rockets) {
			totalBudget += rocket.getCost();
			while (!rocket.launch() || !rocket.landing()) {
				totalBudget += rocket.getCost();
			}
		}

		return totalBudget;
	}
}