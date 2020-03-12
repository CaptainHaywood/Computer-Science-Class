public class SavingsAccount extends BankAccount {

    private double rate;

    public SavingsAccount(double inBalance, double inRate) {
        rate = inRate;
        deposit(inBalance);
    }

    public SavingsAccount(double inRate) {
        rate = inRate;
    }

    public void addInterest() {
        double interest = getBalance() * rate;
        deposit(interest);
    }
}