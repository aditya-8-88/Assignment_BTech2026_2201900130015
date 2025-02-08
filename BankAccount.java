abstract class BankAccount {
    protected double balance;

    public BankAccount(double balance) { this.balance = balance; }

    public void deposit(double amount) { balance += amount; }

    public abstract boolean withdraw(double amount);
}

class SavingsAccount extends BankAccount {
    private static final double MIN_BALANCE = 500;

    public SavingsAccount(double balance) { super(balance); }

    @Override
    public boolean withdraw(double amount) {
        if (balance - amount >= MIN_BALANCE) {
            balance -= amount;
            return true;
        }
        return false;
    }
}
