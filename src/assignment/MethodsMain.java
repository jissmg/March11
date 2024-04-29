package assignment;

public class MethodsMain {

	public static void main(String[] args) {
		// Create a function that counts the number of syllables a word has. Each
		// syllable is separated with a dash
		Stringmethod sn = new Stringmethod();
		System.out.println(sn.numberSyllables("this-is"));
		System.out.println(sn.numberSyllables("my-java-program"));
		System.out.println(sn.numberSyllables("string-method-split-and-length"));
		// Write a function to return the city from each of these vacation spots.
		System.out.println(sn.grabCity("[Last Day!] Beer Festival [Munich]"));
		System.out.println(sn.grabCity("Cheese Factory Tour [Portland]"));
		System.out.println(sn.grabCity("[50% Off!][Group Tours Included] 5-Day Trip to Onsen [Kyoto]"));
		// Create a function that removes the first and last characters from a string.
		System.out.println(sn.removeFirstLast("hello"));
		System.out.println(sn.removeFirstLast("a"));
		System.out.println(sn.removeFirstLast("programming"));
		// Create a method that accepts a string (of a person's first and last name) and
		// returns a string with the first and last name swapped.
		System.out.println(sn.nameShuffle("Donald Trump"));
		System.out.println(sn.nameShuffle("Seymour Butts"));
		/*
		 * Create two functions: isPrefix(word, prefix-) and isSuffix(word, -suffix).
		 * isPrefix should return true if it begins with the prefix argument. isSuffix
		 * should return true if it ends with the suffix argument. Otherwise return
		 * false.
		 */

		System.out.println(sn.isPrefix("automation", "auto")); 
		System.out.println(sn.isPrefix("arachnophobia", "phobia")); 
		System.out.println(sn.isSuffix("automation", "tion")); 
		System.out.println(sn.isSuffix("arachnophobia", "phobia")); 

	}

}
