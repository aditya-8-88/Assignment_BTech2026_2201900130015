class Account {
    private double balance;
    
    public Account(double balance) { this.balance = balance; }

    public boolean withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            return true;
        }
        return false;
    }

    public void deposit(double amount) { balance += amount; }

    public double getBalance() { return balance; }
}

class ATM {
    private Account account;
    
    public ATM(Account account) { this.account = account; }

    public boolean withdrawCash(double amount) { return account.withdraw(amount); }

    public void depositCash(double amount) { account.deposit(amount); }
}
