import java.util.ArrayList;

public class Evaluate {
    private ArrayList<String> word = new ArrayList<String>();
    public String findResult(ArrayList<String> w, String guess, String old, String blan) {
        ArrayList<WordFamily> fams = new ArrayList<WordFamily>();
        for (String word : w) {
            String ID = returnBlankString(word, guess);
            boolean found = false;
            if (fams.size() == 0) {
                WordFamily f = new WordFamily(ID, word);
                fams.add(f);
            }
            else {
                for (WordFamily fam : fams) {
                    if (fam.isMatch(ID)) {
                        fam.addWord(word);
                        found = true;
                    }
                }
                if (!found) {
                    WordFamily f = new WordFamily(ID, word);
                    fams.add(f);
                }
            }
        }

        int count = 0;
        int greatestValue = fams.get(0).getCount();
        String ID = fams.get(0).getBlanks();
        word = fams.get(0).getWords();
        for (WordFamily f : fams) {
            if (f.getCount()>greatestValue) {
                greatestValue = f.getCount();
                ID = f.getBlanks();
                word = f.getWords();
                count = 1;
            }
            if (f.getCount()==greatestValue) {
                count++;
            }
        }

        if (count > 1) ID = blan;
        for (WordFamily f : fams) {
            if (f.getBlanks().equals(ID)) word = f.getWords();
        }


        return DisplayWord(old, ID);
    }//takes words and string and returns what to show (w/ all letters)
    public ArrayList<String> findRightWordLength(ArrayList<String> w, int num) {
        ArrayList<String> r = new ArrayList<String>();
        for (String word : w) {
            if (word.length() == num) r.add(word);
        }
        return r;
    } //it returns the words that work for the character number
    public Boolean AreLetters(ArrayList<String> w, int num) {
        for (String word : w) {
            if (word.length() == num) return true;
        }
        return false;
    } //tells if there are words with the given num letters
    public String DisplayWord(String oldword, String newword) {
        int len = oldword.length();
        String fin = "";
        for (int i=0; i<len; i++) {
            if (!(oldword.charAt(i)=='-')) fin += oldword.charAt(i);
            else if (!(newword.charAt(i)=='-')) fin += newword.charAt(i);
            else fin += "-";
        }
        return fin;
    }
    public String returnBlankString(String word, String letter) {
        int len = word.length();
        String fin = "";
        for (int i=0; i<len; i++) {
            if (word.substring(i, i+1).equals(letter)) fin += word.substring(i, i+1);
            else fin += "-";
        }
        return fin;
    } //take word give blank
    public ArrayList<String> findNewWords() {
        return word;
    }

}
