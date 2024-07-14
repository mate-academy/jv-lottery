package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int MAX_BALL_NUMBER_BOUND = 101;
    private final Random random = new Random();
    private ColorSupplier colorSupplier;

    public Lottery(ColorSupplier colorSupplier) {
        this.colorSupplier = colorSupplier;
    }

    public Ball getRandomBall() {
        Color color = colorSupplier.getRandomColor();
        int number = random.nextInt(MAX_BALL_NUMBER_BOUND);
        return new Ball(color.name(), number);
    }
}
