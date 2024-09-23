package core.basesyntax;

public class Application {
    private static final int LIMIT_ARRAY = 3;

    public static void main(String[] args) {
        Lottery lottery = new Lottery();
        Ball[] balls = new Ball[LIMIT_ARRAY];

        for (int i = 0; i < LIMIT_ARRAY; i++) {
            balls[i] = lottery.getRandomBall();
        }

        for (Ball ball : balls) {
            System.out.println(ball);
        }
    }
}
