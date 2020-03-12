public class Driver {
    public static void main(String[] args) {
        CheckingAccount c1 = new CheckingAccount(1000, 5, 2);
        c1.withdraw(100);
        c1.withdraw(100);
        c1.withdraw(100);
        c1.withdraw(100);
        c1.withdraw(100);
        c1.withdraw(100);
        c1.deductFees();
        System.out.println(c1.getBalance());
    }
}
