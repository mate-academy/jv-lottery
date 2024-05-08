package core.basesyntax;

public class Application {
    private static final int NUM_ITERATION = 3;

    public static void main(String[] args) {
        for (int i = 0; i < NUM_ITERATION; i++) {
            Lottery lottery = new Lottery();
            Ball ball = lottery.getRandobBall();
            System.out.println(ball);
        }
    }
}
