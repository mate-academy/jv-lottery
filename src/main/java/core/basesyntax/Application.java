package core.basesyntax;

public class Application {
    private static final int BALL_AMOUNT = 3;

    public static void main(String[] args) {
        Lottery lottery = new Lottery();
        Ball[] balls = new Ball[BALL_AMOUNT];
        for (int ballIndex = 0; ballIndex < BALL_AMOUNT; ballIndex++) {
            balls[ballIndex] = lottery.getRandomBall();
        }
        for (Ball ball : balls) {
            System.out.println(ball);
        }
    }
}
