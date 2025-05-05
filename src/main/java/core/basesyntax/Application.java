package core.basesyntax;

public class Application {
    private static final int BALL_COUNT = 3;

    public static void main(String[] args) {
        Lottery lottery = new Lottery();

        for (int i = 0; i < BALL_COUNT; i++) {
            Ball ball = lottery.getRandomBall();
            System.out.println(ball);
        }
    }
}
