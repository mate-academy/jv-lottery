package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int BALL_MAX_NUM = 100;
    private final ColorSupplier colorSupplier;
    private final Random random;

    public Lottery() {
        this.colorSupplier = new ColorSupplier();
        this.random = new Random();
    }

    public Ball getRandomBall() {
        return new Ball(colorSupplier.getRandomColor(), getRandomBallNumber());
    }

    private int getRandomBallNumber() {
        return random.nextInt(BALL_MAX_NUM);
    }
}
