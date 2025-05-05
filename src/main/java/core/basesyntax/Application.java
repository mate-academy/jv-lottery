package core.basesyntax;

public class Application {
    private static final int NUMBER_OF_BALLS = 3;

    public static void main(String[] args) {
        Lottery lottery = new Lottery();
        Ball[] balls = new Ball[NUMBER_OF_BALLS];

        for (int i = 0; i < 3; i++) {
            balls[i] = lottery.getRandomBall();
        }

        for (int i = 0; i < balls.length; i++) {
            System.out.println(balls[i].toString());
        }
        // create three balls using class Lottery and print information about them in console
    }
}
