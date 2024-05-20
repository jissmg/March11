package exceptions;

import java.io.IOException;
import java.nio.file.InvalidPathException;
import java.nio.file.Paths;
import java.util.Scanner;

public class CheckedExceptionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			//Try block
			Scanner sc = new Scanner(Paths.get("C:\\Test\\Instructions.txt"));
			
			while (sc.hasNextLine()) {
				System.out.println(sc.nextLine());
			}
		}catch(InvalidPathException  inve) {
			inve.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Continue to execute our code after exception block ");
	}

}