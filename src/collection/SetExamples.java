package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet<String> cities = new HashSet<String>();
		
		cities.add("Toronto");
		
		cities.add("Brampton");
		
		cities.add("Mississauga");

		cities.add("Caledon");

		cities.add("Markham");
		
		cities.add("Toronto");
		
		cities.add("Brampton");
		
		cities.add("Mississauga");
		
		System.out.println("Size of the list :" + cities.size());

		System.out.println(cities.toString());
			
		for(String s : cities) {
			System.out.println(s);
		}
		
		System.out.println("Does the set contain Toronto : "+cities.contains("Toronto"));
		
		
		String[] names = {"Jerin","Annena","Ravneet","Emil","Emil"};
		
		List<String> namesList = new ArrayList<String>();
		
		namesList.addAll(Arrays.asList(names));
		
		System.out.println("Names in the list :"+namesList.toString());
		
		HashSet<String> namesSet = new HashSet<String>();
		namesSet.addAll(namesList);
		
		System.out.println("Names in the set :"+namesSet.toString());
	}

}