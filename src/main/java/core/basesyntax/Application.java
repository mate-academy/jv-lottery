package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        Lottery lottery = new Lottery();
        final int lotteryBallCount = 3;
        /* if I make a constant like (final int LOTTERY_BALL_COUNT = 3;)
        maven does not pass such code because it considers it incorrect */

        for (int i = 0; i < lotteryBallCount; i++) {
            System.out.println(lottery.getRandomBall());
        }
    }
}
