public class Banking {
    private double balance;
    
    public Banking (double initBalance) {
        balance = 100;
    }
    
    public void deposit(double amount) {
        balance = balance + amount;
    }
    
    public void withdraw(double amount){
        balance = balance - amount;
    }
    
    public void transfer(Banking origin, Banking destination, double value){
        origin.withdraw(value);
        destination.deposit(value);
    }
    
    public double returnBalance() {
        return balance;
    }
}