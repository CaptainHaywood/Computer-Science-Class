public class Card {

    private String shortHand;

    public Card(String construct){
        shortHand = construct;
    }

    public String getDescription(){

        if(shortHand.equals("")){
            return("Unknown");
        }

        String suit = shortHand.substring(shortHand.length() - 1, shortHand.length());
        String value = shortHand.substring(0, shortHand.length() - 1);
        int valueNum = 1;
        boolean failure = false;


        try{
            valueNum = Integer.parseInt(value);
        }
        catch(Exception IOException){
            valueNum = 0;
        }

        if (valueNum == 0){
            if(value.equals("A")){
                value = "Ace";
            }
            else if(value.equals("J")){
                value = "Jack";
            }
            else if(value.equals("Q")){
                value = "Queen";
            }
            else if(value.equals("K")){
                value = "King";
            }
            else{
                failure = true;
            }
        }

        if(suit.equals("D")){
            suit = "Diamonds";
        }
        else if(suit.equals("H")){
            suit = "Hearts";
        }
        else if(suit.equals("S")){
            suit = "Spades";
        }
        else if(suit.equals("C")){
            suit = "Clubs";
        }
        else{
            failure = true;
        }

        if(failure == false){
            if (valueNum != 0 && valueNum < 11){
                return(valueNum + " of " + suit);
            }
            else if (valueNum == 0){
                return(value + " of " + suit);
            }
        }
        else{
            return("Unknown");
        }

        return("Unknown");
    }
}
