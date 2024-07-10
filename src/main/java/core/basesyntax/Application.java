package core.basesyntax;

public class Application {
    private static final int NUMBER_OF_BALLS = 3;

    public static void main(String[] args) {
        Lottery lottery = new Lottery();
        /* if I make a constant like (final int LOTTERY_BALL_COUNT = 3;)
        maven does not pass such code because it considers it incorrect */

        for (int i = 0; i < NUMBER_OF_BALLS; i++) {
            System.out.println(lottery.getRandomBall());
        }
    }
}
