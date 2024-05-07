package assignmentOopsPart3;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Banking System!");

        System.out.print("Enter account number: ");
        String accountNumber = scanner.next();
        System.out.print("Enter account holder name: ");
        String accountHolderName = scanner.next();

        System.out.print("Choose banking service (1 for ATM, 2 for Online Banking): ");
        int choice = scanner.nextInt();

        BankOperations bankingService;
        if (choice == 1) {
            System.out.print("Enter initial deposit for ATM: $");
            double initialDeposit = scanner.nextDouble();
            System.out.print("Enter PIN: ");
            int pin = scanner.nextInt();
            bankingService = new ATM(initialDeposit, pin);
        } else if (choice == 2) {
            System.out.print("Enter initial deposit for Online Banking: $");
            double initialDeposit = scanner.nextDouble();
            System.out.print("Create password (at least 8 characters without &,$,@): ");
            String password = scanner.next();
            bankingService = new OnlineBanking(initialDeposit, password);
        } else {
            System.out.println("Invalid choice. Exiting...");
            return;
        }

        Person person = new Person(accountNumber, accountHolderName, bankingService);

        while (true) {
            System.out.println("Choose operation:");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. View Balance");
            System.out.println("4. Exit");

            int operation = scanner.nextInt();
            if (operation == 4) {
                System.out.println("Exiting...");
                break;
            }

            System.out.print("Enter amount: $");
            double amount = scanner.nextDouble();
            person.performTransaction(operation, amount);
        }

    }
}