package core.basesyntax;

import java.util.Random;

public class Lottery {
    private final ColorSupplier colorSupplier;
    private final Random random;
    private final int maxPossibleNumber;

    public Lottery(ColorSupplier colorSupplier, Random random, int maxPossibleNumber) {
        this.colorSupplier = colorSupplier;
        this.random = random;
        this.maxPossibleNumber = maxPossibleNumber;
    }

    public Ball getRandomBall() {
        return new Ball(colorSupplier.getRandomColor(), random.nextInt(maxPossibleNumber));
    }
}
