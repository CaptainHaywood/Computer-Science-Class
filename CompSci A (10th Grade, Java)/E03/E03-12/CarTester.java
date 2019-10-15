public class CarTester {
    public static void main(String[] args){
        Car van = new Car(25);
        
        van.addGas(25);
        System.out.println(van.getGasInTank());
        van.drive(25);
        System.out.println(van.getGasInTank());
    }
}