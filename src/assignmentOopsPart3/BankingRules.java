package assignmentOopsPart3;

public abstract class BankingRules {
    protected int maxAttempts = 3;
    protected int attempts = 0;

    public abstract int getDailyWithdrawalLimit();
    public abstract int getMaxTransactionsAllowed();

    public void incrementAttempts() {
        attempts++;
    }

    public boolean isAccountLocked() {
        return attempts >= maxAttempts;
    }

    public void resetAttempts() {
        attempts = 0;
    }
}