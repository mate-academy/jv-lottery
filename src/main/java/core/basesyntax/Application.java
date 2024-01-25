package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        final int NUM_BALLS = 3;
        Lottery lottery = new Lottery();
        for (int i = 0; i < NUM_BALLS; i++) {
            Ball ball = lottery.getRandomBall();
            System.out.println(ball);
        }
        // create three balls using class Lottery and print information about them in console
    }
}
