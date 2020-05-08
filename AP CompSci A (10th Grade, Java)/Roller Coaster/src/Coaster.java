import java.util.ArrayList;

public class Coaster {
    private ArrayList<String> coaster;
    private int topIndex;
    private int botIndex;
    private int groupNum;
    public Coaster(){
        coaster = new ArrayList<String>();
        int iter = 0;
        while(iter < 20){
            coaster.add("0");
            iter++;
        }
        topIndex = 0;
        botIndex = 19;
        groupNum = 1;
    }

    public void printCoaster(){
        int index = 10;
        while(index < 20){
            String lIndex = coaster.get(index);
            String rIndex = coaster.get(index + 1);
            coaster.set(index, rIndex);
            coaster.set(index + 1, lIndex);
            index++;
            index++;
        }
        String workingStr = coaster.toString();
        workingStr = workingStr.replaceAll("\\[", "");
        workingStr = workingStr.replaceAll("\\]", "");
        workingStr = workingStr.replaceAll(", ", ",");
        StringBuilder result = new StringBuilder(workingStr);
        int n = 4;
        for (int i = n - 1; i < workingStr.length(); i += n) {
            result.setCharAt(i, '\n');
        }
        workingStr = result.toString();
        workingStr = workingStr.replaceAll(",", "");
        System.out.println(workingStr);


    }

    public void addGroup(boolean side, int num){
        if(num > 10){
            return;
        }
        if(groupNum > 9){
            //System.out.println("Too many groups - no more can be added!");
            return;
        }
        if(!coaster.contains("0")){
            //System.out.println("The coaster is full!");
            return;
        }
        int openSeats = 0;
        int iter = 0;
        while (iter < 20){
            if(coaster.get(iter).equals("0")){
                openSeats++;
            }
            iter++;
        }
        if(num > openSeats){
            //System.out.println("There are too few spaces to accommodate that group!");
            return;
        }
        if(side == true){
            iter = 0;
            while (iter < num){
                coaster.set(topIndex, String.valueOf(groupNum));
                topIndex++;
                iter++;
            }
            groupNum++;
        }
        else if(side == false){
            iter = 0;
            while (iter < num){
                coaster.set(botIndex, String.valueOf(groupNum));
                botIndex--;
                iter++;
            }
            groupNum++;
        }
    }
}
