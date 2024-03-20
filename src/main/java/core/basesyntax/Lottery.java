package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int MAX_SIZE = 101;
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Ball getRandomBall() {
        return new Ball(colorSupplier.getRandomColor(), random.nextInt(MAX_SIZE));
    }

   public Ball[] createBalls(int countBalls) {
        Ball[] balls = new Ball[countBalls];
        for (int i = 0; i < countBalls; i++) {
            balls[i] = getRandomBall();
        }
        return balls;
    }
}

