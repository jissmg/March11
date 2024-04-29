package assignment;

public class Stringmethod {
	
	public int numberSyllables(String word) {
		String[] syllables= word.split("-");
		return syllables.length;
	}
	
	public String grabCity(String vacationSpot) {
        if (vacationSpot.contains("[") && vacationSpot.contains("]")) {
            int startIndex = vacationSpot.lastIndexOf('[');//indexOf will take everything inside[]
            int endIndex = vacationSpot.lastIndexOf(']');
            if (endIndex > startIndex) {
                String city = vacationSpot.substring(startIndex + 1, endIndex);
                return city;
            }
        }
		return "";
	}
	
	public String removeFirstLast(String str) {
        if (str.length() >= 2) {
            return str.substring(1, str.length() - 1);
        } else {
            return str;
        }
    }
	
	public String nameShuffle(String fullName) {
        String[] nameParts = fullName.split(" ");
        if (nameParts.length == 2) {
            // Swap the first and last name
            String firstName = nameParts[0];
            String lastName = nameParts[1];
            return lastName + " " + firstName;
        } else {
            //  if input doesn't contain exactly two parts
            return fullName; 
        }
    }
	
	public boolean isPrefix(String word, String prefix) {
        if (prefix != null && !prefix.isEmpty()) {
            return word.startsWith(prefix);
        }
        return false;
    }

    public boolean isSuffix(String word, String suffix) {
        if (suffix != null && !suffix.isEmpty()) {
            return word.endsWith(suffix);
        }
        return false;
    }
}
       

	
