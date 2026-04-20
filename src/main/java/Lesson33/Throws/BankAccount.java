package Lesson33.Throws;

class BankAccount {
    private double balance; // encapsulated (private)

    // constructor
    public BankAccount(double balance) {
        this.balance = balance;
    }

    // getter
    public double getBalance() {
        return balance;
    }

    // deposit method
    public void deposit(double amount) throws Exception {
        if (amount < 0) {
            throw new Exception("Amount must be positive!");
        }
        balance += amount;
    }

    // withdraw method with throws
    //throws Exception bruges til at håndtere fejl (fx hvis man hæver for mange penge)
    public void withdraw(double amount) throws Exception {
        if (amount > balance) {
            throw new Exception("Not enough money!");
        }
        balance -= amount;
    }
}
