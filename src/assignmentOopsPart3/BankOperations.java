package assignmentOopsPart3;
public interface BankOperations {
    void deposit(double amount);
    void withdraw(double amount);
    void viewBalance();
    void changePinPassword(String oldPinOrPassword, String newPinOrPassword);
}