package assignmentOopsPart3;
public class OnlineBanking extends BankingRules implements BankOperations {
    private double balance;
    private String password;

    public OnlineBanking(double initialDeposit, String password) {
        this.balance = initialDeposit;
        this.password = password;
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
    public void changePinPassword(String oldPassword, String newPassword) {
        if (!newPassword.equals(oldPassword) && newPassword.length() >= 8 && !newPassword.matches(".*[&$@].*")) {
            this.password = newPassword;
            System.out.println("Password changed successfully.");
        } else {
            System.out.println("Invalid new password. Please choose a different password of at least 8 characters without special characters.");
        }
    }

    @Override
    public int getDailyWithdrawalLimit() {
        return 2000; // Example: Set daily withdrawal limit for Online Banking
    }

    @Override
    public int getMaxTransactionsAllowed() {
        return Integer.MAX_VALUE; // Unlimited transactions allowed for Online Banking
    }

    private void displayBalance() {
        System.out.println("Current Balance: $" + balance);
    }
}