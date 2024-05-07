package assignmentOopsPart3;

public class Person {
    private String accountNumber;
    private String accountHolderName;
    private BankOperations bankingService;

    public Person(String accountNumber, String accountHolderName, BankOperations bankingService) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.bankingService = bankingService;
    }

    public void performTransaction(int choice, double amount) {
        if (bankingService != null) {
            switch (choice) {
                case 1:
                    bankingService.deposit(amount);
                    break;
                case 2:
                    bankingService.withdraw(amount);
                    break;
                case 3:
                    bankingService.viewBalance();
                    break;
                case 4:
                    // Change PIN or Password
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}