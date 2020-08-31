import java.util.ArrayList;
import java.util.regex.*;

public class FamilyCreator {

    private ArrayList<WordFamilies> wordFams;

    private void familyEval(ArrayList<String> possibleWords, String inputCharacter){
        //var init
        char inputChar = inputCharacter.charAt(0);
        boolean done = false;
        int wordCount = possibleWords.size();
        ArrayList<String> validWords = new ArrayList<>();
        ArrayList<String> collapsedWords = new ArrayList<>();
        //scan possibleWords for only words containing inputChar and put them into a separate ArrayList
        for (int i = 0; i < wordCount; i++) {
            String word = possibleWords.get(i);
            if(word.contains(inputCharacter)){
                validWords.add(word);
            }
        }
        //Expands each string in validWords and collapses them into dashes + the input char
        for (int i = 0; i < validWords.size(); i++){
            String toCollapse = validWords.get(i);
            char[] charArray = toCollapse.toCharArray();
            for(int y = 0; y < charArray.length; y++){
                if(charArray[i] == inputChar){
                    boolean doNothing = true;
                }
                else{
                    charArray[i] = '-';
                }

            }
            toCollapse = String.valueOf(charArray);
            collapsedWords.add(toCollapse);
        }
        //Compresses matching collapsedWords entries into unique entries (e.g. two instances of -inputChar-- become one)
        ArrayList<String> compressedOptions = new ArrayList<>();
        for (int i = 0; i < collapsedWords.size(); i++){
            if(!compressedOptions.contains(collapsedWords.get(i))){
                compressedOptions.add(collapsedWords.get(i));
            }
        }
    }

    public ArrayList<WordFamilies> getFamilies(){
        return wordFams;
    }

}
