public class Driver {
    public static void main(String[] args) {
        BulgarianSolitaire game = new BulgarianSolitaire();

        // create random piles
        game.generateRandomPiles();

        // output piles
        System.out.println(game.getPiles());

        // for testing purposes, play 5 rounds first to see if that works
        for(int i=1; i<=5; i++) {
            game.playOneRound();
            System.out.println(game.getPiles());
        }
    }
}