package assignmentOopsPart3;
public class ATM extends BankingRules implements BankOperations {
    private double balance;
    private int pin;

    public ATM(double initialDeposit, int pin) {
        this.balance = initialDeposit;
        this.pin = pin;
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: $" + amount);
        displayBalance();
    }

    @Override
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: $" + amount);
            displayBalance();
        } else {
            System.out.println("Insufficient funds. Please deposit.");
        }
    }

    @Override
    public void viewBalance() {
        displayBalance();
    }

    @Override
    public void changePinPassword(String oldPin, String newPin) {
        if (!newPin.equals(oldPin) && newPin.length() >= 4) {
            this.pin = Integer.parseInt(newPin);
            System.out.println("PIN changed successfully.");
        } else {
            System.out.println("Invalid new PIN. Please choose a different PIN of at least 4 characters.");
        }
    }

    @Override
    public int getDailyWithdrawalLimit() {
        return 1000; // Example: Set daily withdrawal limit for ATM
    }

    @Override
    public int getMaxTransactionsAllowed() {
        return 5; // Example: Set max transactions allowed for ATM
    }

    private void displayBalance() {
        System.out.println("Current Balance: $" + balance);
    }
}

