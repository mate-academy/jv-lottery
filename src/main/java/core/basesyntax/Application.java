package core.basesyntax;

public class Application {
    private static final int NUMBER_OF_BALLS = 3;

    public static void main(String[] args) {
        Ball[] balls = new Ball[NUMBER_OF_BALLS];
        Lottery lottery = new Lottery();
        for (Ball ball : balls) {
            ball = lottery.getRandomBall();
            System.out.println(ball.toString());
        }
    }
}
