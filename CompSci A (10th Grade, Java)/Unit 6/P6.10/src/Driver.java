import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int game1W = 0;
        int game2W = 0;
        int game1L = 0;
        int game2L = 0;
        int diceRoll = 0;
        int count = 0;
        int rolls = 0;
        int result = 0;
        int result2 = 0;
        boolean win = false;

        while(count != 1000000){
            System.out.println("ITERATION " + count);
            win = false;
            rolls = 0;
            while(rolls != 4){
                result = getRandomNumber(1,6);
                if(result == 6){
                    win = true;
                }
                rolls++;
            }
            if(win == true){
                game1W++;
            }
            else{
                game1L++;
            }
            count++;
        }

        count = 0;
        win = false;
        rolls = 0;
        while(count != 1000000){
            System.out.println("ITERATION " + count);
            win = false;
            rolls = 0;
            while(rolls!= 24){
                result = getRandomNumber(1,6);
                result2 = getRandomNumber(1,6);
                if(result == 6 && result2 == 6){
                    game2W++;
                }
                else{
                    game2L++;
                }
                rolls++;
            }
            count++;
        }
        System.out.println("G1 Wins: " + game1W);
        System.out.println("G1 Losses: " + game1L);
        System.out.println("G2 Wins: " + game2W);
        System.out.println("G2 Losses: " + game2L);
    }
    private static int getRandomNumber(int min, int max){
        return (int)(Math.random() * ((max - min) + 1)) + min;
    }
}
