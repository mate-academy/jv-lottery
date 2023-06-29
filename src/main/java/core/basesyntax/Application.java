package core.basesyntax;

public class Application {
    public static final int NUMBER_OF_BALL = 3;

    public static void main(String[] args) {
        // create three balls using class Lottery and print information about them in console
        Lottery lottery = new Lottery();
        Ball[] balls = new Ball[NUMBER_OF_BALL];
        for (int i = 0; i < balls.length; i++) {
            balls[i] = lottery.getRandomBall();
        }

    }
}
