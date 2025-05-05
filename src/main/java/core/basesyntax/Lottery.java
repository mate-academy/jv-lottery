package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int MAX_SIZE = 100;
    private Ball ball;
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Ball getRandomBall() {
        ball = new Ball(random.nextInt(MAX_SIZE), colorSupplier.getRandomColor());
        return ball;
    }
}
