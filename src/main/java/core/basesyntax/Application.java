package core.basesyntax;

public class Application {
    public static final int numberOfBalls = 3;

    public static void main(String[] args) {
        ColorSupplier colorSupplier = new ColorSupplier();
        Lottery lottery = new Lottery(colorSupplier);

        for (int i = 0; i < numberOfBalls; i++) {
            Ball ball = lottery.getRandomBall();
            System.out.println(ball.toString());
        }
    }
}
