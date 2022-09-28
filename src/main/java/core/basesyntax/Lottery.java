package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int MAX_POSSIBLE_NUMBER = 100;

    private final Random randomGenerator;
    private final ColorSupplier colorSupplier;

    public Lottery() {
        this.randomGenerator = new Random();
        this.colorSupplier = new ColorSupplier();
    }

    public Ball getRandomBall() {
        return new Ball(randomGenerator.nextInt(MAX_POSSIBLE_NUMBER),
                colorSupplier.getRandomColor());
    }
}
