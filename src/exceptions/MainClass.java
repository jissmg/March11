package exceptions;

import java.io.IOException;
import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc =null;
		try {
			sc = new Scanner(System.in);
			ThrowsExmple.readFile();
		}catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			sc.close();
		}
		
	}

}