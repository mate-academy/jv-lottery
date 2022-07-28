package core.basesyntax;

public class Application {
    static final int NUMBER_OF_BALLS = 3;

    public static void main(String[] args) {
        // create three balls using class Lottery and print information about them in console
        Ball[] balls = new Ball[NUMBER_OF_BALLS];
        for (Ball ball : balls) {
            ball = new Lottery().getRandomBall();
            System.out.println(ball.toString());
        }
    }
}
