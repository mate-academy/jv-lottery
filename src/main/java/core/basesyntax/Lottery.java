package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int MAX_BOUND = 101;
    private static final int MIN_BOUND = 1;
    private final ColorSupplier colorSupplier = new ColorSupplier();
    private final Random random = new Random();

    public Ball getRandomColor() {
        int ballNumber = random.nextInt(MIN_BOUND, MAX_BOUND);
        String ballColor = colorSupplier.getRandomColor();
        return new Ball(ballNumber, ballColor);
    }
}
