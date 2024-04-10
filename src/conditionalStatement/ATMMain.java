package conditionalStatement;

public class ATMMain {

	public static void main(String[] args) {
		ATM atm=new ATM();
		atm.balance =4567.9;
		atm.withdrawalAmount= 1000;
		atm.overdraftAmount=6000;
		atm.withdrawMoneyFromAtm();
	}

}
