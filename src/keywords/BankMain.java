package keywords;

public class BankMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Account account = new Account();
		account.fullName="Ravneet Kaur";
		account.accountNumber="868699696";
		System.out.println("Account number : "+account.accountNumber);
		System.out.println("Account holder name :"+account.fullName);
		
		System.out.println("------------------------");
		
		Account account2 = new Account();
		account2.fullName="Annena PV";
		account2.accountNumber="32234232";
		System.out.println("Account number : "+account2.accountNumber);
		System.out.println("Account holder name :"+account2.fullName);
	}

}