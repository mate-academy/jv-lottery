package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int BALL_COUNT = 100;
    private final ColorSupplier colorSupplier;
    private final Random random;

    public Lottery() {
        this.random = new Random();
        this.colorSupplier = new ColorSupplier();
    }

    public Ball getRandomBall() {
        String randomColor = colorSupplier.getRandomColor();
        int randomNumber = random.nextInt(BALL_COUNT) + 1;
        return new Ball(randomColor, randomNumber);
    }
}
