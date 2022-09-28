package core.basesyntax;

public class Application {
    private static final int NUMBER_OF_BALL = 3;

    public static void main(String[] args) {
        // create three balls using class Lottery and print information about them in console
        Lottery lottery = new Lottery();
        Ball[] randomBall = new Ball[NUMBER_OF_BALL];

        for (Ball ball : randomBall) {
            ball = lottery.getRandomBall();
            System.out.println(ball);
        }
    }
}
