package assignmentOopsPart2;

import assignmentOopsPart1.Person;

public class Main {
    public static void main(String[] args) {
        // Create a person with account details
        Person person = new Person("123456789", "Jis George", 10000, 2255, "Mypass");

        // Create instances of ATM and OnlineBanking
        ATM atm = new ATM(person.getTotalFundsAvailable(), person.getPin());
        OnlineBanking onlineBanking = new OnlineBanking(person.getTotalFundsAvailable(), person.getOnlineBankingPassword());

        // Change PIN/password using ATM and OnlineBanking
        atm.changePinPassword("2255", "2568"); 
        onlineBanking.changePinPassword("Mypass", "Mynewpass"); 
    }
}
