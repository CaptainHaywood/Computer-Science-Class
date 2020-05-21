public class APDriver2 {
    public static double checkGuesses(String phrase, int num) {
        int matches = 0;
        int iter = 0;
        while(iter < num){
            String guess = getGuess();
            if (phrase.contains(guess)){
                matches++;
            }
            iter++;
        }
        return matches/num;
    }


}
