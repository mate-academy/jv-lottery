package core.basesyntax;

public class Application {

    private static final int NUMBER_USERS = 3;

    public static void main(String[] args) {

        Lottery [] lotteries = new Lottery[NUMBER_USERS];

        for (int i=0; i < lotteries.length; i++) {
            lotteries[i] = new Lottery();
        }
        for (Lottery lot : lotteries){
            System.out.println(lot.getRandomBall().toString());
        }

        // create three balls using class Lottery and print information about them in console
    }
}
