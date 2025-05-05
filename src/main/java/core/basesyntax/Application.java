package core.basesyntax;

public class Application {
    private static final int LOTTERY_BALLS = 3;

    public static void main(String[] args) {
        Lottery lottery = new Lottery();
        Ball ball = lottery.getRandomBall();

        for (int i = 0; i < LOTTERY_BALLS; i++) {
            ball.toString();
        }
    }
}
