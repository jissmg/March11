package collection;

import java.util.HashMap;

public class MapExamples {
	
	public static void main(String arg[]) {
	
		//HashMap<KeyDataType, ValueDataType> variableName = new HashMap<KeyDataType, ValueDataType>();
		HashMap<Integer,String> students = new HashMap<Integer,String>();
		
		students.put(16, "Arshdeep Kaur");
		
		students.put(24, "Arshdeep Singh");
	
		students.put(33, "Annena PV");
		
		students.put(4, "Emil Sunny");
		
		students.put(15, "Jerin");
		
		students.put(4, "Rajinder");
		
		students.put(24, "Arshpreet Singh");
		
		
		System.out.println("Name of Roll no 4 :"+students.get(4));
		System.out.println("Name of Roll no 4 :"+students.get(24));
		
		
		
		HashMap<String,String> groceryList = new HashMap<String, String>();
		
		groceryList.put("Brar", "Paneer");
		groceryList.put("Real", "AppleJuice");
		groceryList.put("IndiaGate", "Basmati Rice");
		groceryList.put("Britannia", "Bourbon Biscuit");
		groceryList.put("SealTest","Milk");
		
		
		System.out.println(groceryList.get("Brar"));
		System.out.println(groceryList.get("Real"));
		
		
		HashMap<String, Transaction> finTransactions = new HashMap<String, Transaction>();
		
		
		
		finTransactions.put("JerinSinNumber", new Transaction("Withdrawal",500, 10000));
		
		finTransactions.put("EmilSinNumber", new Transaction("Deposit", 450, 10000));
		
		finTransactions.put("AshishSinNumber", new Transaction("FundTransfer", 3000, 7000));
		
		
		System.out.println("Print Jerin Transactions");
		
		System.out.println(finTransactions.get("JerinSinNumber").toString());
		
		System.out.println("Transaction :"+ finTransactions.get("JerinSinNumber").getType() + " Amount : "+finTransactions.get("JerinSinNumber").getAmount());
		
		System.out.println(finTransactions.get("AshishSinNumber").toString());
		
		System.out.println("Transaction :"+ finTransactions.get("AshishSinNumber").getType() + " Amount : "+finTransactions.get("AshishSinNumber").getAmount());
		
		
		
		
	}
}