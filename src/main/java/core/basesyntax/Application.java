package core.basesyntax;

public class Application {
    private static final int NUMBER_OF_BALLS = 3;

    public static void main(String[] args) {
        // Creates three balls using class Lottery and print information about them in console
        for (int i = 0; i < NUMBER_OF_BALLS; i++) {
            Lottery lotteryBall = new Lottery();
            System.out.println(lotteryBall.getRandomBall());
        }
    }
}
