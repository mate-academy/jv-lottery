package core.basesyntax;

public class Application {
    private static final int NUMBER_OF_BALL = 3;

    public static void main(String[] args) {
        // create three balls using class Lottery and print information about them in console
        Lottery[] balls = new Lottery[NUMBER_OF_BALL];
        for (int i = 0; i < balls.length; i++) {
            balls[i] = new Lottery();
            System.out.println(balls[i].getRandomBall());
        }
    }
}
