import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Driver {
    public static void main(String[] args) throws Exception {
        ArrayList<String> words = new ArrayList<>();
        int guesses;
        int numChar;
        String blanks;
        Scanner in = new Scanner(System.in);

        File myFile = new File("dictionary.txt");
        Scanner in2 = null;
        try {
            in2 = new Scanner(myFile);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        while (in2.hasNextLine()) {
            String line = in2.nextLine();
            words.add(line);
        }

        boolean play = true;
        boolean game = true;
        boolean run = true;
        boolean rT = false;
        int num;
        boolean loop;
        do {
            guesses = 0;
            numChar = 0;
            do {
                GameLoop g = new GameLoop(words);
                do {
                    System.out.print("Word length? ");
                    numChar = in.nextInt();
                    in.nextLine();
                }while(!g.chooseNumLetters(numChar));
                do {
                    System.out.print("Number of guesses? ");
                    guesses = in.nextInt();
                    in.nextLine();
                    if (guesses<1) {
                        System.out.println("Error - try again.");
                    }
                }while(guesses<1);
                g.setLives(guesses);
                blanks = g.getBlanks();
                loop = true;
                do {
                    System.out.print("Running total (y/n)? ");
                    String runningTotal = in.nextLine();
                    if (runningTotal.equals("y")) {
                        rT = true;
                        loop = false;
                    }
                    else if (runningTotal.equals("n")) {
                        loop = false;
                    }
                    else System.out.println("Error - try again.");
                } while (loop);
                System.out.println("");
                do {
                    System.out.println("Remaining guesses: " + g.getTurns());
                    System.out.print("Guesses: ");
                    g.guessedLetters();
                    if (rT) {
                        g.runningTotal();
                    }
                    System.out.println(blanks);
                    loop = true;
                    String guess;
                    do {
                        System.out.print("Guess? ");
                        guess = in.nextLine();
                    } while (!g.chooseGuess(guess));
                    g.guessLetter(guess);
                    blanks = g.getBlanks();
                    if (blanks.indexOf(guess.charAt(0))==-1) {
                        System.out.println("Incorrect");
                    }
                    else {
                        System.out.println("Correct");
                    }
                    System.out.println("");
                } while (!g.isFinished());

                if (g.gameWon()) {
                    System.out.println("You won! The word was: " + g.getWord());
                }
                else {
                    System.out.println("You lost!");
                }
                game = false;
            } while (game);

            System.out.print("Play again (y/n)? ");
            String r2 = in.nextLine();
            if (r2.equals("n")) play = false;
        }while (play);

    }
}
