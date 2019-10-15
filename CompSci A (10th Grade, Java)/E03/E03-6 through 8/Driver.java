public class Driver{
    public static void main(String[] args){
        Banking atm = new Banking();
        Banking atm2 = new Banking();
        
        atm.deposit(100);
        System.out.println("ATM1 Balance: " + atm.returnBalance());
        System.out.println("ATM2 Balance: " + atm2.returnBalance());
        
        atm.transfer(atm, atm2, atm.returnBalance());
        System.out.println("ATM1 Balance: " + atm.returnBalance());
        System.out.println("ATM2 Balance: " + atm2.returnBalance());
    }
}