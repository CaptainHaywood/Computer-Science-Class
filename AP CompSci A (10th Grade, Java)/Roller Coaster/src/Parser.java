public class Parser {
    public static void parseCMD(String command, Coaster rC){
        String[] split = command.split(" ", 3);
        String action = split[0];
        if(action.equals("assign")){
            int numPeople = Integer.parseInt(split[1]);
            String pos = split[2];
            boolean side;
            if(pos.equals("front")){
                side = true;
            }
            else{
                side = false;
            }
            rC.addGroup(side, numPeople);
        }
        else if(action.equals("show")){
            rC.printCoaster();
        }
        else if(action.equals("exit")){
            System.exit(0);
        }
    }
}
