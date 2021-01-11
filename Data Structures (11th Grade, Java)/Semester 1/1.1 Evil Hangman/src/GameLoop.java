import java.util.ArrayList;

public class GameLoop {
    private Integer failCount = 0;
    private Integer lives;
    private int numLetters;
    private String completeBlanks;
    private String origBlanks;
    private ArrayList<String> possibleWords = new ArrayList<String>();
    private ArrayList<String> LettersGuessed = new ArrayList<String>();

    public GameLoop(ArrayList<String> words) {
        possibleWords = words;
    }
    public void setLives(int l) { lives = l; }
    public Boolean isFinished() {
        if (gameWon() || lives == 0) return true;
        else return false;
    }
    public Boolean gameWon() {
        if (completeBlanks.indexOf('-') == -1) return true;
        else return false;
    }
    public int getTurns() {return lives;}
    public String getWord() {
        return possibleWords.get(0);
    }
    public void guessedLetters() {
        System.out.println(LettersGuessed);
    }

    public Boolean chooseNumLetters(int letters) {
        Evaluate e = new Evaluate();
        if (e.AreLetters(possibleWords, letters)) {
            numLetters = letters;
            possibleWords = e.findRightWordLength(possibleWords, letters);
            String ans = "";
            for (int i = 1; i <= letters; i++) {
                ans+="-";
            }
            completeBlanks = ans;
            origBlanks = ans;
            return true;
        }
        else {
            System.out.println("Error - try again.");
            return false;
        }
    }

    public void guessLetter(String letter) {
        LettersGuessed.add(letter);
        Evaluate e = new Evaluate();
        completeBlanks = e.findResult(possibleWords, letter, completeBlanks, origBlanks);
        possibleWords = e.findNewWords();
        if (completeBlanks.indexOf(letter.charAt(0))==-1) {
            lives--;
            failCount++;
        }
    }
    public String getBlanks() { return completeBlanks; }

    public void runningTotal() {
        System.out.println("Running total: " + possibleWords.size());
    }
    public boolean chooseGuess(String guess) {
        boolean check = true;
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        char[] ch = guess.toCharArray();
        if (ch.length > 1)  check = false;
        else if (alphabet.indexOf(ch[0]) == -1) check = false;
        else if (LettersGuessed.contains(guess)) check = false;

        if (check == false) System.out.println("Error - try again.");
        return check;
    }
}
