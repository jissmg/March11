package assignment;

import java.util.Scanner;

public class Study {
	public int numberOfSyllables(String word) {
		String[] syllables=word.split("-");
		return syllables.length;
	}
	public String grabCity(String vacationSpot) {
	    int lastIndexOpenBracket = vacationSpot.lastIndexOf('[');  // Find the index of the last '['
	    int lastIndexCloseBracket = vacationSpot.lastIndexOf(']'); // Find the index of the last ']'

	    // Check if both '[' and ']' are found and '[' comes before ']'
	    if (lastIndexOpenBracket != -1 && lastIndexCloseBracket != -1 && lastIndexOpenBracket < lastIndexCloseBracket) {
	        // Extract the city name between the last '[' and ']'
	        String city = vacationSpot.substring(lastIndexOpenBracket + 1, lastIndexCloseBracket);
	        return city.trim(); // Trim to remove any leading/trailing whitespace
	    }

	    // Return an empty string if no valid city name is found in the last square brackets
	    return "";
	}
}
