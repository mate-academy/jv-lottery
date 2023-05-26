package core.basesyntax.suppliers;

import core.basesyntax.model.Ball;

public class BallService {
    private final int maxNumber = 100;
    private final Lottery lottery = new Lottery(new ColorSupplier(), maxNumber);

    public Ball[] createBalls(int numberOfBalls) {
        Ball[] balls = new Ball[numberOfBalls];
        for (int i = 0; i < numberOfBalls; i++) {
            balls[i] = lottery.getRandomBall();
        }
        return balls;
    }

    public void printBalls(Ball[] balls) {
        for (Ball ball : balls) {
            System.out.println(ball);
        }
    }
}
