package core.basesyntax;

public class Application {
    private static final int NUMBER_OF_BALLS = 3;

    public static void main(String[] args) {
        // create three balls using class Lottery and print information about them in console
        Ball[] balls = new Ball[NUMBER_OF_BALLS];
        Lottery lottery = new Lottery();
        for (int i = 0; i < NUMBER_OF_BALLS; i++) {
            balls[i] = lottery.getRandomBall();
            System.out.println(balls[i]);
        }
    }
}
