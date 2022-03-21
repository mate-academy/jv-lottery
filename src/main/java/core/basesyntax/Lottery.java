package core.basesyntax;

import java.util.Random;

public class Lottery {
    private Random random;
    private ColorSupplier colorSupplier;

    public Lottery() {
        random = new Random();
        colorSupplier = new ColorSupplier();
    }

    public Ball getRandomBall() {
        int value = random.nextInt(100);
        Ball ball = new Ball(colorSupplier.getRandomColor(), value);
        return ball;
    }
}
