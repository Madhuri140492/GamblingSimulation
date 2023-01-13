import java.util.Random;

public class GamblingGame {

    /*UC1
     * As a Gambler, would start with a stake of $100 every day and bet $1 every game.*/

    public static final int STAKE = 100; // GAMBLER starts with stake of $100
    public static final int BETVALUE = 1; //Gambler bets one dollar each game

    static int newStake = STAKE;

    /*UC2
     * As a Gambler make $1 bet so either win or loose $1*/

    public static void winLoose(int r){

        while (true) {
            if (r == BETVALUE) {

                System.out.println("Gambler Wins!");
                newStake++;
                System.out.println("New Amount Inhand: "+newStake);

                /*UC3 gambler resigns if he earns 50$ profit
                 * As a Calculative Gambler if won or lost 50% of the stake, would resign for the day*/

                if (newStake == 150){
                    System.out.println("Gambler resigns as he wins 50% more of his stake");
                    return;
                }
            }

            else {

                System.out.println("Gambler Loose!");
                newStake--;
                System.out.println("New Amount Inhand: "+newStake);

                /*UC3 gambler resigns if he loses 50$
                 *As a Calculative Gambler if won or lost 50% of the stake, would resign for the day*/

                if (newStake == 50){
                    System.out.println("Gambler resigns as he looses 50%  of his stake");
                    return;
                }
            }
        }
    }

    public static void main(String[] args) {

        System.out.println("Welcome to Gambling Simulation Problem.");

        Random rand = new Random();
        int r = rand.nextInt(2);
        winLoose(r);
    }
}

    //After 20 days of playing every day would like to know the total amount won or lost.
    void monthGame () {
        for (int day = 0; day < 20; day++) {
            System.out.println("Day " + (day + 1) + " Game starts!");// Beginning of the game
            winLoose(day);
            System.out.println("Game Ends for today!");// End of the game
            System.out.println();
        }
    }
    public static void main (String[]args){

        System.out.println("Welcome to Gambling Simulation Problem.");

        Random rand = new Random();
        int j = rand.nextInt(2);
        GamblingGame gmg = new GamblingGame();
        gmg.monthGame();
        System.out.println("Won days");
        for (int i: winCountArr ) {
            System.out.print(i + " ");
        }
        System.out.println("");
        System.out.println("lost days");
        for (int i: looseCountArr ) {
            System.out.print(i + " ");
        }
    }
}