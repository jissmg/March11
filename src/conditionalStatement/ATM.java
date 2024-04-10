package conditionalStatement;

public class ATM {
	double balance;
	double overdraftAmount;
	int withdrawalAmount;
	int enteredPin;
	boolean isPinValid;
	int actualPin;
	//balance>amount entered:(or)overdraft amount>amount entered: customer can withdraw the money
	//balance<amount entered: customer cannot withdraw the amount
	//if
		void withdrawMoneyFromAtm() {
			boolean isBalanceEnough=(balance>withdrawalAmount) || overdraftAmount >withdrawalAmount;
			if(isBalanceEnough) {
				System.out.println("Customer can Withdraw The Money");
				
			} else {
				System.out.println("Customer does not have enough balance");
			}
		}
		
		void validatePinAndWithdrawMoney() {
			isPinValid = enteredPin==actualPin;
			if(isPinValid) {
			System.out.println("Pin Is Correct");
			//condition to validate the withdrawal amount
			if(balance>withdrawalAmount) {
				System.out.println("Customer can Withdraw The Money");
				
			} else {
				System.out.println("Customer does not have enough balance");
			}
		}
		}
}
		
