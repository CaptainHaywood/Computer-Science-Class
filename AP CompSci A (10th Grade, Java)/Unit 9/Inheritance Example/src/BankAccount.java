public class BankAccount {
    private double balance;

    /**
     * Default constructor
     */
    public BankAccount() {
        balance = 0;
    }

    /**
     * Constructor that takes in an initial balance
     * @param inBalance the initial balance
     */
    public BankAccount(double inBalance) {
        balance = inBalance;
    }

    /**
     * Deposits money to the account
     * @param amt the amount to deposit
     */
    public void deposit(double amt){balance += amt;}

    public void withdraw(double amt){balance -= amt;}

    /**
     * Returns the balance of the account
     * @return the balance of the account
     */
    public double getBalance() {
        return balance;
    }
}