package core.basesyntax;

public class Application {
    private static final int NUMBER_OF_BALLS = 3;
    private static final Lottery lottery = new Lottery();

    public static void main(String[] args) {
        Ball[] balls = new Ball[NUMBER_OF_BALLS];
        for (int i = 0; i < NUMBER_OF_BALLS; i++) {
            balls[i] = lottery.getRandomBall();
        }

        for (Ball ball : balls) {
            System.out.println(ball);
        }
    }
}
