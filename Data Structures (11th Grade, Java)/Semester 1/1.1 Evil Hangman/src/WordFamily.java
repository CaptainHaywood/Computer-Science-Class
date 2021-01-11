import java.util.ArrayList;

public class WordFamily {
    private ArrayList<String> words = new ArrayList<String>();
    private String ID;

    public WordFamily(String id, String word1) {
        words.add(word1);
        ID = id;
    }

    public ArrayList<String> getWords() {return words;}
    public int getCount() {return words.size();}
    public String getBlanks() {return ID;}
    public void addWord(String toAdd){
        words.add(toAdd);
    }
    public boolean isMatch(String check) {
        if (ID.equals(check)) return true;
        else return false;
    }


}
