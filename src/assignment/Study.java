package assignment;

import java.util.Scanner;

public class Study {
	public int numberOfSyllables(String word) {
		String[] syllables=word.split("-");
		return syllables.length;
	}
	public String grabCity(String vacationSpot) {
		if((vacationSpot.contains("["))&&(vacationSpot.contains("]"))){
		int startIndex=vacationSpot.indexOf('[');
		int endIndex=vacationSpot.indexOf(']');
		if(endIndex > startIndex) {
			String city=vacationSpot.substring(startIndex+1, endIndex);
			return city;
		}
		
		}
		return "";
	}
}
