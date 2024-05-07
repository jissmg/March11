package assignmentOopsPart2;

import java.util.Scanner;

public class OnlineBanking extends BankOperations {
    private String onlineBankingPassword;

    public OnlineBanking(double initialDeposit, String onlineBankingPassword) {
        super(initialDeposit);
        this.onlineBankingPassword = onlineBankingPassword;
    }

    @Override
    public void changePinPassword(String oldPassword, String newPassword) {
        if (!newPassword.equals(oldPassword) && newPassword.length() >= 8 && !containsSpecialCharacters(newPassword)) {
            this.onlineBankingPassword = newPassword;
            System.out.println("Password changed successfully.");
        } else {
            System.out.println("Invalid new password. Please choose a different password of at least 8 characters and without special characters (&,$,@).");
        }
    }

    private boolean containsSpecialCharacters(String password) {
        return password.contains("&") || password.contains("$") || password.contains("@");
    }

    public void performTransaction() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter online banking password: ");
        String enteredPassword = scanner.nextLine();

        if (validatePassword(enteredPassword)) {
            System.out.println("Choose operation:");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter deposit amount: $");
                    double depositAmount = scanner.nextDouble();
                    deposit(depositAmount);
                    break;
                case 2:
                    System.out.print("Enter withdrawal amount: $");
                    double withdrawAmount = scanner.nextDouble();
                    withdraw(withdrawAmount);
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        } else {
            System.out.println("Invalid password. Transaction aborted.");
        }
    }

    private boolean validatePassword(String enteredPassword) {
        return enteredPassword.equals(onlineBankingPassword);
    }
}