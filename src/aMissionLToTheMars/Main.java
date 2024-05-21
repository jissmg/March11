package aMissionLToTheMars;

import java.io.FileNotFoundException;
import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		Simulation simulation = new Simulation();
		ArrayList<Item> items;

		try {
			items = simulation.loadItems("C:\\phase.txt");
		} catch (FileNotFoundException e) {
			System.out.println("File not found!");
			return;
		}

		ArrayList<R1> r1Fleet = simulation.loadU1(items);
		ArrayList<R2> r2Fleet = simulation.loadU2(items);

		int r1Cost = simulation.runSimulation(r1Fleet);
		int r2Cost = simulation.runSimulation(r2Fleet);

		System.out.println("Total cost for R1 fleet: $" + r1Cost + " Million");
		System.out.println("Total cost for R2 fleet: $" + r2Cost + " Million");
	}
}