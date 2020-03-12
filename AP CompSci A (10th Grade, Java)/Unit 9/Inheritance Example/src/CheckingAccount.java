public class CheckingAccount extends BankAccount {

    private int numFree;
    private int overCharge;
    private int transCount;

    public CheckingAccount(double inbalance, int freeIn, int inCharge){
        numFree = freeIn;
        overCharge = inCharge;
        super.deposit(inbalance);
        transCount = 0;
    }

    public void deposit(double amt){
        super.deposit(amt);
        transCount++;
    }

    public void withdraw(double amt){
        super.withdraw(amt);
        transCount++;
    }

    public void deductFees(){
        if(transCount > numFree){
            super.withdraw((transCount - numFree) * overCharge);
            transCount = 0;
        }
        transCount = 0;
    }


}
