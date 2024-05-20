package learnEncapsulation;

public class AccountDetailsMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AccountDetails swaroopAcct = new AccountDetails("456789123", 7890, 1234.56);
		
		System.out.println("Account Number: "+swaroopAcct.getAccountNumber(7890));

		swaroopAcct.setBalance(1234, 1234);
		
		System.out.println("New Balance :"+swaroopAcct.getBalance());
		
	}

}
