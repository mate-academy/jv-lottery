package core.basesyntax;

public class Application {
    private static final int NUMBER_OF_BALLS = 3;

    public static void main(String[] args) {
        for (int i = 1; i <= NUMBER_OF_BALLS; i++) {
            Ball ball = Lottery.getRandomBall();
            System.out.println("Ball " + i + ": " + ball);
        }
    }
}
