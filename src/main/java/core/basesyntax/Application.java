package core.basesyntax;

public class Application {
    private static final int NUM_BALLS = 3;

    public static void main(String[] args) {

        Lottery lottery = new Lottery();
        for (int i = 0; i < NUM_BALLS; i++) {
            Ball ball = lottery.getRandomBall();
            System.out.println(ball);
        }
        // create three balls using class Lottery and print information about them in console
    }
}
