package core.basesyntax;

public class Application {
    private static final int NUMBER_OF_BALLS = 3;

    public static void main(String[] args) {
        Lottery[] lotteries = new Lottery[NUMBER_OF_BALLS];
        for (int i = 0; i < NUMBER_OF_BALLS; i++) {
            lotteries[i] = new Lottery();
            System.out.println(lotteries[i].getRandomBall());
        }
        //        Lottery[] lotteries = {new Lottery(), new Lottery(), new Lottery()};
        //        for (Lottery lottery : lotteries) {
        //            System.out.println(lottery.getRandomBall());
        //        }
        // create three balls using class Lottery and print information about them in console
    }
}
