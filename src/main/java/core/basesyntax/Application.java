package core.basesyntax;

public class Application {
    static final int numberOfBalls = 3;
    private static Ball ball;

    public static void main(String[] args) {
        for (int i = 0; i < numberOfBalls; i++) {
            ball = new Lottery().getRandomBall();
            System.out.println(ball);
        }
    }
}
