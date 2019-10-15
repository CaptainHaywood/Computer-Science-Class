

public class Banking {
    private double balance;
    
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
    
    public void BankAccountTester(){
        deposit(1000);
        withdraw(500);
        withdraw(400);
        System.out.println(balance);
        System.out.println("Expected: 100.");
    }
    
    public void addInterest(double rate){
        balance = balance * rate;
    }
}