package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        Lottery lottery = new Lottery();
        final int LOTTERY_BALL_COUNT = 3;

        for (int i = 0; i < LOTTERY_BALL_COUNT; i++) {
            System.out.println(lottery.getRandomBall());
        }
    }
}