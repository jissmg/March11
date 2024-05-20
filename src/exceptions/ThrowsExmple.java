package exceptions;

import java.io.IOException;
import java.nio.file.InvalidPathException;
import java.nio.file.Paths;
import java.util.Scanner;

public class ThrowsExmple {

	public static void readFile() throws IOException,InvalidPathException {
		
		Scanner sc = new Scanner(Paths.get("C:\\Test\\Instructions.txt"));
		
		while (sc.hasNextLine()) {
			System.out.println(sc.nextLine());
		}
	}
	
	public static void printValue(String s) throws Exception {
		
		if(s==null) {
			throw new Exception("We do not handle null values");
		}else {
			System.out.println(s);
		}
	}
	
	public void checkPin(int pin) throws Exception {
		if(pin!=1234) {
			throw new Exception("Invalid credentials");
		}else {
			//perform transaction
			System.out.println("Welcome user");
		}
		
	}
}