package assignmentOopsPart2;

public abstract class BankOperations {
    private double balance;

    public BankOperations(double initialDeposit) {
        this.balance = initialDeposit;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit of $" + amount + " successful.");
            displayBalance();
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal of $" + amount + " successful.");
            displayBalance();
        } else {
            System.out.println("Insufficient funds or invalid withdrawal amount.");
        }
    }

   final public void viewBalance() {
        System.out.println("Current Balance: $" + balance);
    }

    public abstract void changePinPassword(String oldPinPassword, String newPinPassword);

    private void displayBalance() {
        viewBalance();
    }
}