package core.basesyntax.suppliers;

import core.basesyntax.model.Ball;

public class BallSupplier {
    private final Lottery lottery = new Lottery();

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
