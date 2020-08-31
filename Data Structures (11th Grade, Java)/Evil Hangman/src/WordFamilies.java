import java.util.ArrayList;

public class WordFamilies {
    private ArrayList<String> words;
    private int wordCount;

    public void addWord(String toAdd){
        words.add(toAdd);
    }

    public ArrayList<String> getWords(){
        return words;
    }

    public int getCount(){
        return wordCount;
    }
}

