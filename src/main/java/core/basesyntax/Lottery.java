package core.basesyntax;

import java.util.Random;

public class Lottery {
    static final int MAX_BALL_NUMBER = 100;
    private final ColorSupplier colorSupplier;
    private final Random random;

    public Lottery() {
        this.colorSupplier = new ColorSupplier();
        this.random = new Random();
    }

    public Ball getRandomBall() {
        return new Ball(colorSupplier.getRandomColor(), random.nextInt(MAX_BALL_NUMBER));
    }
}
