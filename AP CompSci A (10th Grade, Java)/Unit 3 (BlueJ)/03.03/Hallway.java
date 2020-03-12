public class Hallway{
    
    boolean switchOneState = false;
    boolean switchTwoState = false;
    boolean lampState = false;
    
    public void toggleSwitchOne(){
        switchOneState = !switchOneState;
        lampState = !lampState;
    }
    
    public void toggleSwitchTwo(){
        switchTwoState = !switchTwoState;
        lampState = !lampState;
    }
    
    public boolean getSwitchOneState(){
        return switchOneState;
    }
    
    public boolean getSwitchTwoState(){
        return switchTwoState;
    }
    
    public boolean getLampState(){
        return lampState;
    }
    
    public void circuitTester(){
        print("Flipping switch one (false > true)");
        print("Expected output: true false true");
        toggleSwitchOne();
        printState();
        print("\nFlipping switch two (false > true)");
        print("Expected output: true true false");
        toggleSwitchTwo();
        printState();
        print("\nFlipping switch one (true > false)");
        print("Expected output: false true true");
        toggleSwitchOne();
        printState();
        print("\nFlipping switch two (true > false)");
        print("Expected output: false false false");
        toggleSwitchTwo();
        printState();
    }
    
    private void print(String str){
        System.out.println(str);
    }
    
    private void printState(){
        print("Switch One state: " + switchOneState);
        print("Switch Two state: " + switchTwoState);
        print("Lamp state: " + lampState);
    }
}