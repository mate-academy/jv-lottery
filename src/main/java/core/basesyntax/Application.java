package core.basesyntax;

public class Application {
    private static final int NUMBER_OF_LOTTERIES = 3;

    public static void main(String[] args) {
        // create three balls using class Lottery and print information about them in console
        Lottery[] lotteries = new Lottery[NUMBER_OF_LOTTERIES];
        for (int i = 0; i < NUMBER_OF_LOTTERIES; i++) {
            lotteries[i] = new Lottery();
            System.out.println(lotteries[i].getRandomBall());
        }
    }
}
