package collection;

import java.util.ArrayList;
import java.util.List;

public class ListExamples {

	public static void main(String arg[]) {

	
		// Syntax of creating an arraylist
		ArrayList<String> cities = new ArrayList<String>();
		
		

		cities.add("Toronto");

		cities.add("Brampton");

		cities.add("Mississauga");

		cities.add("Caledon");

		cities.add("Markham");
		
		cities.add("Toronto");

		System.out.println("Size of the list :" + cities.size());

		for (int i = 0; i < cities.size(); i++) {

			System.out.println(cities.get(i));
		}

		cities.add("Oshawa");
		
		
		
		System.out.println("______________________________________________________-");

		cities.add(1, "Hamilton");

		for (int i = 0; i < cities.size(); i++) {

			System.out.println(cities.get(i));
		}
		
		System.out.println("Replacing Brampton with Niagara ");
		
		cities.set(2, "Niagara");
		
		
		
		for (int i = 0; i < cities.size(); i++) {

			System.out.println(cities.get(i));
		}
		
		System.out.println("search a city in the list");
		
		System.out.println("Does Oshawa exists in the list : "+cities.contains("Oshawa"));
		
		
		System.out.println("Create a sublist");
		
		List<String> sublist = cities.subList(0, 5);
		
		System.out.println("Sublist : "+sublist.toString());
		
	}
}