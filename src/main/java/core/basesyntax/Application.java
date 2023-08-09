package core.basesyntax;

public class Application {
    private static final Lottery lottery = new Lottery();

    private static final int NUMBER_OF_BALLS = 3;

    public static void main(String[] args) {
        for (int i = 0; i < NUMBER_OF_BALLS; i++) {
            Ball ball = lottery.getRandomBall();
            System.out.println(ball);
        }
    }
}
