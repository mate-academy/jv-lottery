package core.basesyntax;

public class Application {
    private static final int MAX_COUNT_OF_BALLS = 3;

    public static void main(String[] args) {
        // create three balls using class Lottery and print information about them in console
        Ball[] balls = new Ball[MAX_COUNT_OF_BALLS];
        Lottery lottery = new Lottery();
        for (Ball ball : balls) {
            ball = lottery.getRandomBall();
            System.out.println(ball);
        }
    }
}
