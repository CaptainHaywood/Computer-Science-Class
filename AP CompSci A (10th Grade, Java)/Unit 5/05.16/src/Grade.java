public class Grade {

    private String lGrade = "NA";

    public Grade(String letter){
        lGrade = letter;
    }

    public double getNumericGrade(){
        double mainScore = 5;
        String character = lGrade.substring(0,1);
        String modifier;

        try{
            modifier = lGrade.substring(1,2);
        }
        catch (Exception IOException){
            modifier = "";
        }

        if (character.equals("A")) {
            mainScore = 4;
        }
        else if (character.equals("B")){
            mainScore = 3;
        }
        else if (character.equals("C")){
            mainScore = 2;
        }
        else if (character.equals("D")){
            mainScore = 1;
        }
        else if (character.equals("F")){
            mainScore = 0;
            return mainScore;
        }

        if (character.equals("A") && modifier.equals("+")){
            return mainScore;
        }
        else if (character.equals("A") && modifier.equals("")){
            return mainScore;
        }

        if (modifier.equals("")) {
            return mainScore;
        }
        else if (modifier.equals("+")){
            return mainScore + 0.3;
        }
        else if (modifier.equals("-")){
            return mainScore - 0.3;
        }
        return mainScore;
    }
}
