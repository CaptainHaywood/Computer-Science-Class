public class BugTester{
    public static void main(String[] args){
           Bug insect = new Bug(0);
           print("Init pos:" + insect.getPosition());
           insect.move(); 
           print("Exp pos 1, real pos: " + insect.getPosition());
           insect.move(); 
           print("Exp pos 2, real pos: " + insect.getPosition());
           insect.turn();
           insect.move(); 
           print("Exp pos 1, real pos: " + insect.getPosition());
           insect.move(); 
           print("Exp pos 0, real pos: " + insect.getPosition());
    }

    
    public static void print(String str){
        System.out.println(str);
    }

}