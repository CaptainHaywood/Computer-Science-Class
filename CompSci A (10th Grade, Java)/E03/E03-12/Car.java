public class Car {
    
    double fuelEff;
    double fuel = 0;
    
    public Car(double efficiency){
        fuelEff = efficiency;
    }
    
    public void drive(double miles){
        double gasLost = miles / fuelEff;
        fuel = fuel - gasLost;
    }
    
    public double getGasInTank(){
        return fuel;
    }
    
    public void addGas(double gas){
        fuel = fuel + gas;
    }
}